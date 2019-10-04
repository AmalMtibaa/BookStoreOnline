import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {HttpHeaders} from "@angular/common/http";
import {Customer} from "./customer.model";
/**
 * Created by asus on 22/01/2019.
 */

@Injectable()
export class CustomerService{

  public constructor(private httpClient: HttpClient) {

  }

  public registerCustomer(customer){
    const body = JSON.stringify(customer);
    const headers = new HttpHeaders()
      .set('Authorization', 'my-auth-token')
      .set('Content-Type', 'application/json');
    console.log(customer);
    return this.httpClient.post('http://localhost:8081/registerCustomer', body, {headers: headers});
  }

  public findCustomerByEmail( email :string){

}

}
