import { Component, OnInit, Inject } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Trial } from '../classes/trial';
import { TrialService } from '../trial.service';


@Component({
  selector: 'app-trial-form',
  templateUrl: './trial-form.component.html',
  styleUrls: ['./trial-form.component.css']
})
export class TrialFormComponent implements OnInit {
  title: string = '';
  buttonName: string = '';
  trial!: Trial;
  constructor(@Inject(MAT_DIALOG_DATA) public data: any, private formBuilder: FormBuilder, private trialService: TrialService) { }
  trialForm !: any;
  isLoading = true;
  isUpdate = false;

  ngOnInit(): void {
    if (this.data) {
      this.title = 'Update Trial';
      this.buttonName = 'Update';
      this.isUpdate = true;
      this.trialService.getTrial(this.data.trial)
        .subscribe(
          data => {
            this.trialForm = this.formBuilder.group({
              eudraCTNumber: data.eudraCTNumber,
              designOfTheTrial: data.designOfTheTrial,
              trialTypePhase: data.trialTypePhase,
              trialStatus: data.trialStatus,
              scopeOfTheTrial: data.scopeOfTheTrial,
              estimatedDuration: data.estimatedDuration,
              link: data.link,
              therapeuticArea: data.therapeuticArea,
              numberOfSubjects: data.numberOfSubjects,
              firstAddedDate!: data.firstAddedDate
            });
            this.isLoading = false;
          },
          error => console.log(error),
        );

    } else {
      this.title = 'Add Trial';
      this.buttonName = 'Add';
      this.trialForm = this.formBuilder.group({
        eudraCTNumber: 'fghfghgf',
        trialStatus: '',
        designOfTheTrial: '',
        trialTypePhase: '',
        scopeOfTheTrial: '',
        estimatedDuration: '',
        link: '',
        therapeuticArea: '',
        numberOfSubjects: 0,
        firstAddedDate!: new Date()
      });

    }
  }

  onSubmit(): void {
    // Process checkout data here
    let trialDetails = this.trialForm.value;
    console.log(trialDetails);
    if (this.isUpdate) {
      this.trialService.updateTrial(this.trialForm.value.eudraCTNumber, trialDetails)
        .subscribe(
          data => {
            // this.trial = data;
          },
          error => console.log(error));
    }
  }
}
