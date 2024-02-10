import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../../../Model/User';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private url: string = "http://localhost:1324";

  constructor(private http: HttpClient) { }

  getUserDetails(): Observable<User[]> {
    return this.http.get<User[]>(this.url+"/users/viewUser");
  }

}

