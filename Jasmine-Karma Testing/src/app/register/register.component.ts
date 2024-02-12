import { Component, OnInit } from '@angular/core';
import { User } from '../../../Model/User';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { RegisterService } from '../Services/register.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent {

  myForm: FormGroup;
  register: User;
  // mhclist: User[] = [];

  constructor(private service: RegisterService) {

    this.myForm = new FormGroup(
      {
        username: new FormControl('', [Validators.required, Validators.pattern("[a-zA-Z][a-zA-Z ]+")]),
        email: new FormControl('', [Validators.required, Validators.pattern('^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$')]),
        password: new FormControl('', [Validators.required, Validators.pattern('[0-9]+'), Validators.minLength(5), Validators.maxLength(13)]),
        phone: new FormControl('', [Validators.required, Validators.pattern('[0-9]+'), Validators.minLength(10)])
      }
    ),

      this.register = new User();
    // this.getAllRegisters();
  }

  Register(data: any) {

    this.register.username = data.username;
    this.register.email = data.email;
    this.register.password = data.password;
    this.register.phone = data.phone;

    this.service.register(this.register).subscribe(
      (resultdata: any) => {
        console.log(resultdata)

        if (resultdata.message == "User Registered") {
          console.log("Register Successfully");
        }
        else {
          alert("Invalid User");
        }
      }
    );

  }
}
