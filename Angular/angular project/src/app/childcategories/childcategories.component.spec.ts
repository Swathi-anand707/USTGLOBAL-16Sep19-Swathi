import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildcategoriesComponent } from './childcategories.component';

describe('ChildcategoriesComponent', () => {
  let component: ChildcategoriesComponent;
  let fixture: ComponentFixture<ChildcategoriesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildcategoriesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildcategoriesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
