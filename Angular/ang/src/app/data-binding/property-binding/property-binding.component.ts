import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
 name = 'Swathi';
 imgUrl = 'https://cdn.pixabay.com/photo/2019/09/26/15/46/girl-4506318__340.jpg';
 address = 'Udupi, Karnataka';
 colorName = 'red';
  isActive: boolean;
  colspanValue = 2;



  constructor() {
    setInterval(() => {
      this.colorName = 'yellow';
      this.isActive = !this.isActive;
    }, 2000);
  }






  ngOnInit() {
  }

}
