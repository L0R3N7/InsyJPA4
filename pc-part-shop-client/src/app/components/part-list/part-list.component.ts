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


  constructor(private http: HttpClient, public dialog: MatDialog) {
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
    document.getElementById("modal-body")!.innerHTML = "";
    this.http.get('http://localhost:8080/part/' + serialnumber)
      .subscribe((response: any) => {
        if (response.type == "CPU") {
          document.getElementById("modal-body")!.innerHTML += "<br>Name: " + response.name
          document.getElementById("modal-body")!.innerHTML += "<br>Serien Nummer: " + response.serialNumber
          document.getElementById("modal-body")!.innerHTML += "<br>Preis: " + response.price
          document.getElementById("modal-body")!.innerHTML += "<br>Basis Geschwindigkeit: " + response.baseClock
          document.getElementById("modal-body")!.innerHTML += "<br>Anzahl der Kerne: " + response.coreCount
          document.getElementById("modal-body")!.innerHTML += "<br>Ist ein Kühler dabei? " + response.includedCooler
          document.getElementById("modal-body")!.innerHTML += "<br>Anuahl der Threads: " + response.threadCount
          document.getElementById("modal-body")!.innerHTML += "<br>Type: " + response.type
        } else if (response.type == "Case") {
          document.getElementById("modal-body")!.innerHTML += "<br>depth: " + response.depth
          document.getElementById("modal-body")!.innerHTML += "<br>fanCount: " + response.fanCount
          document.getElementById("modal-body")!.innerHTML += "<br>formFactor: " + response.formFactor
          document.getElementById("modal-body")!.innerHTML += "<br>height: " + response.height
          document.getElementById("modal-body")!.innerHTML += "<br>name: " + response.name
          document.getElementById("modal-body")!.innerHTML += "<br>serialNumber " + response.serialNumber
          document.getElementById("modal-body")!.innerHTML += "<br>Type: " + response.type
        } else if (response.type == "GraphicsCard") {
          document.getElementById("modal-body")!.innerHTML += "<br>baseClock: " + response.baseClock
          document.getElementById("modal-body")!.innerHTML += "<br>boostClock: " + response.boostClock
          document.getElementById("modal-body")!.innerHTML += "<br>name: " + response.name
          document.getElementById("modal-body")!.innerHTML += "<br>price: " + response.price
          document.getElementById("modal-body")!.innerHTML += "<br>serialNumber: " + response.serialNumber
          document.getElementById("modal-body")!.innerHTML += "<br>tdp " + response.tdp
          document.getElementById("modal-body")!.innerHTML += "<br>Type: " + response.type
          document.getElementById("modal-body")!.innerHTML += "<br>vramtype: " + response.vramtype
        } else if (response.type == "Motherboard") {
          document.getElementById("modal-body")!.innerHTML += "<br>chipSet: " + response.chipSet
          document.getElementById("modal-body")!.innerHTML += "<br>formFactor: " + response.formFactor
          document.getElementById("modal-body")!.innerHTML += "<br>name: " + response.name
          document.getElementById("modal-body")!.innerHTML += "<br>price: " + response.price
          document.getElementById("modal-body")!.innerHTML += "<br>socket: " + response.socket
          document.getElementById("modal-body")!.innerHTML += "<br>Type: " + response.type
        } else if (response.type == "PSU") {
          document.getElementById("modal-body")!.innerHTML += "<br>name: " + response.name
          document.getElementById("modal-body")!.innerHTML += "<br>power: " + response.power
          document.getElementById("modal-body")!.innerHTML += "<br>price: " + response.price
          document.getElementById("modal-body")!.innerHTML += "<br>rating: " + response.rating
          document.getElementById("modal-body")!.innerHTML += "<br>serialNumber: " + response.serialNumber
          document.getElementById("modal-body")!.innerHTML += "<br>Type: " + response.type
        } else if (response.type == "RAM") {
          document.getElementById("modal-body")!.innerHTML += "<br>clock: " + response.clock
          document.getElementById("modal-body")!.innerHTML += "<br>count: " + response.count
          document.getElementById("modal-body")!.innerHTML += "<br>ddr: " + response.ddr
          document.getElementById("modal-body")!.innerHTML += "<br>name: " + response.name
          document.getElementById("modal-body")!.innerHTML += "<br>price: " + response.price
          document.getElementById("modal-body")!.innerHTML += "<br>serialNumber: " + response.serialNumber
          document.getElementById("modal-body")!.innerHTML += "<br>Type: " + response.type
        } else if (response.type == "Storage") {
          document.getElementById("modal-body")!.innerHTML += "<br>name: " + response.name
          document.getElementById("modal-body")!.innerHTML += "<br>price: " + response.price
          document.getElementById("modal-body")!.innerHTML += "<br>readSpeed: " + response.readSpeed
          document.getElementById("modal-body")!.innerHTML += "<br>serialNumber: " + response.serialNumber
          document.getElementById("modal-body")!.innerHTML += "<br>storage: " + response.storage
          document.getElementById("modal-body")!.innerHTML += "<br>type: " + response.type
          document.getElementById("modal-body")!.innerHTML += "<br>writeSpeed: " + response.writeSpeed
        }
        //console.log(response)

      });


  }

  display = "none";

  getPartList() {
    this.http.get('http://localhost:8080/part')
      .subscribe((response: any) => {
        this.itemList = response;
      });
  }


  getDetail() {
  }

  openModal() {
    this.display = "block";
  }

  onCloseHandled() {
    this.display = "none";
  }
}


