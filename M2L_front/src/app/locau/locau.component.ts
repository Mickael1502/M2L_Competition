import { Component, OnInit } from '@angular/core';
import {Locau} from '../model/locau.model';
import { LocauService } from '../services/locau.service';

@Component({
  selector: 'app-locau',
  templateUrl: './locau.component.html',
  styleUrl: './locau.component.css'
})
export class LocauComponent implements OnInit{
  locau! :Locau[];

constructor(private locauService: LocauService) {
}


ngOnInit(): void {
  this.listeLocal();
}

//liste des locau
listeLocal(){
    this.locauService.listeLocau().subscribe(local => {
    console.log(local);
    this.locau = local;
});
}

supprimerLocau(l: Locau)
{
  let conf = confirm("Etes-vous sûr ?");
  if (conf)
  this.locauService.supprimerLocau(l.id!).subscribe(()=>{
  console.log("local suprimé");
  this.listeLocal();
});
}
}
