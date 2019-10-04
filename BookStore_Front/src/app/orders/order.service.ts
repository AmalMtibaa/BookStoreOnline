import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";
import {HttpHeaders} from "@angular/common/http";
/**
 * Created by asus on 28/01/2019.
 */
@Injectable()
export class OrderService{
  public constructor(private httpClient: HttpClient) {
  }

  createOrder(order){
    const body = JSON.stringify(order);
    const headers = new HttpHeaders()
      .set('Authorization', 'my-auth-token')
      .set('Content-Type', 'application/json');
    return this.httpClient.post('http://localhost:8081/createOrder', body, {headers: headers});
  }
  getOrdersOfSelectedCustomer(){
    return this.httpClient.get('http://localhost:8081/getCateory');
  }

}
