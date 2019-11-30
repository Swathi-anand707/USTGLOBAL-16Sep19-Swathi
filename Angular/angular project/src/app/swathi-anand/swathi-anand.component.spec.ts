import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SwathiAnandComponent } from './swathi-anand.component';

describe('SwathiAnandComponent', () => {
  let component: SwathiAnandComponent;
  let fixture: ComponentFixture<SwathiAnandComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SwathiAnandComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SwathiAnandComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
