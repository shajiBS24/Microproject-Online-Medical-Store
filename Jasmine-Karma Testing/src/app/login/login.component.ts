import { Component } from '@angular/core';
import { User } from '../../../Model/User';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { LoginService } from '../Services/login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  myForm: FormGroup;
  login: User;

  constructor(private service: LoginService, private router: Router) {
    this.myForm = new FormGroup({
      username: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z][a-zA-Z ]+')]),
      password: new FormControl('', [Validators.required, Validators.pattern('[0-9]+'), Validators.minLength(5), Validators.maxLength(13)]),
    });
    this.login = new User();
  }

  Login(data: any) {
    this.login.username = data.username;
    this.login.password = data.password;


    this.service.login(this.login).subscribe(
      (resultdata: any) => {
        console.log(resultdata)


        if (resultdata.message == "Admin Success") {
          this.router.navigate(['/admin']);
        } else if (resultdata.message == "User Success") {
          this.router.navigate(['/user']);
        }
        else {
          alert("Invalid User");
        }
      }
    );

  }
}