import { ClubSport } from './../model/club-sport.model';
import { ClubSportService } from './../services/club-sport-service.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-club-sport',
  templateUrl: './club-sport.component.html',
  styleUrl: './club-sport.component.css'
})
export class ClubSportComponent implements OnInit {
  clubSport! : ClubSport[];

  constructor(private clubsportService : ClubSportService){}

  ngOnInit(): void {
this.chargerClub();
}

chargerClub(){
this.clubsportService.listeClub().subscribe(CS => {
  console.log(CS);
  this.clubSport = CS;
});}

supprimerProduit(cs: ClubSport)
{
let conf = confirm("Etes-vous sûr ?");
if (conf)
this.clubsportService.supprimerClub(cs.id!).subscribe(() => {
console.log("produit supprimé");
this.chargerClub();
});
}

}
