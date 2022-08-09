import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Observable } from "rxjs";
import { Sponsor } from '../classes/sponsor';
import { SponsorService } from '../sponsor.service';



@Component({
  selector: 'app-sponsor-list',
  templateUrl: './sponsor-list.component.html',
  styleUrls: ['./sponsor-list.component.css'],
  host: {
    class: 'list-container'
  },
})
export class SponsorListComponent implements OnInit {
  sponsors: Sponsor[] = [];
  allSponsors: Sponsor[] = [];
  term = '';


  constructor(private sponsorsService: SponsorService, private _snackBar: MatSnackBar) { }

  ngOnInit() {
    this.loadData();

  }

  loadData() {
    this.sponsorsService.getSponsors()
      .subscribe(
        data => {
          this.sponsors = data
          this.allSponsors = data
        },
        error => { this._snackBar.open(error, 'Close'); });
  }

  search(value: string): void {
    value = value.toLowerCase()
    this.sponsors = this.allSponsors.filter((val) =>
      val.sponsorId.toLowerCase().includes(value)
    ).concat(this.allSponsors.filter((val) =>
      val.sponsorName.toLowerCase().includes(value))).concat(this.allSponsors.filter((val) =>
        val.sponsorStatus.toLowerCase().includes(value))).concat(this.allSponsors.filter((val) =>
          val.nameOfSupportingOrg.toLowerCase().includes(value)));

    const key = 'sponsorId';
    this.sponsors = [...new Map(this.sponsors.map(item =>
      [item[key], item])).values()];
  }
}
