import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { ClubSport } from '../model/club-sport.model';
import { Injectable } from '@angular/core';

const httpOptions = {
  headers: new HttpHeaders( {'Content-Type': 'application/json'} )
  };

  @Injectable({
    providedIn: 'root'
  })

export class ClubSportService {
  apiURL : string = 'http://localhost:8081/m2l/api/clubsport';

  constructor(private http : HttpClient) {
  }

  listeClub(): Observable<ClubSport[]>{
    return this.http.get<ClubSport[]>(this.apiURL+"/all");
  }

  ajouterClub( cs: ClubSport):Observable<ClubSport>{
    return this.http.post<ClubSport>(this.apiURL+"/save",cs, httpOptions);
    }

    supprimerClub(id : number) {
      const url = `${this.apiURL}/delete/${id}`;
      return this.http.delete(url, httpOptions);
      }

      consulterClub(id: number): Observable<ClubSport> {
        const url = `${this.apiURL}/getBy/${id}`;
        return this.http.get<ClubSport>(url);
        }

        updateProduit(cs:ClubSport) : Observable<ClubSport>
        {
          const url = `${this.apiURL}/update/${cs.id}`;
        return this.http.put<ClubSport>(url, cs, httpOptions);
        }

}
