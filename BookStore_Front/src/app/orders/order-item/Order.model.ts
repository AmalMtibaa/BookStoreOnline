import {Customer} from "../../customer/customer.model";
import {Book} from "../../book-lists/book-item/book.model";
/**
 * Created by asus on 29/01/2019.
 */
export class Order{
  private _order_id:number;
  private _creation_date:Date;
  private _totalPrice:number;
  private _orderCustomer:Customer;
  private _order_books:Book[];


  constructor( creation_date: Date, totalPrice: number, orderCustomer: Customer, order_books: Book[]) {

    this._creation_date = creation_date;
    this._totalPrice = totalPrice;
    this._orderCustomer = orderCustomer;
    this._order_books = order_books;
  }


  get order_id(): number {
    return this._order_id;
  }

  set order_id(value: number) {
    this._order_id = value;
  }


  get creation_date(): Date {
    return this._creation_date;
  }

  set creation_date(value: Date) {
    this._creation_date = value;
  }

  get totalPrice(): number {
    return this._totalPrice;
  }

  set totalPrice(value: number) {
    this._totalPrice = value;
  }

  get orderCustomer(): Customer {
    return this._orderCustomer;
  }

  set orderCustomer(value: Customer) {
    this._orderCustomer = value;
  }

  get order_books(): Book[] {
    return this._order_books;
  }

  set order_books(value: Book[]) {
    this._order_books = value;
  }
}
