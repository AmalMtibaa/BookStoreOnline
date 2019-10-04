import { Component, OnInit } from '@angular/core';
import {BookListsService} from "./bookLists.servcie";
import {ActivatedRoute, Router, Params} from "@angular/router";
import {Book} from "./book-item/book.model";

@Component({
  selector: 'app-book-lists',
  templateUrl: './book-lists.component.html',
  styleUrls: ['./book-lists.component.css']
})
export class BookListsComponent implements OnInit {

  constructor(private bookListsService:BookListsService,
              private route: ActivatedRoute,
              private router: Router) { }
  booksList=[];
  ngOnInit() {
    this.route.params.subscribe(
      (params: Params) => {
          this.bookListsService.getBooksOfSelectedCategory(params['id']).subscribe(
            data=>{
              this.booksList=<Book[]>data;
            })
      }
          )
      }

}
