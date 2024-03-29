import { fileURLToPath } from 'node:url';
import { Injectable } from '@angular/core';
import { Locau } from '../model/locau.model';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
const httpOptions = {headers: new HttpHeaders( {'Content-Type': 'application/json'} )
};


@Injectable({
providedIn: 'root'
})


export class LocauService {

  apiURL: string = 'http://localhost:8081/m2l/api/local';


//un tableau de Locau
constructor(private http : HttpClient) {
}

listeLocau():Observable<Locau[]>{
  return this.http.get<Locau[]>(this.apiURL+"/all");
}

ajouterLocau( local: Locau):Observable<Locau>{
  const url = `${this.apiURL}/save`
  return this.http.post<Locau>(url, local, httpOptions);
}

consulterLocau(id:number): Observable<Locau>{
  const url = `${this.apiURL}/getBy/${id}`;
  return this.http.get<Locau>(url, httpOptions);
  }

supprimerLocau( id : number){
  //supprimer le produit prod du tableau produits
 const url = `${this.apiURL}/delete/${id}`;
 console.log(url);

 return this.http.delete(url, httpOptions);
  }
  //ou Bien
  /* this.produits.forEach((cur, index) => {
  if(prod.idProduit === cur.idProduit) {
  this.produits.splice(index, 1);
  }
  }); */

  updateLocau(l:Locau) : Observable<Locau>
{
  const url = `${this.apiURL}/update/${l.id}`;
// console.log(p);
return this.http.put<Locau>(url, l, httpOptions);
}
}
