import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {item} from "../../interfaces/interface";
import {map} from 'rxjs/operators';


@Component({
  selector: 'app-configuartor',
  templateUrl: './configuartor.component.html',
  styleUrls: ['./configuartor.component.scss']
})


export class ConfiguartorComponent implements OnInit {

  public itemList: { [key: string]: { [key: string]: any }[] } = {};

  obj: item = {
    "CPU": "",
    "Case": "",
    "GraphicsCard": "",
    "Motherboard": "",
    "PSU": "",
    "RAM": "",
    "Storage": ""
  };
  //private next: any;
  private errors: any;

  constructor(private http: HttpClient) {
  }

  ngOnInit(): void {
    this.getPartList()
  }

  onclickedTsheckBox(key: any, part: any) {
    this.obj[key] = part
  }

  getPartList() {
    this.http.get('http://localhost:8080/part')
      .subscribe((response: any) => {
        this.itemList = response;
      });
  }

  save() {
    var parts: string[];
    parts = [this.obj["CPU"], this.obj["Case"], this.obj["GraphicsCard"], this.obj["Motherboard"], this.obj["PSU"], this.obj["RAM"], this.obj["Storage"]]
    console.log(parts)

    this.http.post('http://localhost:8080/pc', {partSerialnumbers: parts, shouldBeBuilt: false}).subscribe(
      result => {
      },
      error => {
        this.errors = error;
        document.getElementById("showresult")!.innerHTML = "<fieldset>\n" +
          "    <div >\n" +
          "<p>Error. Pls try again!</p>" +
          "    </div>\n" +
          "  </fieldset>"
      },
      () => {
        document.getElementById("showresult")!.innerHTML = "<fieldset>\n" +
          "    <div >\n" +
          "<p>Succes!</p>" +
          "    </div>\n" +
          "  </fieldset>"
      }
    );
  }
}
