import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IndianewsComponent } from './indianews.component';

describe('IndianewsComponent', () => {
  let component: IndianewsComponent;
  let fixture: ComponentFixture<IndianewsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IndianewsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IndianewsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
