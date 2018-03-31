import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';

//providers
import { UserService } from './services/user/user.service';
import { ProductService } from './services/product/product.service';
import { BrandService } from './services/brand/brand.service';
import { StoreService } from './services/store/store.service';

//imports
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { Routes, RouterModule } from '@angular/router'
import { CustomerComponent } from './components/customer/customer.component';
import { StoreownerComponent } from './components/storeowner/storeowner.component';
import { AdminComponent } from './components/admin/admin.component';
import { IndexComponent } from './components/index/index.component';


export const ROUTES: Routes = [
    { path: '', component: IndexComponent },
    { path: 'admin', component: AdminComponent },
    { path: 'storeOwner', component: StoreownerComponent },
    { path: 'customer', component: CustomerComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    StoreownerComponent,
    AdminComponent,
    IndexComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(ROUTES)
  ],
  providers: [
      UserService,
      ProductService,
      BrandService,
      StoreService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

