import { NgModule} from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LocauComponent } from './locau/locau.component';
import { AddLocauComponent } from './add-locau/add-locau.component';
import { UpdateLocautComponent } from './update-locaut/update-locaut.component';
import { ClubSportComponent } from './club-sport/club-sport.component';
import { AddClubSportComponent } from './add-club-sport/add-club-sport.component';
import { UpdateClubSportComponent } from './update-club-sport/update-club-sport.component';
import { LandingPageComponent } from './landing-page/landing-page.component';
import { CompetitionComponent } from './competition/competition.component';
import { AddCompetitionComponent } from './add-competition/add-competition.component';
import { UpdateCompetitionComponent } from './update-competition/update-competition.component';
import { NewsletterComponent } from './newsletter/newsletter.component';
import { AddNewsletterComponent } from './add-newsletter/add-newsletter.component';
import { UpdateNewsletterComponent } from './update-newsletter/update-newsletter.component';
import { SalleComponent } from './salle/salle.component';
import { AddSalleComponent } from './add-salle/add-salle.component';
import { UpdateSalleComponent } from './update-salle/update-salle.component';
import { UserComponent } from './user/user.component';
import { AddUserComponent } from './add-user/add-user.component';
import { UpdateUserComponent } from './update-user/update-user.component';





const routes: Routes = [
  {path: "", component : LandingPageComponent},

  {path: "locau", component : LocauComponent},
  {path: "add-locau", component : AddLocauComponent},
  {path: "updateLocau/:id", component: UpdateLocautComponent},


  {path: "clubsport", component : ClubSportComponent},
  {path: "add-clubsport", component : AddClubSportComponent},
  {path: "updateClubSport/:id", component : UpdateClubSportComponent},

  {path: "competition", component : CompetitionComponent},
  {path: "add-competition", component : AddCompetitionComponent},
  {path: "updateCompetition/:id", component : UpdateCompetitionComponent},

  {path: "newsletter", component : NewsletterComponent},
  {path: "add-newsletter", component : AddNewsletterComponent},
  {path: "updateNewsletter/:id", component: UpdateNewsletterComponent},

  {path: "salle", component : SalleComponent},
  {path: "add-salle", component: AddSalleComponent},
  {path: "updateSalle/:id", component : UpdateSalleComponent},

  {path: "user", component : UserComponent},
  {path: "add-user", component : AddUserComponent},
  {path: "updateUser/:id", component : UpdateUserComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
