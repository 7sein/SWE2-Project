import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class UserService {
    
    private headers = new HttpHeaders({'Content-Type': 'application/json'});
    
    constructor(private http: HttpClient) { }
    
    login(user){
        return this.http.post(  
         '/login', 
         JSON.stringify(user),
         { headers: this.headers } 
        );
    }
    
    SignUp(user){
        return this.http.post(  
         '/SignUp', 
         JSON.stringify(user),
         { headers: this.headers } 
        );
    }
    
    addNewCollaporator(storeName, userName){
        return this.http.get(
         '/addNewCollaporator/' + storeName + '/' + userName,
            { headers: this.headers }
        );
    }
    
    

}
