import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { User } from '../classes/user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

  user!: User;
  isLoading = true;
  constructor(private userService: UserService, private _snackBar: MatSnackBar, private router: Router) { }

  ngOnInit(): void {
    const userObservable = this.userService.getUser();
    userObservable.subscribe((userData: User) => {
      this.user = (userData);
      if (this.user.userName == '') {
        this._snackBar.open('User not found! Please try to login again!', 'Close');
        this.router.navigate(['/']);
      } else {
        this.isLoading = false;
      }

    });
  }
}
