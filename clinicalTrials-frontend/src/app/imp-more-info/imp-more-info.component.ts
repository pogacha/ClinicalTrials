import { Component, Inject, OnInit } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Imp } from '../classes/imp';
import { ImpService } from '../imp.service';


@Component({
  selector: 'app-imp-more-info',
  templateUrl: './imp-more-info.component.html',
  styleUrls: ['./imp-more-info.component.css']
})
export class ImpMoreInfoComponent implements OnInit {
  imp!: Imp;
  list: string[] = [];
  isLoading = true;
  title = 'Imp More Info'
  constructor(private impService: ImpService, @Inject(MAT_DIALOG_DATA) public data: any) { }

  ngOnInit(): void {
    this.getActiveSubstances(this.data.imp);
    this.isLoading = false;
  }

  getActiveSubstances(impId: any): void {

    this.impService.getImp(impId)
      .subscribe(
        data => {
          this.imp = data
          this.list = this.imp.moreInfo.split('/');
          this.title = 'Imp (' + this.imp.impId + ') More Info';
          this.isLoading = false;
        },
        error => console.log(error),
      );
  }

}


