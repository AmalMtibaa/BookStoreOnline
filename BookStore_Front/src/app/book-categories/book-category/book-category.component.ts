import {Component, OnInit, Input} from '@angular/core';
import {Router, ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-book-category',
  templateUrl: './book-category.component.html',
  styleUrls: ['./book-category.component.css']
})
export class BookCategoryComponent implements OnInit {

  constructor(private router:Router,
              private route:ActivatedRoute) { }
  @Input()category;
  ngOnInit() {

  }
  onClickCategory(category_id){
    this.router.navigate(['Book_category',category_id],{relativeTo:this.route});
  }




}
