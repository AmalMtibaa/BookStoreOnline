import {Component, OnInit, Input} from '@angular/core';
import {} from "@angular/router";
import {Router} from "@angular/router";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-book-item',
  templateUrl: './book-item.component.html',
  styleUrls: ['./book-item.component.css']
})
export class BookItemComponent implements OnInit {

  constructor(private route: ActivatedRoute,
              private router: Router) { }

  @Input() book;
  ngOnInit() {
  }

  onClickAddCard(book_id){
    this.router.navigate(['/card',book_id]);
  }

}
