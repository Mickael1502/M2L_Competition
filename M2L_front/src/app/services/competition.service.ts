import { Injectable } from '@angular/core';
import { Competition } from '../model/competition.model';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class CompetitionService {

  apiURL: string = 'http://localhost:8081/m2l/api/competition';

  constructor(private http: HttpClient) {}

  listeCompetitions(): Observable<Competition[]> {
    return this.http.get<Competition[]>(`${this.apiURL}/all`);
  }

  ajouterCompetition(competition: Competition): Observable<Competition> {
    return this.http.post<Competition>(this.apiURL+"/save", competition, httpOptions);
  }

  consulterCompetition(id: number): Observable<Competition> {
    const url = `${this.apiURL}/getBy/${id}`;
    return this.http.get<Competition>(url);
  }

  supprimerCompetition(id: number): Observable<any> {
    const url = `${this.apiURL}/delete/${id}`;
    return this.http.delete(url, httpOptions);
  }

  updateCompetition(competition: Competition): Observable<Competition> {
    const url = `${this.apiURL}/update/${competition.id}`;
    return this.http.put<Competition>(url, competition, httpOptions);
  }
}
