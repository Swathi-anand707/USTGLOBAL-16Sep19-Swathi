import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-countries',
  templateUrl: './countries.component.html',
  styleUrls: ['./countries.component.css']
})
export class CountriesComponent implements OnInit {
  indiaNews;
  indata;
  constructor(private http : HttpClient) { 
    this.worldNews(event);
  }

  ngOnInit() {
  }
  
  worldNews(event : any) {
    this.indata = event.target.value;
    if(this.indata === 'in') {
      console.log(this.indata);
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.indiaNews = data.articles;
        console.log(this.indata);
    });
    }
    else if(this.indata === 'us') {
      console.log(this.indata);
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
        this.indiaNews = data.articles; 
        console.log(this.indata);
    });
  }
    else if(this.indata === 'uk') {
    console.log(this.indata);
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=gb&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
      this.indiaNews = data.articles; 
    });
  }
    else if(this.indata === 'ch') {
    console.log(this.indata);
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=cn&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data => {
    this.indiaNews = data.articles; 
    });
  }

}
}
