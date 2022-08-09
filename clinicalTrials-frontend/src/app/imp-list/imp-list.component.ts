import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Observable } from 'rxjs';
import { AcListComponent } from '../ac-list/ac-list.component';
import { Imp } from '../classes/imp';
import { ImpService } from '../imp.service';
import { TrialDetailsComponent } from '../trial-details/trial-details.component';

@Component({
  selector: 'app-imp-list',
  templateUrl: './imp-list.component.html',
  styleUrls: ['./imp-list.component.css'],
  host: {
    class: 'list-container'
  },
})
export class ImpListComponent implements OnInit {
  imps: Imp[] = [];
  allImps: Imp[] = [];
  term = '';

  constructor(private impService: ImpService, private dialog: MatDialog, private _snackBar: MatSnackBar) { }

  ngOnInit() {
    this.loadData();
  }

  loadData() {
    this.impService.getImps()
      .subscribe(
        data => {
          this.imps = data
          this.allImps = data
        },
        error => { this._snackBar.open(error, 'Close'); });
  }

  search(value: string): void {
    value = value.toLowerCase()
    this.imps = this.allImps.filter((val) =>
      val.eudraCTNumber.toLowerCase().includes(value)
    ).concat(this.allImps.filter((val) =>
      val.routesOfAdm.toLowerCase().includes(value))).concat(this.allImps.filter((val) =>
        val.tradeName.toLowerCase().includes(value))).concat(this.allImps.filter((val) =>
          val.productName.toLowerCase().includes(value))).concat(this.allImps.filter((val) =>
            val.impRole.toLowerCase().includes(value))).concat(this.allImps.filter((val) =>
              val.countryHasMarketingAuth.toLowerCase().includes(value))).concat(this.allImps.filter((val) =>
                val.pharmForm.toLowerCase().includes(value)));

    const key = 'impId';
    this.imps = [...new Map(this.imps.map(item =>
      [item[key], item])).values()];
  }

  showActiveSubstances(id: String) {
    this.dialog.open(AcListComponent, {
      data: {
        imp: id,
      },
    });
  }

  showMoreInfo(id: String) {

  }


}
