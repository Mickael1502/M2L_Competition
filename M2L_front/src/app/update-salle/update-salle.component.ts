import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { SalleService } from '../services/salle.service';
import { Salle } from '../model/salle.model';

@Component({
  selector: 'app-update-salle',
  templateUrl: './update-salle.component.html',
  styleUrls: ['./update-salle.component.css']
})
export class UpdateSalleComponent implements OnInit {

  constructor(
    private activatedRoute: ActivatedRoute,
    private router: Router,
    private salleService: SalleService
  ) {}

  ngOnInit() {
    this.salleService.getSalle(this.activatedRoute.snapshot.params['id'])
      .subscribe(salle => {
        this.currentSalle = salle;
      });
  }

  currentSalle = new Salle();

  updateSalle() {
    this.salleService.updateSalle(this.currentSalle).subscribe(updatedSalle => {
      this.router.navigate(['salle']);
    });
  }
}
