import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateLocautComponent } from './update-locaut.component';

describe('UpdateLocautComponent', () => {
  let component: UpdateLocautComponent;
  let fixture: ComponentFixture<UpdateLocautComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [UpdateLocautComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UpdateLocautComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
