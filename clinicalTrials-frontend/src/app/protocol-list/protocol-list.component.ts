import { Component, OnInit } from '@angular/core';
import { Observable } from "rxjs";
import { ProtocolService } from "../protocol.service";
import { Protocol } from "../classes/protocol";
import { Router } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';



@Component({
  selector: 'app-protocol-list',
  templateUrl: './protocol-list.component.html',
  styleUrls: ['./protocol-list.component.css']
})
export class ProtocolListComponent implements OnInit {
  protocols!: Observable<Protocol[]>;
  hasUser: boolean = true;


  constructor(private protocolService: ProtocolService,
    private router: Router, private dialog: MatDialog, private _snackBar: MatSnackBar) { }

  ngOnInit() {
    this.reloadData();
    console.log(this.protocols)

  }

  reloadData() {
    this.protocols = this.protocolService.getProtocolsList();
  }
}
