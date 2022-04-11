import { Component, OnInit, Inject } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Trial } from '../classes/trial';


@Component({
  selector: 'app-trial-form',
  templateUrl: './trial-form.component.html',
  styleUrls: ['./trial-form.component.css']
})
export class TrialFormComponent implements OnInit {
  title: string = '';
  buttonName: string = '';
  trial!: Trial;
  constructor(@Inject(MAT_DIALOG_DATA) public data: any) { }

  ngOnInit(): void {
    if (this.data) {
      this.title = 'Update Trial';
      this.buttonName = 'Update';
      // get the trial
    } else {
      this.title = 'Add Trial';
      this.buttonName = 'Add';
      this.trial = {
        eudraCTNumber: '',
        trialStatus: '',
        designOfTheTrial: '',
        trialTypePhase: '',
        scopeOfTheTrial: '',
        estimatedDuration: '',
        link: '',
        therapeuticArea: '',
        numberOfSubjects: 0,
        firstAddedDate!: new Date()
      }
    }
  }
}
