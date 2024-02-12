import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
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

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
