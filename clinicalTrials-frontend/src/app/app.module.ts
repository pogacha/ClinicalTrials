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
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';
import { MatInputModule } from '@angular/material/input';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { MatMenuModule } from '@angular/material/menu';
import { MatSelectModule } from '@angular/material/select';


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
import { TrialFormComponent } from './trial-form/trial-form.component';
import { LogInComponent } from './log-in/log-in.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { ProtocolListComponent } from './protocol-list/protocol-list.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { SponsorListComponent } from './sponsor-list/sponsor-list.component';
import { ImpListComponent } from './imp-list/imp-list.component';
import { AcListComponent } from './ac-list/ac-list.component';
import { ProtocolSearchFilterPipe } from './protocol-search-filter.pipe';
import { TrialSearchFilterPipe } from './trial-search-filter.pipe';
import { SponsorSearchFilterPipe } from './sponsor-search-filter.pipe';
import { ImpSearchFilterPipe } from './imp-search-filter.pipe';
import { ImpMoreInfoComponent } from './imp-more-info/imp-more-info.component';

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
    SmallDialogComponent,
    TrialFormComponent,
    LogInComponent,
    UserDetailsComponent,
    ProtocolListComponent,
    SidebarComponent,
    SponsorListComponent,
    ImpListComponent,
    AcListComponent,
    ProtocolSearchFilterPipe,
    TrialSearchFilterPipe,
    SponsorSearchFilterPipe,
    ImpSearchFilterPipe,
    ImpMoreInfoComponent
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
    MatDialogModule,
    MatFormFieldModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatInputModule,
    FormsModule,
    ReactiveFormsModule,
    MatProgressSpinnerModule,
    MatSnackBarModule,
    MatMenuModule,
    MatSelectModule
  ],
  providers: [
    MatDatepickerModule,
    MatNativeDateModule],
  bootstrap: [AppComponent]
})
export class AppModule { }
