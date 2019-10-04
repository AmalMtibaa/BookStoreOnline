import {Book} from "../book-lists/book-item/book.model";
import {Injectable} from "@angular/core";
import {Subject} from "rxjs";
import {CardBook} from "./CardBook.model";
import {forEach} from "@angular/router/src/utils/collection";
/**
 * Created by asus on 19/01/2019.
 */
@Injectable()
export class CardService{

   private card=[];
   cardChanges=new Subject<CardBook[]>();

   public constructor(){

   }

   getCard(){
     return this.card.slice();
   }

   getCardById(id) {
     return this.card.filter(x => x.book_id === id);
   }

   updateCardById(id,quantity){ //to updateQuantity
     this.card.filter(x => x.book_id === id)[0].quantity=quantity;
     this.cardChanges.next(this.card.slice());
     this.updateTotal(id);
   }

   updateTotal(id){ //to updateTotal
     this.card.filter(x => x.book_id === id)[0].calculateTotalPrice();
     this.cardChanges.next(this.card.slice());
   }

   addToCard(book:CardBook){
     console.log(this.card.filter(x => x.book_id==book.book_id));
     if(this.card.filter(x => x.book_id==book.book_id).length==0){
       this.card.push(book);
     }
    else {
       //console.log('wrong else')
       this.updateCardById(book.book_id,book.quantity+1);
     }
    return this.card;
  }

  removeFromCard(book:CardBook){
     console.log(this.card);
    let index=this.card.indexOf(book);
    console.log(index)
    this.card.splice(index,1);
    console.log(this.card);
    this.cardChanges.next(this.card.slice());
  }

  resetCard(){
    this.card=[];
    return this.card;
  }

  calculateSubTotal(){
    let total=0;
    for(var i = 0; i < this.card.length; i++){
      total=total+this.card[i].book_totalPrice;
    }
    return total
  }
}
