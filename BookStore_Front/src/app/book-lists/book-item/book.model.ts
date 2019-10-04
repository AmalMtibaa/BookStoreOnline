import {BookCategory} from "../../book-categories/book-category/bookCategory.model";
/**
 * Created by asus on 17/01/2019.
 */
export class Book{

  book_id:number;
  book_name:string;
  book_author:string;
  book_price:number;
  bookCategory: BookCategory;
  book_photoURL:string;
  quantity:number;


  constructor(book_id: number, book_name: string, book_author: string, book_price: number, bookCategory: BookCategory, book_photoURL: string, quantity: number) {
    this.book_id = book_id;
    this.book_name = book_name;
    this.book_author = book_author;
    this.book_price = book_price;
    this.bookCategory = bookCategory;
    this.book_photoURL = book_photoURL;
    this.quantity = quantity;
  }
}
