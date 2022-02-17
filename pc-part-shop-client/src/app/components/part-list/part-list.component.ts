import {Component, OnInit} from '@angular/core';
import {HttpClientModule, HttpClient} from '@angular/common/http';
import {item} from "../../interfaces/interface";

import {MatDialog} from '@angular/material/dialog';

@Component({
  selector: 'app-part-list',
  templateUrl: './part-list.component.html',
  styleUrls: ['./part-list.component.scss'],


})

export class PartListComponent implements OnInit {
  public itemList: { [key: string]: { [key: string]: any }[] } = {};


  constructor(private http: HttpClient,public dialog: MatDialog) {
  }


  ngOnInit(): void {
     this.getPartList()
  }


  obj: item = {
    "CPU": "",
    "Case": "",
    "GraphicsCard": "",
    "Motherboard": "",
    "PSU": "",
    "RAM": "",
    "Storage": ""
  };

  onclickedTsheckBox(key: any, serialnumber: any) {
    this.http.get('http://localhost:8080/part/'+serialnumber)
      .subscribe((response: any) => {
        console.log(response)

      });

  }

  getPartList() {
    this.http.get('http://localhost:8080/part')
      .subscribe((response: any) => {
        this.itemList = response;
      });
  }


  getDetail() {
  }
}


