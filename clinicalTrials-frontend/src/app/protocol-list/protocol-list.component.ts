import { Component, OnInit } from '@angular/core';
import { Observable } from "rxjs";
import { ProtocolService } from "../protocol.service";
import { Protocol } from "../classes/protocol";



@Component({
  selector: 'app-protocol-list',
  templateUrl: './protocol-list.component.html',
  styleUrls: ['./protocol-list.component.css']
})
export class ProtocolListComponent implements OnInit {
  protocols!: Observable<Protocol[]>;


  constructor(private protocolService: ProtocolService) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.protocols = this.protocolService.getProtocolsList();
  }
}
