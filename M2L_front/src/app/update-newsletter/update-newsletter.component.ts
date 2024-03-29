import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NewsletterService } from '../services/newsletter.service';
import { Newsletter } from '../model/newsletter.model';

@Component({
  selector: 'app-update-newsletter',
  templateUrl: './update-newsletter.component.html',
  styleUrls: ['./update-newsletter.component.css']
})
export class UpdateNewsletterComponent implements OnInit {

  constructor(
    private activatedRoute: ActivatedRoute,
    private router: Router,
    private newsletterService: NewsletterService
  ) {}

  ngOnInit() {
    this.newsletterService.getNewsletter(this.activatedRoute.snapshot.params['id'])
      .subscribe(newsletter => {
        this.currentNewsletter = newsletter;
      });
  }

  currentNewsletter = new Newsletter();

  updateNewsletter() {
    this.newsletterService.updateNewsletter(this.currentNewsletter).subscribe(updatedNewsletter => {
      this.router.navigate(['newsletter']);
    });
  }
}
