import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TrialDetailsComponent } from './trial-details/trial-details.component';
import { CreateTrialComponent } from './create-trial/create-trial.component';
import { TrialListComponent } from './trial-list/trial-list.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { MainPageComponent } from './main-page/main-page.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { ProtocolListComponent } from './protocol-list/protocol-list.component';
import { SponsorListComponent } from './sponsor-list/sponsor-list.component';
import { ImpListComponent } from './imp-list/imp-list.component';


const routes: Routes = [
  { path: '', component: MainPageComponent, pathMatch: 'full' },
  { path: 'trials', component: TrialListComponent },
  { path: 'protocols', component: ProtocolListComponent },
  { path: 'sponsors', component: SponsorListComponent },
  { path: 'imps', component: ImpListComponent },
  { path: 'add', component: CreateTrialComponent },
  { path: 'details/:id', component: TrialDetailsComponent },
  { path: 'user', component: UserDetailsComponent },
  { path: '**', component: PageNotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }