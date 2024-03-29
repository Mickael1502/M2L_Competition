import { Component, OnInit } from '@angular/core';

import { ActivatedRoute,Router } from '@angular/router';
import { LocauService } from '../services/locau.service';
import { Locau } from '../model/locau.model';

@Component({
  selector: 'app-update-locaut',
  templateUrl: './update-locaut.component.html',
  styleUrl: './update-locaut.component.css'



})
export class UpdateLocautComponent implements OnInit {
  currentLocau = new Locau();

  constructor(private activatedRoute: ActivatedRoute,
    private router :Router,
    private locauService: LocauService){}


  ngOnInit() {
   this.locauService.consulterLocau(this.activatedRoute.snapshot.params['id']).
   subscribe(local => {this.currentLocau = local;});
  }


    updatelocal()
    { //console.log(this.currentProduit);
     this.locauService.updateLocau(this.currentLocau).subscribe(() =>{
      this.router.navigate(['locau']);
     });

    }


}
