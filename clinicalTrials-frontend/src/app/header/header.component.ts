import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { LogInComponent } from '../log-in/log-in.component';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  hasUser: boolean = false;
  username: string = 'User Name'
  constructor(private router: Router, private dialog: MatDialog, private _snackBar: MatSnackBar) { }

  ngOnInit(): void {
  }

  goToMain(): void {
    this.router.navigate(['/']);
  }

  logout(): void {
    // log out
    this.hasUser = false;
  }

  login(): void {
    let dialogRef = this.dialog.open(LogInComponent);

    dialogRef.afterClosed().subscribe(success => {
      if (!success) {
        this._snackBar.open('There was error during Login. Please Try Again or contact the administrator!', 'Close');
      } else {
        this.hasUser = true;
      }
    });
  }

}
