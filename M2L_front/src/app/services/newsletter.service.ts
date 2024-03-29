import { Injectable } from '@angular/core';
import { Newsletter } from '../model/newsletter.model';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class NewsletterService {

  apiURL: string = 'http://localhost:8081/m2l/api/newsletter';

  constructor(private http: HttpClient) {}

  listNewsletters(): Observable<Newsletter[]> {
    return this.http.get<Newsletter[]>(`${this.apiURL}/all`);
  }

  addNewsletter(newsletter: Newsletter): Observable<Newsletter> {
    return this.http.post<Newsletter>(this.apiURL+"/save", newsletter, httpOptions);
  }

  getNewsletter(id: number): Observable<Newsletter> {
    const url = `${this.apiURL}/getBy/${id}`;
    return this.http.get<Newsletter>(url);
  }

  deleteNewsletter(id: number): Observable<any> {
    const url = `${this.apiURL}/delete/${id}`;
    return this.http.delete(url, httpOptions);
  }

  updateNewsletter(newsletter: Newsletter): Observable<Newsletter> {
    const url = `${this.apiURL}/update/${newsletter.id}`;
    return this.http.put<Newsletter>(url, newsletter, httpOptions);
  }
}
