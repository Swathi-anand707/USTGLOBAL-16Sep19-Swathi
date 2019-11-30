import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-source',
  templateUrl: './source.component.html',
  styleUrls: ['./source.component.css']
})
export class SourceComponent implements OnInit {
  sourceNews;
  sodata;
  constructor(private http : HttpClient) { 
    this.source(event)
  }
  
  ngOnInit() {
  }

  source(event){
    this.sodata = event.target.value;
    if(this.sodata === 'ng') {
      this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=national-geographic&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.sourceNews = data.articles;
        console.log(this.sodata);
    });
    }
    else if(this.sodata === 'gni') {
      this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=google-news-in&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.sourceNews = data.articles;
        console.log(this.sodata);
    });
    }
    else if(this.sodata === 'toi') {
      this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=the-times-of-india&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.sourceNews = data.articles;
        console.log(this.sodata);
    });
    }
    else if(this.sodata === 'es') {
      this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=espn&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.sourceNews = data.articles;
        console.log(this.sodata);
    });
    }
    else if(this.sodata === 'cn') {
      this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.sourceNews = data.articles;
        console.log(this.sodata);
    });
    }
    else if(this.sodata === 'abc') {
      this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=abc-news&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.sourceNews = data.articles;
        console.log(this.sodata);
    });
    }
  }

}
