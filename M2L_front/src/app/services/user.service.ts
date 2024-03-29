import { Injectable } from '@angular/core';
import { User } from '../model/user.model';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class UserService {

  apiURL: string = 'http://localhost:8081/m2l/api/user';

  constructor(private http: HttpClient) {}

  listUsers(): Observable<User[]> {
    return this.http.get<User[]>(`${this.apiURL}/all`);
  }

  addUser(user: User): Observable<User> {
    return this.http.post<User>(this.apiURL+"/save", user, httpOptions);
  }

  getUser(id: number): Observable<User> {
    const url = `${this.apiURL}/getBy/${id}`;
    return this.http.get<User>(url);
  }

  deleteUser(id: number): Observable<any> {
    const url = `${this.apiURL}/delete/${id}`;
    return this.http.delete(url, httpOptions);
  }

  updateUser(user: User): Observable<User> {
    const url = `${this.apiURL}/update/${user.id}`;
    return this.http.put<User>(url, user, httpOptions);
  }
}
