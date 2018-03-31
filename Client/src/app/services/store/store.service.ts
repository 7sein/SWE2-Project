import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class StoreService {
    
    private headers = new HttpHeaders({'Content-Type': 'application/json'});
    
    constructor(private http: HttpClient) { }
    
    addStore(store){ // return status if store is added
        return this.http.post(  
         '/addStore', 
         JSON.stringify(store),
         { headers: this.headers } 
        );
    }
    
    showStore(store){ // return list of store products
        return this.http.get(  
         '/showStore/' + store.name,
         { headers: this.headers } 
        );
    }
    
    addProductToStore(product){ // return status if product is added
        return this.http.post(  
         '/addProductToStore',
         JSON.stringify(product),
         { headers: this.headers } 
        );
    }
    
    getStoresStatistics(){
        return this.http.get(
         '/getStoresStatistics',
         { headers: this.headers }
        );
    }

}
