import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {HttpHeaders} from "@angular/common/http";
/**
 * Created by asus on 22/01/2019.
 */
@Injectable()
export class AppService {

  // authenticated = false;
  //
  // constructor(private http: HttpClient) {
  // }
  //
  // authenticate(credentials, callback) {
  //
  //   const headers = new HttpHeaders(credentials ? {
  //       authorization : 'Basic ' + btoa(credentials.username + ':' + credentials.password)
  //     } : {});
  //
  //   this.http.get('user', {headers: headers}).subscribe(response => {
  //     if (response['name']) {
  //       this.authenticated = true;
  //     } else {
  //       this.authenticated = false;
  //     }
  //     return callback && callback();
  //   });

  //}

}
