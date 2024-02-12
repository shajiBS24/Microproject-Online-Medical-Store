import { Component, OnInit } from '@angular/core';
import { Order } from '../../../Model/Order';
import { OrderService } from '../Services/order.service';

@Component({
  selector: 'app-order-tracking',
  templateUrl: './order-tracking.component.html',
  styleUrl: './order-tracking.component.css'
})
export class OrderTrackingComponent implements OnInit {

  orders: Order[] = [];
  myForm: any;

  constructor(private service: OrderService) { }

  ngOnInit(): void {
    this.fetchUsers();
  }
  fetchUsers(): void {
    this.service.getAllOrders().subscribe(orders => {
      this.orders = orders;
    });
  }

}
