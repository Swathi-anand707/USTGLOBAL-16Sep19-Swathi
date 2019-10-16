import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AddmovieComponent } from './addmovie/addmovie.component';
import { MoviesComponent } from './movies/movies.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    AddmovieComponent,
    MoviesComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    

    RouterModule.forRoot([
      {path: 'Login', component:LoginComponent},
      {path: 'addmovie', component:AddmovieComponent},
      {path: 'movies', component:MoviesComponent},



    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
