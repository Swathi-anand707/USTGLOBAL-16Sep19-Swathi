import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';


@Component({
  selector: 'app-addmovie',
  templateUrl: './addmovie.component.html',
  styleUrls: ['./addmovie.component.css']
})
export class AddmovieComponent implements OnInit {

  constructor() { }
  // tslint:disable-next-line: adjacent-overload-signatures
  get movie() {
    return this.form.get('movie');
  }
  get tittle(){
    return this.form.get('tittle');

  }
  form = new FormGroup({
    movie : new FormControl('', [Validators.required]),
    tittle : new FormControl('', [Validators.required]),
  });
  
 


  ngOnInit() {
  }

}
