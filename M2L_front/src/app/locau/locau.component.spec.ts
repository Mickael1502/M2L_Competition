import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LocauComponent } from './locau.component';

describe('LocauComponent', () => {
  let component: LocauComponent;
  let fixture: ComponentFixture<LocauComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [LocauComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(LocauComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
