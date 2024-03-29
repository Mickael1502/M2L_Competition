import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../services/user.service';
import { User } from '../model/user.model';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {

  constructor(
    private activatedRoute: ActivatedRoute,
    private router: Router,
    private userService: UserService
  ) {}

  ngOnInit() {
    this.userService.getUser(this.activatedRoute.snapshot.params['id'])
      .subscribe(user => {
        this.currentUser = user;
      });
  }

  currentUser = new User();

  updateUser() {
    this.userService.updateUser(this.currentUser).subscribe(updatedUser => {
      this.router.navigate(['user']);
    });
  }
}
