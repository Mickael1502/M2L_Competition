import { Component, OnInit } from '@angular/core';
import { Salle } from '../model/salle.model';
import { SalleService } from '../services/salle.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-salle',
  templateUrl: './add-salle.component.html',
  styleUrls: ['./add-salle.component.css']
})
export class AddSalleComponent implements OnInit {

  ngOnInit(): void {
    
  }

  newSalle = new Salle();

  constructor(private salleService: SalleService, private router: Router) {}

  addSalle() {
    this.salleService.addSalle(this.newSalle).subscribe(salle => {
      console.log(salle);
      this.router.navigate(['salle']);
    });
  }
}
