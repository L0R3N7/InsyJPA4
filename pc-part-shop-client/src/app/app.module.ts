import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {HttpClientModule} from '@angular/common/http';
import { MatSliderModule } from '@angular/material/slider';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HomeComponent} from './components/home/home.component';
import {CustomerComponent} from './components/customer/customer.component';
import {ConfiguartorComponent} from './components/configuartor/configuartor.component';
import {PartDetailsComponent} from './components/part-details/part-details.component';
import {PartListComponent} from './components/part-list/part-list.component';
import {OrdersComponent} from './components/orders/orders.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [

    AppComponent,
    HomeComponent,
    CustomerComponent,
    ConfiguartorComponent,
    PartDetailsComponent,
    PartListComponent,
    OrdersComponent

  ],
  imports: [
    BrowserModule,
    MatSliderModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
