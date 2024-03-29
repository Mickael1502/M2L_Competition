import { Component, OnInit } from '@angular/core';
import { User } from '../model/user.model';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  users!: User[];

  constructor(private userService: UserService) {}

  ngOnInit(): void {
    this.listUsers();
  }

  // List of users
  listUsers() {
    this.userService.listUsers().subscribe(users => {
      console.log(users);
      this.users = users;
    });
  }

  deleteUser(user: User) {
    let conf = confirm("Etes-vous sûr ?");
    if (conf) {
      this.userService.deleteUser(user.id!).subscribe(() => {
        console.log("Utilisateur supprimé");
        this.listUsers();
      });
    }
  }
}
