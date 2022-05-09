import { Component, OnInit, Inject } from '@angular/core';
import { Observable } from "rxjs";
import { TrialService } from "../trial.service";
import { Trial } from "../classes/trial";
import { Router } from '@angular/router';
import { MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { SmallDialogComponent } from '../small-dialog/small-dialog.component';
import { TrialDetailsComponent } from '../trial-details/trial-details.component';
import { TrialFormComponent } from '../trial-form/trial-form.component';
import { MatSnackBar } from '@angular/material/snack-bar';



@Component({
  selector: 'app-trial-list',
  templateUrl: './trial-list.component.html',
  styleUrls: ['./trial-list.component.css']
})
export class TrialListComponent implements OnInit {
  trials!: Observable<Trial[]>;
  hasUser: boolean = true;


  constructor(private trialService: TrialService,
    private router: Router, private dialog: MatDialog, private _snackBar: MatSnackBar) { }

  ngOnInit() {
    this.reloadData();

  }

  reloadData() {
    this.trials = this.trialService.getTrialsList();
  }

  moreTrial(id: String) {
    this.dialog.open(TrialDetailsComponent, {
      data: {
        trial: id,
      },
    });
  }

  addNewTrial() {
    let dialogRef = this.dialog.open(TrialFormComponent, {
    });
    dialogRef.afterClosed().subscribe(success => {
      if (success) {
        this._snackBar.open('Trial Added!', 'Close');
        this.reloadData();
      } else {
        this._snackBar.open('Trial did not Added. Please Try again', 'Close');
      }
    });
  }

  deleteTrial(id: String) {
    let dialogRef = this.dialog.open(SmallDialogComponent, {
      data: {
        title: 'Delete Trial',
        text: "Are you sure you want to delete trial (" + id + ") ?",
        hasButtons: true,
        buttonName: 'Delete'
      },
    });

    dialogRef.afterClosed().subscribe(accepted => {
      if (accepted) {
        this.trialService.deleteTrial(id)
          .subscribe(
            data => {
              let dialogRef1 = this.dialog.open(SmallDialogComponent, {
                data: {
                  title: 'Delete Trial',
                  text: "Trial " + id + " has been deleted",
                  hasButtons: false,
                  buttonName: ''
                },
              });
              this.reloadData();
            },
            error => console.log(error));
      }
    });

  }

  editTrial(id: String) {
    let dialogRef = this.dialog.open(TrialFormComponent, {
      data: {
        trial: id
      },
    });

    dialogRef.afterClosed().subscribe(success => {
      if (success) {
        this._snackBar.open('Trial Updated!', 'Close');
        this.reloadData()
      } else {
        this._snackBar.open('Trial did not Updated. Please Try again', 'Close');
      }
    });
  }

  trialDetails(id: String) {
    this.router.navigate(['details', id]);
  }

}
function TrialFormComponnent(TrialFormComponnent: any, arg1: {}) {
  throw new Error('Function not implemented.');
}

