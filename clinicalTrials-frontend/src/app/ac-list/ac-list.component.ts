import { Component, Inject, OnInit } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { ImpService } from '../imp.service';
import { ActiveSubstance } from '../classes/active-substance';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-ac-list',
  templateUrl: './ac-list.component.html',
  styleUrls: ['./ac-list.component.css'],
  host: {
    class: 'list-container'
  },
})
export class AcListComponent implements OnInit {

  activeSubstances !: Observable<ActiveSubstance[]>;

  isLoading = true;
  constructor(private impService: ImpService, @Inject(MAT_DIALOG_DATA) public data: any) { }

  ngOnInit(): void {
    this.getActiveSubstances(this.data.imp);
    this.isLoading = false;
  }

  getActiveSubstances(impId: any): void {
    this.activeSubstances = this.impService.getImpsActiveSubstances(impId);

  }



}

