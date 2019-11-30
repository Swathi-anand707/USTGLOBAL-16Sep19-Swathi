import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MovieschildComponent } from './movieschild.component';

describe('MovieschildComponent', () => {
  let component: MovieschildComponent;
  let fixture: ComponentFixture<MovieschildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MovieschildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MovieschildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
