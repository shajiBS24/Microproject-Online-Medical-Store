import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../../../Model/User';

@Injectable({
  providedIn: 'root'
})
export class UserManagementService {

  private url: string = "http://localhost:1324";

  constructor(private http: HttpClient) { }

 
  getUsers(): Observable<User[]> {
    return this.http.get<User[]>(this.url+"/users/viewUser");
  }

  updateUser(user: User): Observable<any> {
    console.log ("Put method called");
    return this.http.put('${this.url}/users/${user.userId}', user);
  }

  deleteUser(userId: number): Observable<any> {
    return this.http.delete('${this.url}/users/${userId}');
  }
}