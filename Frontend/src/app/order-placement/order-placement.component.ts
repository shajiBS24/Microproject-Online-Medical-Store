import { Component } from '@angular/core';
import { OrderPlacementService } from '../Services/order-placement.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Order } from '../../../Model/Order';

@Component({
  selector: 'app-order-placement',
  templateUrl: './order-placement.component.html',
  styleUrl: './order-placement.component.css'
})
export class OrderPlacementComponent {
  myForm: FormGroup;
  order: Order;
  mhclist: Order[] = [];

  constructor(private service: OrderPlacementService) {

    this.myForm = new FormGroup(
      {
        userName: new FormControl('', [Validators.required, Validators.pattern("[a-zA-Z][a-zA-Z ]+")]),
        address: new FormControl('', [Validators.required]),
        quantity: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
        totalAmount: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
        medicineName: new FormControl('', Validators.required),
        doorNo: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
        street: new FormControl('', [Validators.required, Validators.pattern("[a-zA-Z][a-zA-Z ]+")]),
        city: new FormControl('', [Validators.required, Validators.pattern("[a-zA-Z][a-zA-Z ]+")]),
        pincode: new FormControl('', [Validators.required, Validators.pattern('[0-9]{6}')]),
      }
    ),

    this.order = new Order();
    this.getAllOrders();
  }

  PlaceOrder(orderData: any) {

    // this.order.userName = data.userName;
    // this.order.name = data.name;
    // this.order.quantity = data.quantity;
    // this.order.address = data.address;
    this.service.placeOrder(this.order);
    this.getAllOrders();
  }

  getAllOrders() {
    this.service.getAllOrdersDetail().subscribe(orders => this.mhclist = orders);
  }
}
