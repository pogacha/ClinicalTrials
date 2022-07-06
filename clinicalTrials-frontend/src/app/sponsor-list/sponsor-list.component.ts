import { Component, OnInit } from '@angular/core';
import { Observable } from "rxjs";
import { Router } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { Sponsor } from '../classes/sponsor';
import { SponsorService } from '../sponsor.service';
import { MatSnackBar } from '@angular/material/snack-bar';


@Component({
  selector: 'app-sponsor-list',
  templateUrl: './sponsor-list.component.html',
  styleUrls: ['./sponsor-list.component.css']
})
export class SponsorListComponent implements OnInit {
  sponsors!: Observable<Sponsor[]>;
  hasUser: boolean = true;


  constructor(private sponsorsService: SponsorService,
    private router: Router, private dialog: MatDialog, private _snackBar: MatSnackBar) { }

  ngOnInit() {
    this.reloadData();
    console.log(this.sponsors);

  }

  reloadData() {
    this.sponsors = this.sponsorsService.getSponsors();
  }
}
