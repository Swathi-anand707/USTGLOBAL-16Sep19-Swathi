import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LaptopchildComponent } from './laptopchild.component';

describe('LaptopchildComponent', () => {
  let component: LaptopchildComponent;
  let fixture: ComponentFixture<LaptopchildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LaptopchildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LaptopchildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
