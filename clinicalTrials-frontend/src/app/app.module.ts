import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';

import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { MatDividerModule } from '@angular/material/divider';
import { MatListModule } from '@angular/material/list';
import { MatTableModule } from '@angular/material/table';
import { MatDialogModule } from '@angular/material/dialog';


import { AppComponent } from './app.component';
import { MainPageComponent } from './main-page/main-page.component';
import { TrialComponent } from './trial/trial.component';
import { CreateTrialComponent } from './create-trial/create-trial.component';
import { TrialDetailsComponent } from './trial-details/trial-details.component';
import { TrialListComponent } from './trial-list/trial-list.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { HeaderComponent } from './header/header.component';
import { SmallDialogComponent } from './small-dialog/small-dialog.component';

@NgModule({
  declarations: [
    AppComponent,
    MainPageComponent,
    TrialComponent,
    CreateTrialComponent,
    TrialDetailsComponent,
    TrialListComponent,
    PageNotFoundComponent,
    HeaderComponent,
    SmallDialogComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatIconModule,
    HttpClientModule,
    MatButtonModule,
    MatDividerModule,
    MatListModule,
    MatTableModule,
    MatDialogModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
