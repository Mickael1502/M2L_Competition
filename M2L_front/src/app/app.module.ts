import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LocauComponent } from './locau/locau.component';
import { AddLocauComponent } from './add-locau/add-locau.component';
import { UpdateLocautComponent } from './update-locaut/update-locaut.component';
import { ClubSportComponent } from './club-sport/club-sport.component';
import { AddClubSportComponent } from './add-club-sport/add-club-sport.component';
import { UpdateClubSportComponent } from './update-club-sport/update-club-sport.component';
import { CompetitionComponent } from './competition/competition.component';
import { AddCompetitionComponent } from './add-competition/add-competition.component';
import { UpdateCompetitionComponent } from './update-competition/update-competition.component';
import { NewsletterComponent } from './newsletter/newsletter.component';
import { UserComponent } from './user/user.component';
import { SalleComponent } from './salle/salle.component';
import { UpdateNewsletterComponent } from './update-newsletter/update-newsletter.component';
import { UpdateSalleComponent } from './update-salle/update-salle.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { AddUserComponent } from './add-user/add-user.component';
import { AddNewsletterComponent } from './add-newsletter/add-newsletter.component';
import { AddSalleComponent } from './add-salle/add-salle.component';
import { NavbarComponent } from './navbar/navbar.component';
import { LandingPageComponent } from './landing-page/landing-page.component';

@NgModule({
  declarations: [
    AppComponent,

    LocauComponent,
    AddLocauComponent,
    UpdateLocautComponent,

    ClubSportComponent,
    AddClubSportComponent,
    UpdateClubSportComponent,
    CompetitionComponent,
    AddCompetitionComponent,
    UpdateCompetitionComponent,
    NewsletterComponent,
    UserComponent,
    SalleComponent,
    UpdateNewsletterComponent,
    UpdateSalleComponent,
    UpdateUserComponent,
    AddUserComponent,
    AddNewsletterComponent,
    AddSalleComponent,
    NavbarComponent,
    LandingPageComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,

  ],
  providers: [
    provideClientHydration(),


  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
