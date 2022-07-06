import { Component, OnInit, Inject, SimpleChanges } from '@angular/core';
import { Observable } from "rxjs";
import { TrialService } from "../trial.service";
import { Trial } from "../classes/trial";
import { Router } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { SmallDialogComponent } from '../small-dialog/small-dialog.component';
import { TrialDetailsComponent } from '../trial-details/trial-details.component';
import { TrialFormComponent } from '../trial-form/trial-form.component';
import { MatSnackBar } from '@angular/material/snack-bar';
import { UserService } from '../user.service';
import { User } from '../classes/user';



@Component({
  selector: 'app-trial-list',
  host: {
    class: 'trial-list-container'
  },
  templateUrl: './trial-list.component.html',
  styleUrls: ['./trial-list.component.css']
})
export class TrialListComponent implements OnInit {
  trials!: Observable<Trial[]>;
  userObservable: any;


  constructor(private trialService: TrialService,
    private router: Router, private dialog: MatDialog, private _snackBar: MatSnackBar, public userService: UserService) {
  }

  ngOnInit() {
    this.loadData()
  }

  ngOnChanges(changes: SimpleChanges) {
    console.log('changes', changes)
  }

  loadData() {
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
      if (typeof success == 'object') {
        this._snackBar.open('Trial Added!', 'Close');
        this.loadData();
      } else if (typeof success == 'string' && success.length > 0) {
        this._snackBar.open(success);
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
              this.loadData();
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
      if (typeof success == 'object') {
        this._snackBar.open('Trial Updated!', 'Close');
      } else if (typeof success == 'string' && success.length > 0) {
        this._snackBar.open(success);
      }
    });
  }

  trialDetails(id: String) {
    this.router.navigate(['details', id]);
  }

}

