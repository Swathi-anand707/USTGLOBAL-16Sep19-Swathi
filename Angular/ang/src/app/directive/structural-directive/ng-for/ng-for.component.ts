import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {

  products =[
    {
      img : "https://cdn.pixabay.com/photo/2016/03/23/15/00/ice-cream-cone-1274894__340.jpg",
      name : 'Ice-cream',
      price : 250

    },{
      img : "https://cdn.pixabay.com/photo/2016/02/05/15/34/pasta-1181189__340.jpg",
      name : 'Egg',
      price : 300


    },{
      img : "https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246__340.jpg",
      name : 'Burger',
      price : 500

    },
    
  ];

  constructor() { }

  ngOnInit() {
  }

}
