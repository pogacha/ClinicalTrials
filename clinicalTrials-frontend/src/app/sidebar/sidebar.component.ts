import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {


  menu = [
    {
      icon: 'home',
      url: '/',
      title: 'Home Page'
    },
    {
      icon: 'biotech',
      url: '/trials',
      title: 'Trials'
    },
    {
      icon: 'approval',
      url: '/protocols',
      title: 'Protocols'
    },
    {
      icon: 'handshake',
      url: '/sponsors',
      title: 'Sponsors'
    }
  ]
  constructor(public router: Router) { }

  ngOnInit(): void {
  }

  navigate(item: string): void {
    this.router.navigate([item]);
  }

}
