import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private url: string = "http://localhost:1324";

  constructor(private http: HttpClient) { }
 
   login(User:any) {
    return this.http.post(this.url+"/users/login",User);
  }


}    