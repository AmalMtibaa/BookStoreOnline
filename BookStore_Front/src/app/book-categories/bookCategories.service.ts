/**
 * Created by asus on 16/01/2019.
 */
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';



@Injectable()
export class BookCategoriesService {

  public constructor(private httpClient: HttpClient) {
  }

   getAll(){
    return this.httpClient.get('http://localhost:8081/getCateory');
  }


}
