import { Component, Inject, OnInit } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Protocol } from '../classes/protocol';
import { Trial } from '../classes/trial';
import { ProtocolService } from '../protocol.service';
import { TrialService } from '../trial.service';
import { forkJoin } from 'rxjs';

@Component({
  selector: 'app-trial-details',
  templateUrl: './trial-details.component.html',
  styleUrls: ['./trial-details.component.css']
})
export class TrialDetailsComponent implements OnInit {
  trial!: Trial;
  protocol !: Protocol;
  isLoading = true;
  constructor(private trialService: TrialService, private protocolService: ProtocolService, @Inject(MAT_DIALOG_DATA) public data: any) { }

  ngOnInit(): void {
    // // forkJoin() to make parallel calls
    forkJoin({
      trialRequest: this.trialService.getTrial(this.data.trial),
      protocolRequest: this.protocolService.getProtocolByEudraCTNumber(this.data.trial)
    }).subscribe(({ trialRequest, protocolRequest }) => {
      this.trial = trialRequest;
      this.protocol = protocolRequest;
      this.isLoading = false;
    });
  }

}
