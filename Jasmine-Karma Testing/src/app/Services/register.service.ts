import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../../../Model/User';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  private url: string = "http://localhost:1324";

  constructor(private http: HttpClient) { }

  register(register: User) {
    return this.http.post(this.url + "/users/register", register);
  }

}
