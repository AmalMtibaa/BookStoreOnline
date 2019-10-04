import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {BookCategoriesComponent} from "./book-categories/book-categories.component";
import {BookListsComponent} from "./book-lists/book-lists.component";
import {CardComponent} from "./card/card.component";
import {OrdersComponent} from "./orders/orders.component";
import {LoginComponent} from "./header/login/login.component";


const routes: Routes = [
  {path:"",component: BookCategoriesComponent},
  {path:"Book_category/:id",component: BookListsComponent},
  {path:"card/:id",component: CardComponent},
  {path:"Orders",component: OrdersComponent},
  {path:"login",component: LoginComponent},
    { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
