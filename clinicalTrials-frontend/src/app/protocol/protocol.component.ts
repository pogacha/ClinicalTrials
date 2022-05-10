import { Component, OnInit, Inject } from '@angular/core';
import { Observable } from "rxjs";
import { ProtocolService } from "../protocol.service";
import { Protocol } from "../classes/protocol";
import { Router } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { SmallDialogComponent } from '../small-dialog/small-dialog.component';
import { MatSnackBar } from '@angular/material/snack-bar';



@Component({
  selector: 'app-protocol',
  templateUrl: './protocol.component.html',
  styleUrls: ['./protocol.component.css']
})
export class ProtocolListComponent implements OnInit {
  protocol!: Observable<Protocol[]>;
  hasUser: boolean = true;


  constructor(private protocolService: ProtocolService,
    private router: Router, private dialog: MatDialog, private _snackBar: MatSnackBar) { }

  ngOnInit() {
    this.reloadData();

  }

  reloadData() {
    this.protocol = this.protocolService.getProtocolList();
  }
}
