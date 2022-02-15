import {Component, OnInit} from '@angular/core';
//import {HttpClient} from "@angular/common/http";
import { HttpClientModule, HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-part-list',
  templateUrl: './part-list.component.html',
  styleUrls: ['./part-list.component.scss']
})

export class PartListComponent implements OnInit {
  public itemList: { Storage: [], PSU: [], GraphicsCard: [], Motherboard: [], CPU: [], Case: [],RAM:[] } = { Storage: [], PSU: [], GraphicsCard: [], Motherboard: [], CPU: [], Case: [],RAM:[] };


  constructor(private http: HttpClient) {
  }

  ngOnInit(): void {
  }

  getPartList() {



    this.http.get('http://localhost:8080/part')
      .subscribe((response: any) => {
        this.itemList.Case = response.Case;
        this.itemList.CPU = response.CPU;
        this.itemList.GraphicsCard = response.GraphicsCard;
        this.itemList.Storage = response.Storage;
        this.itemList.RAM = response.RAM;
        this.itemList.PSU = response.PSU;
        this.itemList.Motherboard = response.Motherboard;
        console.log(this.itemList);

      });

    return this.itemList;
  }
}
