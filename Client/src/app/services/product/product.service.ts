import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable()
export class ProductService {

    
    private headers = new HttpHeaders({'Content-Type': 'application/json'});
    
    constructor(private http: HttpClient) { }
    
    addProduct(Product){ // return status if the product is added
        return this.http.post(  
         '/addProduct', 
         Product, 
         { headers: this.headers } 
        );
    }
    
    getAllProducts(){
        return this.http.get(
         '/getAllProducts',
         { headers: this.headers }
        );
    }
    
    getProduct(productName, storeName){
        return this.http.get(
         '/getProduct/' + storeName + '/' + productName,
         { headers: this.headers }
        );
    }
    
    buyProduct(productName, storeName, quantity){
        return this.http.get( 
         '/buyStoreProduct/' + storeName + '/'+ productName + '/' + quantity, 
         { headers: this.headers } 
        );
    }
    
    
    viewProduct(productName, storeName){
        return this.http.get(
         '/viewStoreProduct/' + storeName + '/' + productName,
          { headers: this.headers }
        );
    }
    
    
}
