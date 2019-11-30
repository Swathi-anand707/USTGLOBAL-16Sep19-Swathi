import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, ɵConsole, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy { //ngonit function exectuting only once. ng do check is executed after every changing//
  users;
  selectedUser: any;
  today = new Date();

  constructor(public service : UserService) {
    console.log("constructor is executed")
    this.getData();
   }
  
  ngOnInit() {
    console.log("ngoninit is executed")// executed only once//
  }
  ngDoCheck(){
    console.log("ngdo check is executed")// executed again and again it listen for changes what we made//
  }
  ngAfterViewInit(){
    console.log("ngAfter view init is executed"); // executed only once//
    
  }
  ngAfterViewChecked(){
    console.log("ngAfter view checked is executed"); // executed again and again it listen for changes what we made//
    
  }
  ngOnDestroy(){
    console.log("ngOnDestroy is executed"); // executed only once when component destroy//
    
  }
  loginData(form){
    console.log(form.value);
    this.service.postUser(form.value).subscribe(data => {
      console.log(data);
      this.users = data;
    }, err =>{
      console.log(err);
    }, () => {
      console.log('data hosted successfully');
    })
  }
  getData(){
    this.service.getUsers().subscribe(data =>{
      console.log(data);
      this.users=data;
    }, err => {
      console.log(err);
    },() => {
      console.log('data got successfully');
    }
      )
  }
  deleteData(user){
    console.log(user);
    this.service.deleteUser(user.id).subscribe(data => {
      console.log(data);
      this.getData();
    }, err => {
      console.log(err);
    }, () => {
      console.log("data deleted successfully");
    })
  }
  selectUser(user){
    console.log(user);
    this.selectedUser = user;
  }
  
  updateData(form) {
    console.log(form.value);
    this.service.updateUser(form.value.id , form.value).subscribe(data =>{
      console.log(data);
    }, err =>{
      console.log(err);
    } , () =>{
      console.log("data updated successfully");
    })
  }
  }


