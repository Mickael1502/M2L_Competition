import { TestBed } from '@angular/core/testing';

import { LocauService } from './locau.service';

describe('LocauService', () => {
  let service: LocauService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LocauService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
