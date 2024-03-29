import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateClubSportComponent } from './update-club-sport.component';

describe('UpdateClubSportComponent', () => {
  let component: UpdateClubSportComponent;
  let fixture: ComponentFixture<UpdateClubSportComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [UpdateClubSportComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UpdateClubSportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
