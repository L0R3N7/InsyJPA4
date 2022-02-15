import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from "./components/home/home.component";
import {ConfiguartorComponent} from "./components/configuartor/configuartor.component";
import {CustomerComponent} from "./components/customer/customer.component";
import {OrdersComponent} from "./components/orders/orders.component";
import {PartDetailsComponent} from "./components/part-details/part-details.component";
import {PartListComponent} from "./components/part-list/part-list.component";

const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    redirectTo: 'home'
  },
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'configurator',
    component: ConfiguartorComponent
  },
  {
    path: 'customer',
    component: CustomerComponent
  },
  {
    path: 'orders',
    component: OrdersComponent
  },
  {
    path: 'part-details',
    component: PartDetailsComponent
  },
  {
    path: 'part-list',
    component: PartListComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
