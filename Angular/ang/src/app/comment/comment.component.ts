import { Component, OnInit, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-comment',
  templateUrl: './comment.component.html',
  styleUrls: ['./comment.component.css']
})
export class CommentComponent implements OnInit {
  @Output() getComments = new EventEmitter();


  constructor() { }

  ngOnInit() {
  }
  formData(form) {
    console.log(form.value);
    this.getComments.emit(form);
  }
}

