import { Component, OnInit } from '@angular/core';
import { Competition } from '../model/competition.model';
import { CompetitionService } from '../services/competition.service';

@Component({
  selector: 'app-competition',
  templateUrl: './competition.component.html',
  styleUrls: ['./competition.component.css']
})
export class CompetitionComponent implements OnInit {
  competitions!: Competition[];

  constructor(private competitionService: CompetitionService) {
    // this.competitions = competitionService.listeCompetitions();
  }

  ngOnInit(): void {
    this.listeCompetitions();
  }

  // Liste des compétitions
  listeCompetitions() {
    this.competitionService.listeCompetitions().subscribe(competitions => {
      console.log(competitions);
      this.competitions = competitions;
    });
  }

  supprimerCompetition(c: Competition) {
    let conf = confirm("Etes-vous sûr ?");
    if (conf) {
      this.competitionService.supprimerCompetition(c.id!).subscribe(() => {
        console.log("Compétition supprimée");
        this.listeCompetitions();
      });
    }
  }
}
