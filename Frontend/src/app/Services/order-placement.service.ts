import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Order } from '../../../Model/Order';
import { Address } from 'cluster';

@Injectable({
  providedIn: 'root'
})
export class OrderPlacementService {
  private url = "http://localhost:1324";

  constructor(private http: HttpClient) { }

  placeOrder(orderData: Order){
    this.http.post(this.url+"/orders",orderData).subscribe();
    return "Record Inserted";
  }

  addAddress(addressData: Address) {
    return this.http.post(this.url+"/addresses", addressData).subscribe();
  }

  getAllOrdersDetail(){
    return this.http.get<Order[]>(this.url+"/orders");
  }

}