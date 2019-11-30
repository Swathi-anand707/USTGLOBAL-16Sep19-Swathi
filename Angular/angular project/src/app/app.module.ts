import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar1/navbar.component';
import { HomeComponent } from './home1/home.component';
import { RouterModule } from '@angular/router';
import { MobileComponent } from './mobile/mobile.component';
import { MobilechildComponent } from './mobilechild/mobilechild.component';
import { CarComponent } from './car/car.component';
import { CarchildComponent } from './carchild/carchild.component';
import { BikeComponent } from './bike/bike.component';
import { BikechildComponent } from './bikechild/bikechild.component';
import { LaptopComponent } from './laptop/laptop.component';
import { LaptopchildComponent } from './laptopchild/laptopchild.component';
import { MoviesComponent } from './movies/movies.component';
import { MovieschildComponent } from './movieschild/movieschild.component';
import { NavComponent } from './nav/nav.component';
import { CountriesComponent } from './countries/countries.component';
import { CategoriesComponent } from './categories/categories.component';
import { SwathiAnandComponent } from './swathi-anand/swathi-anand.component';
import { HttpClientModule } from '@angular/common/http';
import { IndianewsComponent } from './indianews/indianews.component';
import { ChildsourceComponent } from './source/childsource/childsource.component';
import { SourceComponent } from './source/source.component';
import { ChildcategoriesComponent } from './childcategories/childcategories.component';



@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    MobileComponent,
    MobilechildComponent,
    CarComponent,
    CarchildComponent,
    BikeComponent,
    BikechildComponent,
    LaptopComponent,
    LaptopchildComponent,
    MoviesComponent,
    MovieschildComponent,
    NavComponent,
    CountriesComponent,
    CategoriesComponent,
    ChildcategoriesComponent,
    SwathiAnandComponent,
    IndianewsComponent,
    ChildsourceComponent,
    SourceComponent

  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'home', component : HomeComponent},
      {path : 'mobile', component : MobileComponent},
      {path : 'car', component : CarComponent},
      {path : 'bike', component : BikeComponent},
      {path : 'movies', component :MoviesComponent},

      {path : 'laptop', component :LaptopComponent},
      {path : 'sn', component :SwathiAnandComponent},
      {path : 'countries', component :CountriesComponent},
      {path : 'categories', component :CategoriesComponent},
      {path : 'source', component :SourceComponent},
                          




    ])

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
