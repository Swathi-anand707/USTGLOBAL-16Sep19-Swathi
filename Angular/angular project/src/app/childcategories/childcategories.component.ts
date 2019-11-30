import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-childcategories',
  templateUrl: './childcategories.component.html',
  styleUrls: ['./childcategories.component.css']
})
export class ChildcategoriesComponent implements OnInit {
  @Input() CategoryNews : string;
  constructor() { }

  ngOnInit() {
  }

}
