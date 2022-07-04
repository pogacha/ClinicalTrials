import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { LogInComponent } from '../log-in/log-in.component';
import { MatSnackBar } from '@angular/material/snack-bar';
import { UserService } from '../user.service';
import { User } from '../classes/user';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  hasUser: boolean = false;
  username: string = 'User Name';
  userObservable: any;

  constructor(private router: Router, private dialog: MatDialog,
    private _snackBar: MatSnackBar, private userService: UserService) { }

  ngOnInit(): void {
    this.userObservable = this.userService.getUser();
    this.userObservable.subscribe((userData: User) => {
      this.hasUser = (!!userData.userId);
    });
  }

  goToMain(): void {
    this.router.navigate(['/']);
  }

  logout(): void {
    this.hasUser = false;
    this.username = '';
    this.userService.setUser({
      userId: '',
      sponsorId: '',
      userName!: '',
      pass!: '',
      organisation!: '',
      phone!: '',
      email!: '',
      address!: ''
    })
  }

  login(): void {
    let dialogRef = this.dialog.open(LogInComponent);

    dialogRef.afterClosed().subscribe(user => {
      if (!user) {
        this._snackBar.open('There was error during Login. Please Try Again or contact the administrator!', 'Close');
      } else {
        this.hasUser = true;
        this.username = user.userName;
        this.userService.setUser(user)
      }
    });
  }

  navigateToUser(): void {
    this.router.navigate(['/user']);
  }

}
