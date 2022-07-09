import { Component, Inject, OnInit } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { ImpService } from '../imp.service';
import { ActiveSubstance } from '../classes/active-substance';

@Component({
  selector: 'app-ac-list',
  templateUrl: './ac-list.component.html',
  styleUrls: ['./ac-list.component.css']
})
export class AcListComponent implements OnInit {

  activeSubstances !: ActiveSubstance[];

  isLoading = true;
  constructor(private impService: ImpService, @Inject(MAT_DIALOG_DATA) public data: any) { }

  ngOnInit(): void {
    this.getActiveSubstances(this.data.imp)
  }

  getActiveSubstances(impId: any): void {
    this.impService.getImpsActiveSubstances(impId)
      .subscribe(
        data => {
          this.activeSubstances = data;
          console.log(this.activeSubstances)
          this.isLoading = false;
        },
        error => console.log(error),
      );
  }



}

