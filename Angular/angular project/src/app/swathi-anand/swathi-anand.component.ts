import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-swathi-anand',
  templateUrl: './swathi-anand.component.html',
  styleUrls: ['./swathi-anand.component.css']
})
export class SwathiAnandComponent implements OnInit {
  enterNews;
  topNews;
  sportNews;
  constructor(private http: HttpClient) {
    this.enNews(); 
    this.toNews();
    this.spNews();
   }

  ngOnInit() {
  }

  enNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.enterNews = data.articles;
    }, err => {
        console.log(err);
    }, () => {
        console.log('news got successfully');
    });
  }

    toNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.topNews = data.articles;
    }, err => {
        console.log(err);
    }, () => {
        console.log('news got successfully');
    });
  }

  spNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.sportNews = data.articles;
    }, err => {
        console.log(err);
    }, () => {
        console.log('news got successfully');
    });
  }



}
