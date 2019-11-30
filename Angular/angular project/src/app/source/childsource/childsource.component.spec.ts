import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildsourceComponent } from './childsource.component';

describe('ChildsourceComponent', () => {
  let component: ChildsourceComponent;
  let fixture: ComponentFixture<ChildsourceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildsourceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildsourceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
