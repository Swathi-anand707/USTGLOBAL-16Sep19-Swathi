import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root' // service will be injected to all the file//
})
export class UserService {
  firebaseURL = 'https://ust-ty-cfdf0.firebaseio.com/';

  constructor( private http: HttpClient) { }
  postUser(data) {
    console.log('service', data);
    return this.http.post(`${this.firebaseURL}/users.json`, data);
  }
  getUsers() {
    return this.http.get(`${this.firebaseURL}/users.json`).pipe(
      map( data => {
        let newArray = [];
        // tslint:disable-next-line: forin
        for (let key in data) {
          newArray.push({...data[key], id: key}); // using data[key] , get key and value pair //
        }
        return newArray;
      })
      )
     } // pipe() which gives results in the form index based, like key and value pair && 0 :{email :   psw:  id: dhfjgkj} //
     //when we dont add pipe here which gives results in the form of key and value , gkjhk:{ email:  psw:  }//
     updateUser(id, data){
      return this.http.put(`${this.firebaseURL}/users/${id}.json`, data);
    }
  
    deleteUser(id){
      return this.http.delete(`${this.firebaseURL}/users/${id}.json`);
    }
}





