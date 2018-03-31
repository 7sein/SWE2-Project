import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class BrandService {
    
    
    private headers = new HttpHeaders({'Content-Type': 'application/json'});
    
    constructor(private http: HttpClient) { }
    
    addBrand(Brand){ // return status if brand is added
        return this.http.post(  '/addBrand', 
                                JSON.stringify(Brand), 
                              { headers: this.headers } );
    }

}
