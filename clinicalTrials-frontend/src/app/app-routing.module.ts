import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TrialDetailsComponent } from './trial-details/trial-details.component';
import { CreateTrialComponent } from './create-trial/create-trial.component';
import { TrialListComponent } from './trial-list/trial-list.component';


const routes: Routes = [
  { path: '', redirectTo: 'employee', pathMatch: 'full' },
  { path: 'employees', component: TrialListComponent },
  { path: 'add', component: CreateTrialComponent },
  { path: 'details/:id', component: TrialDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }