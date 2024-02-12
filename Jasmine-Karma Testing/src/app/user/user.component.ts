import { Component, OnInit } from '@angular/core';
import { UserService } from '../Services/user.service';
import { MedicineService } from '../Services/medicine.service';
import { CartService } from '../Services/cart.service';
import { User } from '../../../Model/User';
import { Medicine } from '../../../Model/Medicine';
import { response } from 'express';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrl: './user.component.css'
})
export class UserComponent implements OnInit {

  username: User[]=[];
  medicines: Medicine[] = [];

  constructor(private service: UserService, private medservice: MedicineService, private cartservice: CartService) { }

  ngOnInit(): void {

    this.service.getUserDetails().subscribe((users: User[]) => {
      this.username = users; // Assuming user object has a property 'username'
    });

    this.medservice.getMedicines().subscribe((medicines: Medicine[]) => {
      this.medicines = medicines;
    });

  }

  addToCart(medicine: any) {
    this.cartservice.addToCart(medicine).subscribe();
  }
  }
