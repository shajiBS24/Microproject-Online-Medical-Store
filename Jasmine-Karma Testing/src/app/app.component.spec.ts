import { TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';
import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { LoginComponent } from './login/login.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { UserComponent } from './user/user.component';
import { OrderTrackingComponent } from './order-tracking/order-tracking.component';
import { UserManagementComponent } from './user-management/user-management.component';
import { OrderManagementComponent } from './order-management/order-management.component';
import { CartComponent } from './cart/cart.component';

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'user', component: UserComponent },
  { path: 'cart', component: CartComponent },
  { path: 'orderTracking', component: OrderTrackingComponent },
  { path: 'admin', component: AdminDashboardComponent },
  { path: 'userManagement', component: UserManagementComponent },
  { path: 'orderManagement', component: OrderManagementComponent },
];

describe('AppComponent', () => {
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [
        RouterTestingModule,
        BrowserModule,
        AppRoutingModule,
        RouterModule,
        FormsModule,
        ReactiveFormsModule,
        HttpClientModule,
      ],
      declarations: [
        AppComponent,
        LoginComponent,
        RegisterComponent,
        AdminDashboardComponent,
        UserComponent,
        OrderTrackingComponent,
        UserManagementComponent,
        OrderManagementComponent,
        CartComponent,
      ],
    }).compileComponents();
  });

  it('app component', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it('login component', () => {
    const fixture = TestBed.createComponent(LoginComponent);
    const login = fixture.componentInstance;
    expect(login).toBeTruthy();
  });

  it('admin component', () => {
    const fixture = TestBed.createComponent(AdminDashboardComponent);
    const admin = fixture.componentInstance;
    expect(admin).toBeTruthy();
  });

  it('cart component', () => {
    const fixture = TestBed.createComponent(CartComponent);
    const cart = fixture.componentInstance;
    expect(cart).toBeTruthy();
  });

  it('orderManagement component', () => {
    const fixture = TestBed.createComponent(OrderManagementComponent);
    const orderManagement = fixture.componentInstance;
    expect(orderManagement).toBeTruthy();
  });

  it('orderTracking component', () => {
    const fixture = TestBed.createComponent(OrderTrackingComponent);
    const orderTracking = fixture.componentInstance;
    expect(orderTracking).toBeTruthy();
  });

  it('register component', () => {
    const fixture = TestBed.createComponent(RegisterComponent);
    const register = fixture.componentInstance;
    expect(register).toBeTruthy();
  });

  it('user component', () => {
    const fixture = TestBed.createComponent(UserComponent);
    const user = fixture.componentInstance;
    expect(user).toBeTruthy();
  });

  it('userManagemnt component', () => {
    const fixture = TestBed.createComponent(UserManagementComponent);
    const userManagemnt = fixture.componentInstance;
    expect(userManagemnt).toBeTruthy();
  });

  it('Login Form GUI count', () => {
    const fixture = TestBed.createComponent(LoginComponent);
    const formElement = fixture.debugElement.nativeElement.querySelector("#myForm");
    const inputElements = formElement.querySelectorAll("input");
    const buttonElement = formElement.querySelectorAll("button");
    expect(inputElements.length).toEqual(2);
    expect(buttonElement.length).toEqual(1);
  });

  it('Testing Form valid - login', () => {

    const fixture = TestBed.createComponent(LoginComponent);
    const login = fixture.componentInstance;
    login.myForm.controls?.['username'].setValue("Shaji");
    login.myForm.controls?.['password'].setValue("123456");
    expect(login.myForm.valid).toBeTruthy();;
  });

  it('Register Form GUI count', () => {
    const fixture = TestBed.createComponent(RegisterComponent);
    const formElement = fixture.debugElement.nativeElement.querySelector("#myForm");
    const inputElements = formElement.querySelectorAll("input");
    const buttonElement = formElement.querySelectorAll("button");
    expect(inputElements.length).toEqual(5);
    expect(buttonElement.length).toEqual(1);
  });

  it('Testing Form valid - register', () => {

    const fixture = TestBed.createComponent(RegisterComponent);
    const register = fixture.componentInstance;
    register.myForm.controls?.['username'].setValue("Shaji");
    register.myForm.controls?.['email'].setValue("b.shaji245@gmail.com");
    register.myForm.controls?.['password'].setValue("123456");
    register.myForm.controls?.['phone'].setValue("1234567890");
    expect(register.myForm.valid).toBeTruthy();;
  });

});