import { Component, OnInit, Input } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-indianews',
  templateUrl: './indianews.component.html',
  styleUrls: ['./indianews.component.css']
})
export class IndianewsComponent implements OnInit {
  @Input() indianews : string;
  
  
  constructor() { 
}

  ngOnInit() {
  }

}
