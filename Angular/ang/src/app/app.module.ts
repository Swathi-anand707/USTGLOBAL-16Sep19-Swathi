import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { RouterModule } from '@angular/router';
import { HelpComponent } from './help/help.component';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/property-binding/event-binding/event-binding.component';
import { YesComponent } from './yes/yes.component';
import { CardComponent } from './card/card.component';
import { TwoWayDataBindingComponent } from './two-way-data-binding/two-way-data-binding.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { DirectiveComponent } from './directive/directive.component';
import { StructuralDirectiveComponent } from './Directive/structural-directive/structural-directive.component';
import { NgIfComponent } from './Directive/structural-directive/ng-if/ng-if.component';
import { NgSwitchComponent } from './Directive/structural-directive/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { NgForComponent } from './Directive/structural-directive/ng-for/ng-for.component';
import { RegisterComponent } from './register/register.component';
import { RequirementComponent } from './requirement/requirement.component';
import { ScheduleComponent } from './schedule/schedule.component';
import { AddUserComponent } from './add-user/add-user.component';
import { ProductComponent } from './product/product.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';




@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    YesComponent,
    CardComponent,
    TwoWayDataBindingComponent,
    DirectiveComponent,
    StructuralDirectiveComponent,
    NgIfComponent,
    NgSwitchComponent,
    CustomDirective,
    NgForComponent,
    RegisterComponent,
    RequirementComponent,
    ScheduleComponent,
    AddUserComponent,
    ProductComponent,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarPipe,
    
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,

    ReactiveFormsModule,
    RouterModule.forRoot([
      {path : 'home', component : HomeComponent},
      {path : 'about', component : AboutComponent},
      {path : 'help', component : HelpComponent},
      {path : 'property-binding', component : PropertyBindingComponent},
      {path : 'event-binding', component : EventBindingComponent},
      {path : 'Twowaybinding', component : TwoWayDataBindingComponent},
      {path : 'Login', component : NgIfComponent},
      {path : 'ng-switch', component : NgSwitchComponent},
      {path : 'ng-for', component : NgForComponent},
      {path : 'register', component : RegisterComponent},
      {path : 'addReq', component : RequirementComponent},
      {path : 'schedule', component : ScheduleComponent},
      {path : 'user', component : AddUserComponent},
      {path : 'product', component : ProductComponent},
      {path : 'reactive', component : ReactiveFormComponent},
      {path : 'parent', component : ParentComponent},
      {path : 'comment', component : CommentDetailsComponent},
      {path : 'comment', component : CommentComponent},

      








    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
