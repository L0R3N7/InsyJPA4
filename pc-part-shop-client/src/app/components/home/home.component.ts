import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {item} from "../../interfaces/interface";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(private http: HttpClient) {
  }


  public itemList: { [key: number]: { [key: string]: any }[] } = {};


  ngOnInit(): void {
    document.getElementById("customer")!.style.visibility = "hidden";
    document.getElementById("prebuild")!.style.visibility = "hidden";
    document.getElementById("configured")!.style.visibility = "hidden";
    document.getElementById("pcbyid")!.style.visibility = "hidden";


  }

  listCustomer() {
    this.http.get('http://localhost:8080/customer/all')
      .subscribe((response: any) => {
        for (var prop in response) {
          if (Object.prototype.hasOwnProperty.call(response, prop)) {
            document.getElementById("customervorname")!.innerHTML += response[prop].firstName + " "
            document.getElementById("customernachname")!.innerHTML += response[prop].lastName + " "
            document.getElementById("customerid")!.innerHTML += response[prop].id + " "
          }
        }
        document.getElementById("customer")!.style.visibility = "visible";
        console.log(response)
      });
  }

  listPrebuildPc() {
    this.http.get('http://localhost:8080/pc/prebuilt')
      .subscribe((response: any) => {
        for (var prop in response) {
          if (Object.prototype.hasOwnProperty.call(response, prop)) {
            document.getElementById("prebuildid")!.innerHTML += response[prop].id + " "
            document.getElementById("prebuildmanufacturer")!.innerHTML += response[prop].manufacturer + " "
            document.getElementById("prebuildmodel")!.innerHTML += response[prop].model + " "
            document.getElementById("prebuildprice")!.innerHTML += response[prop].price + " "
            document.getElementById("prebuildwarrantyEnd")!.innerHTML += response[prop].warrantyEnd + " "
          }
        }
        console.log(response)
        document.getElementById("prebuild")!.style.visibility = "visible";
      });

  }

  listOtherPc() {
    this.http.get('http://localhost:8080/pc/configured')
      .subscribe((response: any) => {
        for (var prop in response) {
          if (Object.prototype.hasOwnProperty.call(response, prop)) {
            document.getElementById("configuredid")!.innerHTML += response[prop].id + " "
            document.getElementById("configuredprice")!.innerHTML += response[prop].price + " "
            document.getElementById("configuredwarrantyEnd")!.innerHTML += response[prop].warrantyEnd + " "
          }
        }
        console.log(response)
         document.getElementById("configured")!.style.visibility = "visible";

      });

  }
  @ViewChild("pcidinput") myNameElem: ElementRef;
  public pcid: string

  getPcbyId() {
    this.http.get("http://localhost:8080/pc/byCustomerId/" + this.pcid)
      .subscribe((response: any) => {
        for (var prop in response) {
          if (Object.prototype.hasOwnProperty.call(response, prop)) {
            document.getElementById("customeridpc")!.innerHTML += response[prop].customerId + " "
            document.getElementById("customerpirceid")!.innerHTML += response[prop].price + " "
            document.getElementById("customerwarrantyEnd")!.innerHTML += response[prop].warrantyEnd + " "
            document.getElementById("customerpcid2")!.innerHTML += response[prop].id + " "
          }
        }
        console.log(response)
        document.getElementById("pcbyid")!.style.visibility = "visible";

      });
  }



}
