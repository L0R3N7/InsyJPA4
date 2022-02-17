import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.scss']
})
export class OrdersComponent implements OnInit {
  public pcid: string
  public userid : string

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }


  buyPc() {
    this.http.patch("http://localhost:8080/customer/"+this.userid + "/" + this.pcid, null).subscribe()
  }
}
