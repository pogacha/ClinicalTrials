import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Observable } from 'rxjs';
import { AcListComponent } from '../ac-list/ac-list.component';
import { Imp } from '../classes/imp';
import { ImpService } from '../imp.service';
import { TrialDetailsComponent } from '../trial-details/trial-details.component';

@Component({
  selector: 'app-imp-list',
  templateUrl: './imp-list.component.html',
  styleUrls: ['./imp-list.component.css']
})
export class ImpListComponent implements OnInit {
  imps!: Observable<Imp[]>;

  constructor(private impService: ImpService, private dialog: MatDialog) { }

  ngOnInit() {
    this.reloadData();
    console.log(this.imps)

  }

  reloadData() {
    this.imps = this.impService.getImps();
  }

  showActiveSubstances(id: String) {
    this.dialog.open(AcListComponent, {
      data: {
        imp: id,
      },
    });
  }


}
