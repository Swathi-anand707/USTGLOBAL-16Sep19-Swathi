import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedDog;
 Dogs = [
   {
     imgUrl : 'https://cdn.pixabay.com/photo/2015/03/26/09/54/pug-690566__340.jpg',
     Name : 'pug'
   }, {
    imgUrl : 'https://cdn.pixabay.com/photo/2016/02/26/16/32/dog-1224267__340.jpg',
    Name : 'Bull dog'
   }, {
    imgUrl : 'https://cdn.pixabay.com/photo/2016/02/19/15/46/dog-1210559__340.jpg',
    Name : 'Labrador'
   }, {
    imgUrl : 'https://cdn.pixabay.com/photo/2018/03/18/18/06/australian-shepherd-3237735__340.jpg',
    Name : ' Australian Shepherd dog'
   }];
  constructor() { }

  ngOnInit() {
  }
  sendDog(dog){
    console.log(dog);
    this.selectedDog=dog;
  }

}
