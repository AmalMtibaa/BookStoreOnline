import { Component, OnInit } from '@angular/core';
import {BookCategoriesService} from "./bookCategories.service";
import {BookCategory} from "./book-category/bookCategory.model";

@Component({
  selector: 'app-book-categories',
  templateUrl: './book-categories.component.html',
  styleUrls: ['./book-categories.component.css']
})
export class BookCategoriesComponent implements OnInit {

  constructor(private bookCategoriesService: BookCategoriesService) { }
  bookCategories=[];

  ngOnInit() {
        this.bookCategoriesService.getAll().subscribe(
          data=>{
            this.bookCategories=<BookCategory[]>data;
            console.log(this.bookCategories)
          }
        )

  }

}
