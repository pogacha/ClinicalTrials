import { Component, Inject, OnInit } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Protocol } from '../classes/protocol';
import { Trial } from '../classes/trial';
import { ProtocolService } from '../protocol.service';
import { TrialService } from '../trial.service';
import { forkJoin } from 'rxjs';
import { CriteriaService } from '../criteria.service';
import { Criteria } from '../classes/criteria';
import { Comparator } from '../classes/comparator';
import { ComparatorService } from '../comparator.service';
import { SponsorService } from '../sponsor.service';
import { Sponsor } from '../classes/sponsor';

@Component({
  selector: 'app-trial-details',
  templateUrl: './trial-details.component.html',
  styleUrls: ['./trial-details.component.css']
})
export class TrialDetailsComponent implements OnInit {
  trial!: Trial;
  protocol !: Protocol;
  criteria !: Criteria;
  comparators !: Comparator[];
  sponsor !: Sponsor;
  isLoading = true;
  constructor(private trialService: TrialService, private protocolService: ProtocolService,
    private criteriaService: CriteriaService, private comparatorService: ComparatorService,
    private sponsorService: SponsorService, @Inject(MAT_DIALOG_DATA) public data: any) { }

  ngOnInit(): void {
    forkJoin({
      trialRequest: this.trialService.getTrial(this.data.trial),
      protocolRequest: this.protocolService.getProtocolByEudraCTNumber(this.data.trial),
      criteriaRequest: this.criteriaService.getCriteriaByEudraCTNumber(this.data.trial),
      comparatorRequest: this.comparatorService.getComparatorsByEudraCTNumber(this.data.trial)
    }).subscribe(({ trialRequest, protocolRequest, criteriaRequest, comparatorRequest }) => {
      this.trial = trialRequest;
      this.protocol = protocolRequest;
      this.criteria = criteriaRequest;
      this.comparators = comparatorRequest;
      this.getSponsor();
    });
  }

  getSponsor(): void {
    this.sponsorService.getSponsor(this.trial.sponsorId)
      .subscribe(
        data => {
          this.sponsor = data
          this.isLoading = false;
        },
        error => console.log(error),
      );
  }

}
