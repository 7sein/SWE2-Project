import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class ProductService {

    
    private headers = new HttpHeaders({'Content-Type': 'application/json'});
    
    constructor(private http: HttpClient) { }
    
    addProduct(Product){ // return status if the product is added
        return this.http.post(  
         '/addProduct', 
         JSON.stringify(Product), 
         { headers: this.headers } 
        );
    }
    
    viewStoreProduct(viewProduct){ // return storeProduct
        return this.http.get(  
         '/viewStoreProduct/'+viewProduct.storeName+'/'+viewProduct.productName, 
         { headers: this.headers } 
        );
    }
    
    buyStoreProduct(buyProduct){ //return status if the product is bought
        return this.http.get( 
         '/viewStoreProduct/'+buyProduct.storeName+'/'+
         buyProduct.productName+'/'+buyProduct.quantity, 
         { headers: this.headers } 
        );
    }
    
    showStore(store){ // return list of storeProducts
        return this.http.get(  
         '/storeOwner/showStore/' + store.name, 
         { headers: this.headers } 
        );
    }

}
