import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddLocauComponent } from './add-locau.component';

describe('AddLocauComponent', () => {
  let component: AddLocauComponent;
  let fixture: ComponentFixture<AddLocauComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AddLocauComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AddLocauComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
