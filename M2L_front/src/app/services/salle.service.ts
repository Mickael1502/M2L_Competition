import { Injectable } from '@angular/core';
import { Salle } from '../model/salle.model';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class SalleService {

  apiURL: string = 'http://localhost:8081/m2l/api/salle';

  constructor(private http: HttpClient) {}

  listSalles(): Observable<Salle[]> {
    return this.http.get<Salle[]>(`${this.apiURL}/all`);
  }

  addSalle(salle: Salle): Observable<Salle> {
    return this.http.post<Salle>(this.apiURL+"save", salle, httpOptions);
  }

  getSalle(id: number): Observable<Salle> {
    const url = `${this.apiURL}/getby/${id}`;
    return this.http.get<Salle>(url);
  }

  deleteSalle(id: number): Observable<any> {
    const url = `${this.apiURL}/delete/${id}`;
    return this.http.delete(url, httpOptions);
  }

  updateSalle(salle: Salle): Observable<Salle> {
    const url = `${this.apiURL}/update/${salle.id}`;
    return this.http.put<Salle>(url, salle, httpOptions);
  }
}
