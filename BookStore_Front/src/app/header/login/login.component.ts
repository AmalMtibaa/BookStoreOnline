import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router, ActivatedRoute} from "@angular/router";
import {AppService} from "../../app.service";
import {Observable} from "rxjs";
import {HttpHeaders} from "@angular/common/http";

@Component({
  selector: 'app-login',
  templateUrl: 'login.component.html',
  styleUrls: ['login.component.css']
})
export class LoginComponent implements OnInit {


  model: any = {};

  constructor(private route: ActivatedRoute,
              private router: Router,
              private httpClient: HttpClient) {
  }

  ngOnInit() {
    sessionStorage.setItem('token', '');
  }

  login() {

    const body = {
      customer_email: this.model.username,
      customer_pswd: this.model.password
    };

    console.log(body);
    const headers = new HttpHeaders()
      .set('Authorization', 'my-auth-token')
      .set('Content-Type', 'application/json');

    return this.httpClient.post('http://localhost:8081/login', body, {headers: headers}).subscribe(
      isValid => {
        console.log("We are subscribing");
      if (isValid) {
        console.log("We are in the is VALID in Subscribe");
        sessionStorage.setItem(
          'token',
          btoa(this.model.username + ':' + this.model.password)
        );
        this.router.navigate(['']);
        console.log("Authentification done successfully !")
      } else {
        alert("Authentication failed.")
      }
    });

  }

}
