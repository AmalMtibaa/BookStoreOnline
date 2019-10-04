import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { BookCategoriesComponent } from './book-categories/book-categories.component';
import {BookCategoryComponent} from "./book-categories/book-category/book-category.component";
import { PromotionsComponent } from './promotions/promotions.component';
import { PromotionComponent } from './promotions/promotion/promotion.component';
import {BookCategoriesService} from "./book-categories/bookCategories.service";
import {HttpClientModule} from "@angular/common/http";
import { BookListsComponent } from './book-lists/book-lists.component';
import { BookItemComponent } from './book-lists/book-item/book-item.component';
import {BookListsService} from "./book-lists/bookLists.servcie";
import { CardComponent } from './card/card.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {CardService} from "./card/card.service";
import { OrdersComponent } from './orders/orders.component';
import {OrderItemComponent} from "./orders/order-item/order-item.component";
import { CustomerComponent } from './customer/customer.component';
import {CustomerService} from "./customer/customer.service";
import {LoginComponent} from "./header/login/login.component";
import {OrderService} from "./orders/order.service";

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    BookCategoryComponent,
    BookCategoriesComponent,
    PromotionsComponent,
    PromotionComponent,
    BookListsComponent,
    BookItemComponent,
    CardComponent,
    OrdersComponent,
    OrderItemComponent,
    CustomerComponent,
    LoginComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [
    BookCategoriesService,
    BookListsService,
    CardService,
    CustomerService,
    OrderService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
