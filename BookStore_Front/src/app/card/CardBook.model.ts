import {BookCategory} from "../book-categories/book-category/bookCategory.model";
import {Book} from "../book-lists/book-item/book.model";
/**
 * Created by asus on 19/01/2019.
 */
export class CardBook{

  book_id:number;
  book_name:string;
  book_price:number;
  book_photoURL:string;
  quantity:number;
  book_totalPrice:number;

  public constructor(book:Book){
    this.book_id=book.book_id;
    this.book_name=book.book_name;
    this.book_photoURL=book.book_photoURL;
    this.book_price=book.book_price;
    this.quantity=1;
    this.book_totalPrice=this.book_price;
  }

  public calculateTotalPrice(){
    this.book_totalPrice=this.quantity*this.book_price;
  }
}
