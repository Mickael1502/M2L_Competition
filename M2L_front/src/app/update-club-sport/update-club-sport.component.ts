import { Component, OnInit } from '@angular/core';
import { ClubSportService } from '../services/club-sport-service.service';
import { ActivatedRoute, Router } from '@angular/router';
import { ClubSport } from '../model/club-sport.model';

@Component({
  selector: 'app-update-club-sport',
  templateUrl: './update-club-sport.component.html',
  styleUrl: './update-club-sport.component.css'
})
export class UpdateClubSportComponent implements OnInit {
  ngOnInit(): void {
    this.clubService.consulterClub(this.activatedRoute.snapshot.params['id']).
subscribe( prod =>{ this.currentClub = prod; } ) ;
  }

  constructor(private activatedRoute: ActivatedRoute,
    private router :Router,
    private clubService: ClubSportService){}

    currentClub = new ClubSport();

    updateClub() {
      this.clubService.updateProduit(this.currentClub).subscribe(() => {
      this.router.navigate(['produits']); }
      );
      }
}
