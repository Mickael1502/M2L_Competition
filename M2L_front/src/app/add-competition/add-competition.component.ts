import { Component, OnInit } from '@angular/core';
import { Competition } from '../model/competition.model';
import { CompetitionService } from '../services/competition.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-competition',
  templateUrl: './add-competition.component.html',
  styleUrls: ['./add-competition.component.css']
})
export class AddCompetitionComponent implements OnInit {

  ngOnInit(): void {
   
  }

  newCompetition = new Competition();

  constructor(private competitionService: CompetitionService, private router: Router) {}

  addCompetition() {
    this.competitionService.ajouterCompetition(this.newCompetition).subscribe(competition => {
      console.log(competition);
      this.router.navigate(['competition']);
    });
  }
}
