import { Component, OnInit } from '@angular/core';
import { Locau } from '../model/locau.model';
import { LocauService } from '../services/locau.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-locau',
  templateUrl: './add-locau.component.html',
  styleUrl: './add-locau.component.css'
})
export class AddLocauComponent implements OnInit {

  ngOnInit(): void {

  }

  newLocau = new Locau();
  constructor(private locauService: LocauService,private router :Router,){}

  //method qui appelle une method pour ajouter de noouveau object en lui transferant de nouveau le nouvelle object
  addLocau(){
    this.locauService.ajouterLocau(this.newLocau).subscribe(local => {
    console.log(local);
    this.router.navigate(['locau']);
});


  }

}
