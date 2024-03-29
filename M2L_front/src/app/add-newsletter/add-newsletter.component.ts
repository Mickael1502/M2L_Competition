import { Component, OnInit } from '@angular/core';
import { Newsletter } from '../model/newsletter.model';
import { NewsletterService } from '../services/newsletter.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-newsletter',
  templateUrl: './add-newsletter.component.html',
  styleUrls: ['./add-newsletter.component.css']
})
export class AddNewsletterComponent implements OnInit {

  ngOnInit(): void {
   
  }

  newNewsletter = new Newsletter();

  constructor(private newsletterService: NewsletterService, private router: Router) {}

  addNewsletter() {
    this.newsletterService.addNewsletter(this.newNewsletter).subscribe(newsletter => {
      console.log(newsletter);
      this.router.navigate(['newsletter']);
    });
  }
}
