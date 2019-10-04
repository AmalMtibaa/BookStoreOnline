import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router, Params} from "@angular/router";
import {BookListsService} from "../book-lists/bookLists.servcie";
import {Book} from "../book-lists/book-item/book.model";
import {CardService} from "./card.service";
import {CardBook} from "./CardBook.model";
import {Subscription} from "rxjs";
import {OrderService} from "../orders/order.service";
import {Order} from "../orders/order-item/Order.model";


@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  constructor( private route: ActivatedRoute,
               private router:Router,
               private bookListsService:BookListsService,
               private cardService:CardService,
               private orderService:OrderService ) { }

  cardChanges:Subscription;
  bookToadd:Book=new Book(1,"","",0,null,"",0);
  card=this.cardService.getCard();

  subTotal=0;
  shifting=4;
  total=0;


  ngOnInit() {
    this.cardChanges=this.cardService.cardChanges.subscribe(
      (cardBook:CardBook[])=>{
        this.card=cardBook;
      });
    this.route.params.subscribe(
      (params: Params) => {
        this.bookListsService.getBookById(params['id']).subscribe(
          data=>{
            this.bookToadd=<Book>data;
            let cardBook=new CardBook(this.bookToadd);
            console.log("-------------card:   ",cardBook)
            this.card=this.cardService.addToCard(cardBook);
        })
      });
  }

  disable=false; // to disable + and - buttons
  onClickAddOrSub(book_id,operation){
   this.bookListsService.getBookById(book_id).subscribe(
     data=>{
       let i=0;
       if(operation=="+"){
         i=1;
       }
       else {
         i=-1;
       }
       let book=<Book>data;
       let quantity=this.cardService.getCardById(book_id)[0].quantity;
       if(book.quantity>quantity || i==-1){
            this.disable=false;
            quantity=quantity+i;
            this.cardService.updateCardById(book_id,quantity);
       }
       if(book.quantity==quantity){
         this.disable=true;
       }
     }
   );
}


  onClickDelete(book:CardBook){
    this.cardService.removeFromCard(book);
  }


  calculateTotal(){
    this.subTotal=this.cardService.calculateSubTotal();
    this.total=this.subTotal+this.shifting;
  }
  onClickOrder(card){
    let order=new Order(new Date(),this.total,null,this.card);
    this.orderService.createOrder(order).subscribe(
      data=>{
        console.log(data);
        this.router.navigate(['/Orders']);
      }
    );

  }
}
