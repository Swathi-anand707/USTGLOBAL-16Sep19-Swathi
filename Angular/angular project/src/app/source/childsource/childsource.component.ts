import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-childsource',
  templateUrl: './childsource.component.html',
  styleUrls: ['./childsource.component.css']
})
export class ChildsourceComponent implements OnInit {
  @Input() sourcenews;
  constructor() { }

  ngOnInit() {
  }

}
