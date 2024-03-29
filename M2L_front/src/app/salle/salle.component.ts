import { Component, OnInit } from '@angular/core';
import { Salle } from '../model/salle.model';
import { SalleService } from '../services/salle.service';

@Component({
  selector: 'app-salle',
  templateUrl: './salle.component.html',
  styleUrls: ['./salle.component.css']
})
export class SalleComponent implements OnInit {
  salles!: Salle[];

  constructor(private salleService: SalleService) {}

  ngOnInit(): void {
    this.listSalles();
  }

  // List of salles
  listSalles() {
    this.salleService.listSalles().subscribe(salles => {
      console.log(salles);
      this.salles = salles;
    });
  }

  deleteSalle(salle: Salle) {
    let conf = confirm("Etes-vous sûr ?");
    if (conf) {
      this.salleService.deleteSalle(salle.id!).subscribe(() => {
        console.log("Salle supprimée");
        this.listSalles();
      });
    }
  }
}
