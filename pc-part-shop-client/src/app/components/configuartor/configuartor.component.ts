import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {chekList} from "../../interfaces/interface";

@Component({
  selector: 'app-configuartor',
  templateUrl: './configuartor.component.html',
  styleUrls: ['./configuartor.component.scss']
})



export class ConfiguartorComponent implements OnInit {

  public itemList: { [key: string]: { [key: string]: any }[] } = {};
  // public chekList: [CPU: boolean, Case: boolean, GraphicsCard: boolean, Motherboard: boolean, PSU: boolean, RAM: boolean, Storage: boolean];
  // public controls: { [key: string]: boolean };

  obj: chekList = {
    "CPU": true,
    "Case": true,
    "GraphicsCard": false,
    "Motherboard": false,
    "PSU": false,
    "RAM": false,
    "Storage": false
  };

  constructor(private http: HttpClient) {
  }

  ngOnInit(): void {
  }

  onclickedTsheckBox(part: any) {
    console.log(part)

    //this.obj{part} = false

    //this.obj("1").CPU = false;

    //this.chekList[part] = true;

    //onsole.log(this.chekList[part])
  }

  getPartList() {

    this.http.get('http://localhost:8080/part')
      .subscribe((response: any) => {
        this.itemList = response;
        console.log(response)
      });

    //return this.itemList;
  }
}
