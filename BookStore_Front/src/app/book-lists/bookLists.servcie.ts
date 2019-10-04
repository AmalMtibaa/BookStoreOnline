import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {HttpHeaders} from "@angular/common/http";


@Injectable()
export class BookListsService {

  cardList=[];
  public constructor(private httpClient: HttpClient) {

  }
  private headers = new HttpHeaders({ 'Content-Type': 'application/json','Authorization': 'my-auth-token' });

  getBookById(idBook){
    return this.httpClient.get( `http://localhost:8081/getBook/${idBook}`)
  }
  getBooksOfSelectedCategory(idCategory){
    return this.httpClient.get( `http://localhost:8081/getBooksOfSelectedCategory/${idCategory}`);
  }

  setBookQuantity(quantity){

  }
}
