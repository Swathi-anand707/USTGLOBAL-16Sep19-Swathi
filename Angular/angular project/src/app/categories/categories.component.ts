import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {
  catNews;
  catdata;
  constructor(private http : HttpClient ) { }

  ngOnInit() {
  }

  CategoryNews(event : any) {
    this.catdata = event.target.value;
    
    if(this.catdata === 'gen') {
      console.log(this.catdata);
      this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=google-news-in&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.catNews = data.articles;
        console.log(this.catdata);
    });
    }
    else if(this.catdata === 'sp') {
      console.log(this.catdata);
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.catNews = data.articles;
        console.log(this.catdata);
    });
    }
    else if(this.catdata === 'en') {
      console.log(this.catdata);
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.catNews = data.articles;
        console.log(this.catdata);
    });
    }
    else if(this.catdata === 'he') {
      console.log(this.catdata);
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=health&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.catNews = data.articles;
        console.log(this.catdata);
    });
    }
    else if(this.catdata === 'bu') {
      console.log(this.catdata);
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.catNews = data.articles;
        console.log(this.catdata);
    });
    }
    else if(this.catdata === 'sci') {
      console.log(this.catdata);
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=science&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.catNews = data.articles;
        console.log(this.catdata);
    });
    }

  }

}
