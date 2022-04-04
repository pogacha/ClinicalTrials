import { Component, OnInit, Inject } from '@angular/core';
import { Observable } from "rxjs";
import { TrialService } from "../trial.service";
import { Trial } from "../classes/trial";
import { Router } from '@angular/router';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { SmallDialogComponent } from '../small-dialog/small-dialog.component';



@Component({
  selector: 'app-trial-list',
  templateUrl: './trial-list.component.html',
  styleUrls: ['./trial-list.component.css']
})
export class TrialListComponent implements OnInit {
  trials!: Observable<Trial[]>;
  hasUser: boolean = false;


  constructor(private trialService: TrialService,
    private router: Router, private dialog: MatDialog) { }

  ngOnInit() {
    this.reloadData();

  }

  reloadData() {
    this.trials = this.trialService.getTrialsList();
  }

  moreTrial(id: String) {
    // this.trialService.deleteTrial(id)
    //   .subscribe(
    //     data => {
    //       console.log(data);
    //       this.reloadData();
    //     },
    //     error => console.log(error));
  }

  deleteTrial(id: String) {
    this.dialog.open(SmallDialogComponent, {
      data: {
        text: 'Are you sure you want to delete',
        name: id,
      },
    });
    // this.trialService.deleteTrial(id)
    //   .subscribe(
    //     data => {
    //       console.log(data);
    //       this.reloadData();
    //     },
    //     error => console.log(error));
  }

  editTrial(id: String) {
    // this.trialService.deleteTrial(id)
    //   .subscribe(
    //     data => {
    //       console.log(data);
    //       this.reloadData();
    //     },
    //     error => console.log(error));
  }

  trialDetails(id: String) {
    this.router.navigate(['details', id]);
  }

}
