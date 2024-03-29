import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CompetitionService } from '../services/competition.service';
import { Competition } from '../model/competition.model';

@Component({
  selector: 'app-update-competition',
  templateUrl: './update-competition.component.html',
  styleUrls: ['./update-competition.component.css']
})
export class UpdateCompetitionComponent implements OnInit {

  constructor(private activatedRoute: ActivatedRoute,
    private router: Router,
    private competitionService: CompetitionService) {}

  ngOnInit() {
    this.competitionService.consulterCompetition(this.activatedRoute.snapshot.params['id'])
      .subscribe(competition => {
        this.currentCompetition = competition;
      });
  }

  currentCompetition = new Competition();

  updateCompetition() {
    this.competitionService.updateCompetition(this.currentCompetition).subscribe(updatedCompetition => {
      this.router.navigate(['competition']);
    });
  }
}
