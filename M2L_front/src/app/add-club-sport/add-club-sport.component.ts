import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { ClubSport } from '../model/club-sport.model';
import { ClubSportService } from '../services/club-sport-service.service';

@Component({
  selector: 'app-add-club-sport',
  templateUrl: './add-club-sport.component.html',
  styleUrl: './add-club-sport.component.css'
})

export class AddClubSportComponent implements OnInit {


  ngOnInit(): void {
  }

  newClub = new ClubSport();

  constructor(private clubService : ClubSportService, private router :Router ){}

  addCLubSport(){
    this.clubService.ajouterClub(this.newClub).subscribe(club => {console.log(club);})
  }



}
