import { Component, OnInit } from '@angular/core';
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
  sponsors!: Observable<Sponsor[]>;


  constructor(private sponsorsService: SponsorService) { }

  ngOnInit() {
    this.reloadData();

  }

  reloadData() {
    this.sponsors = this.sponsorsService.getSponsors();
  }
}
