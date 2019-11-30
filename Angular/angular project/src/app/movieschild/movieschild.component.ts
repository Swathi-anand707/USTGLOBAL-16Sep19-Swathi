import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-movieschild',
  templateUrl: './movieschild.component.html',
  styleUrls: ['./movieschild.component.css']
})
export class MovieschildComponent implements OnInit {
  @Input() movie: {imgUrl: string , name: string};

  constructor() { }

  ngOnInit() {
  }

}
