import { Component, OnInit, Inject } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { User } from '../classes/user';
import { UserService } from '../user.service';


@Component({
  selector: 'app-log-in',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.css']
})
export class LogInComponent implements OnInit {
  hide: boolean = true;
  loginForm !: any;
  user!: any;


  constructor(@Inject(MAT_DIALOG_DATA) public data: Object, private dialogRef: MatDialogRef<LogInComponent>, private userService: UserService,
    private formBuilder: FormBuilder, private _snackBar: MatSnackBar) { }


  ngOnInit(): void {
    this.loginForm = this.formBuilder.group({
      id: '',
      pass: '',
    });
  }

  login(): void {
    this.userService.login({ userId: this.loginForm.value.id, pass: this.loginForm.value.pass })
      .subscribe(
        data => {
          this.user = data
          if (!this.user) {
            this._snackBar.open('Wrong Credentials, please try again!', 'Close');
          }
          if (this.user.userId == this.loginForm.value.id) {
            this.dialogRef.close(this.user)
          } else {
            this.dialogRef.close(false)
          }

        },
        error => this.dialogRef.close(false));
  }
}
