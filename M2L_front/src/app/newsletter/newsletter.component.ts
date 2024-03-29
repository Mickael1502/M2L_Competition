import { Component, OnInit } from '@angular/core';
import { Newsletter } from '../model/newsletter.model';
import { NewsletterService } from '../services/newsletter.service';

@Component({
  selector: 'app-newsletter',
  templateUrl: './newsletter.component.html',
  styleUrls: ['./newsletter.component.css']
})
export class NewsletterComponent implements OnInit {
  newsletters!: Newsletter[];

  constructor(private newsletterService: NewsletterService) {}

  ngOnInit(): void {
    this.listNewsletters();
  }

  // List of newsletters
  listNewsletters() {
    this.newsletterService.listNewsletters().subscribe(newsletters => {
      console.log(newsletters);
      this.newsletters = newsletters;
    });
  }

  deleteNewsletter(newsletter: Newsletter) {
    let conf = confirm("Etes-vous sûr ?");
    if (conf) {
      this.newsletterService.deleteNewsletter(newsletter.id!).subscribe(() => {
        console.log("Newsletter supprimée");
        this.listNewsletters();
      });
    }
  }
}
