import { Component, OnInit } from '@angular/core';
import { TrialDetailsComponent } from '../trial-details/trial-details.component';
import { Observable } from "rxjs";
import { TrialService } from "../trial.service";
import { Trial } from "../classes/trial";
import { Router } from '@angular/router';


@Component({
  selector: 'app-trial-list',
  templateUrl: './trial-list.component.html',
  styleUrls: ['./trial-list.component.css']
})
export class TrialListComponent implements OnInit {
  trials!: Observable<Trial[]>;

  constructor(private trialService: TrialService,
    private router: Router) { }

  ngOnInit() {
    this.reloadData();
    console.log(this.trials);
  }

  reloadData() {
    this.trials = this.trialService.getTrialsList();
  }

  deleteTrial(id: number) {
    this.trialService.deleteTrial(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  trialDetails(id: number) {
    this.router.navigate(['details', id]);
  }
}
