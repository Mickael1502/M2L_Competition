import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddClubSportComponent } from './add-club-sport.component';

describe('AddClubSportComponent', () => {
  let component: AddClubSportComponent;
  let fixture: ComponentFixture<AddClubSportComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AddClubSportComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AddClubSportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
