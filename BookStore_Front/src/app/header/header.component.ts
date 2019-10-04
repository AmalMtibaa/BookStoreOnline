import { Component, OnInit } from '@angular/core';
import {FormGroup, FormControl} from "@angular/forms";
import {CustomerService} from "../customer/customer.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private customerService:CustomerService, private router:Router) { }
  form:FormGroup;
  ngOnInit() {
    this.form=new FormGroup(
      {
        'customer_name':new FormControl(null),
        'customer_lastName':new FormControl(null),
        'customer_email':new FormControl(null),
        'customer_pswd':new FormControl(null)
      });
  }

  onSubmit(){
    let formToSubmit=this.form.value;
    this.customerService.registerCustomer(formToSubmit).subscribe()
  }
  loginn=false;
  onClickLogin(){
    this.loginn=true;
  }

}
