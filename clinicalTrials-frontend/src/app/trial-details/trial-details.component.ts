import { Component, Inject, OnInit } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Trial } from '../classes/trial';
import { TrialService } from '../trial.service';

@Component({
  selector: 'app-trial-details',
  templateUrl: './trial-details.component.html',
  styleUrls: ['./trial-details.component.css']
})
export class TrialDetailsComponent implements OnInit {
  trial!: Trial;
  constructor(private trialService: TrialService, @Inject(MAT_DIALOG_DATA) public data: any) { }

  ngOnInit(): void {
    console.log(this.data)
    this.trialService.getTrial(this.data.trial)
      .subscribe(
        data => {
          this.trial = data;
        },
        error => console.log(error));
  }

}
