/**
 * Created by asus on 22/01/2019.
 */
export class Customer{

  customer_id:number;
  customer_name:string;
  customer_lastName:string;
  customer_email:string;
  customer_pswd:string;


  constructor(customer_name: string, customer_lastName: string, customer_email: string, customer_pswd: string) {
    this.customer_name = customer_name;
    this.customer_lastName = customer_lastName;
    this.customer_email = customer_email;
    this.customer_pswd = customer_pswd;
  }
}
