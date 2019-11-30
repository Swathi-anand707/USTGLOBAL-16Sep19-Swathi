import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';




@Component({
    selector : 'app-home',
    templateUrl : './home.component.html',
    styleUrls : ['./home.component.css']
})



export class HomeComponent {
    news;
    constructor(  private http : HttpClient) {
        this.getNews();

    }
    getNews(){
       this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=30cf72c2a2e348b2bbd3ce64e7e3eba6').subscribe(data => {
        console.log(data);
        this.news = data.articles; // to remove err in article use artical type any//
      }, err => {
        console.log(err);
      }, () => {
        console.log('news got successfully');
      }
        );

    }
}
