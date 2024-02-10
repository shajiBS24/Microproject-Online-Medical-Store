import { Component, OnInit } from '@angular/core';
import { UserManagementService } from '../Services/user-management.service';
import { User } from '../../../Model/User';

@Component({
  selector: 'app-user-management',
  templateUrl: './user-management.component.html',
  styleUrl: './user-management.component.css'
})
export class UserManagementComponent  implements OnInit{

  users: User[]=[];
  editingUser: User = { id: 0, username: '', email: '', password: '', phone:'',usertype:''};

  constructor(private userService: UserManagementService) { }

  ngOnInit(): void {
    this.fetchUsers();
  }

  fetchUsers(): void {
    this.userService.getUsers().subscribe(users => {
      this.users = users;
    });
  }

  editUser(user: User): void {
    this.editingUser = { ...user };
  }

  saveEditedUser() {
    this.userService.updateUser(this.editingUser).subscribe(() => {
      this.resetEditing();
      this.fetchUsers();
    });
  }

  cancelEdit(): void {
    this.resetEditing();
  }

  resetEditing(): void {
    this.editingUser = { id: 0, username: '', email: '', password: '', phone:'',usertype:''};
  }

  deleteUser(userId: number): void {
    this.userService.deleteUser(userId).subscribe(() => {
      this.fetchUsers(); // Refresh the user list after deletion
    });
  }

}