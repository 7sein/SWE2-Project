import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class StoreService {
    
    private headers = new HttpHeaders({'Content-Type': 'application/json'});
    
    constructor(private http: HttpClient) { }
    
    addStore(store){ // return status if store is added
        return this.http.post(  
         '/addstore', 
         JSON.stringify(store),
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
    
    getAllStores(){
        return this.http.get(
         '/getAllStores',
         { headers: this.headers }
        );
    }
    
    getStoreProducts(storeName){
        return this.http.get(
         '/getStoreProducts/' + storeName,
         { headers: this.headers }
        );
    }
    
    checkOriginal(storeName){
        return this.http.get(
         '/checkOriginal/' + storeName,
          { headers: this.headers }
        );
    }
    
    getStoreActions(storeName){
        return this.http.get(
         '/getActions/' + storeName,
          { headers: this.headers }
        );
    }
    

}
