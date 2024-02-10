import { Component, OnInit } from '@angular/core';
import { CartService } from '../Services/cart.service';
import { Medicine } from '../../../Model/Medicine';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrl: './cart.component.css'
})
export class CartComponent implements OnInit {

  medicines: Medicine[] = [];

  constructor(private service: CartService) { }

  ngOnInit(): void {
    this.fetchMedicines();
  }

  fetchMedicines(): void {
    this.service.getMedicines().subscribe(medicines => {
      this.medicines = medicines;
    });
  }

}
