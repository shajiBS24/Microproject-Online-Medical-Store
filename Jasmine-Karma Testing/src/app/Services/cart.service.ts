import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Medicine } from '../../../Model/Medicine';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  private url: string = "http://localhost:1324";

  constructor(private http: HttpClient) { }

  addToCart(medicine: any): Observable<any>{
    return this.http.post (this.url+"/carts/add", medicine);
  }
  
  getMedicines(): Observable<Medicine[]> {
    return this.http.get<Medicine[]>(this.url+"/carts");
  }
}
