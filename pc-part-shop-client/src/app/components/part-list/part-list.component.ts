import {Component, OnInit} from '@angular/core';
import {HttpClientModule, HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-part-list',
  templateUrl: './part-list.component.html',
  styleUrls: ['./part-list.component.scss']
})

export class PartListComponent implements OnInit {
  public itemList: { [key: string]: { [key: string]: any }[] } = {}; //, PSU: {}[], GraphicsCard: {}[], Motherboard: {}[], CPU: {}[], Case: {}[],RAM: {}[] } = { Storage: [], PSU: [], GraphicsCard: [], Motherboard: [], CPU: [], Case: [],RAM:[] };


  constructor(private http: HttpClient) {
  }

  ngOnInit(): void {
    // this.getPartList()
  }
  onclickedTsheckBox() {
    console.log()
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
