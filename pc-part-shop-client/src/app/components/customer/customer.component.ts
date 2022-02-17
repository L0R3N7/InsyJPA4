import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.scss']
})
export class CustomerComponent implements OnInit {

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }
  singInChangeWindow() {
    var container = document.getElementById('container')!;

    container.classList.remove("right-panel-active");

  }

  singUpChangeWindow() {
    var container = document.getElementById('container')!;
    container.classList.add("right-panel-active");
  }


  signUpSendDataToServer() {

    var name = (<HTMLInputElement>document.getElementById("namesignUp")).value;
    var lastname = (<HTMLInputElement>document.getElementById("lastnamesignUp")).value;
    //var eMail = (<HTMLInputElement>document.getElementById("eMailsignUp")).value;
    this.http.post('http://localhost:8080/customer', {lastName: lastname, firstName: name}).subscribe();
  }

  signInSendDataToServer() {
    console.log("test")


    var name = (<HTMLInputElement>document.getElementById("namesignIn")).value;
    var password = (<HTMLInputElement>document.getElementById("passwordsignIn")).value;


    this.http.get('https://192.168.43.68:8080/user/all').subscribe(response => {
      console.log(response);
    })
  }



}
