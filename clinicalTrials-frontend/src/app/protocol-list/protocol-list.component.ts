import { Component, OnInit } from '@angular/core';
import { Observable } from "rxjs";
import { ProtocolService } from "../protocol.service";
import { Protocol } from "../classes/protocol";
import { MatSnackBar } from '@angular/material/snack-bar';



@Component({
  selector: 'app-protocol-list',
  templateUrl: './protocol-list.component.html',
  styleUrls: ['./protocol-list.component.css'],
  host: {
    class: 'list-container'
  },
})
export class ProtocolListComponent implements OnInit {
  protocols: Protocol[] = [];
  allProtocols: Protocol[] = [];
  displayedColumns: string[] = ['protocolCodeNumber', 'eudraCTNumber', 'fullTitle', 'simplifiedTitle', 'mainObjective', 'safetyObjective'];
  term = '';


  constructor(private protocolService: ProtocolService, private _snackBar: MatSnackBar) { }

  ngOnInit() {
    this.loadData();
  }

  loadData() {
    this.protocolService.getProtocolsList()
      .subscribe(
        data => {
          this.protocols = data
          this.allProtocols = data
        },
        error => { this._snackBar.open(error, 'Close'); });
  }

  search(value: string): void {
    value = value.toLowerCase()

    this.protocols = this.allProtocols.filter((val) =>
      val.eudraCTNumber.toLowerCase().includes(value)
    ).concat(this.allProtocols.filter((val) =>
      val.protocolCodeNumber.toLowerCase().includes(value))).concat(this.allProtocols.filter((val) =>
        val.fullTitle.toLowerCase().includes(value))).concat(this.allProtocols.filter((val) =>
          val.simplifiedTitle.toLowerCase().includes(value))).concat(this.allProtocols.filter((val) =>
            val.mainObjective.toLowerCase().includes(value))).concat(this.allProtocols.filter((val) =>
              val.safetyObjective.toLowerCase().includes(value)));

    const key = 'protocolCodeNumber';
    this.protocols = [...new Map(this.protocols.map(item =>
      [item[key], item])).values()];
  }
}
