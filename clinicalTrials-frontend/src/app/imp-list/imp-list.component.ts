import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Imp } from '../classes/imp';
import { ImpService } from '../imp.service';

@Component({
  selector: 'app-imp-list',
  templateUrl: './imp-list.component.html',
  styleUrls: ['./imp-list.component.css']
})
export class ImpListComponent implements OnInit {
  imps!: Observable<Imp[]>;

  constructor(private impService: ImpService) { }

  ngOnInit() {
    this.reloadData();
    console.log(this.imps)

  }

  reloadData() {
    this.imps = this.impService.getImps();
  }
}
