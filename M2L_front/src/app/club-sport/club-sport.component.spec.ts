import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClubSportComponent } from './club-sport.component';

describe('ClubSportComponent', () => {
  let component: ClubSportComponent;
  let fixture: ComponentFixture<ClubSportComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ClubSportComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ClubSportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
