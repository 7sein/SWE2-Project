import { Component } from '@angular/core';
import { ProductService } from '../../services/product/product.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent {
    
    allProducts: any;
    product: any;
    
    constructor(private productService: ProductService) {
        
        this.productService.getAllProducts().subscribe(
            data => {
                console.log(data);
                this.allProducts = data;
            },
            error => {
                console.log(error);
            }
        );
        
    }
    
    getProduct(productName, storeName){
        this.productService.getProduct(productName, storeName).subscribe(
        data => {
                console.log(data);
                this.product = data;
                this.viewProduct(productName, storeName);
            },
            error => {
                console.log(error);
            }
        );
    }
    
    quantity: number;
    address: any;
    
    buyProduct(productName, storeName){
        this.productService.buyProduct(productName, storeName,      this.quantity).subscribe(
            data => {
                console.log(data);
            },
            error => {
                console.log(error);
            }
        );
    }
    
    viewProduct(productName, storeName){
        this.productService.viewProduct(productName, storeName).subscribe(
            data => {
                console.log(data);
            },
            error => {
                console.log(error);
            }
        );
    }
    
    
    agree: boolean = false;
    changeEvent(event){
        
        if(event.target.checked){
            this.agree = true;
        } else {
            this.agree = false;
        }
        
        this.check();
        
    }
    
    
    disabled: boolean = true;
    check(){
        
        if(this.quantity!=null && this.address!=null && this.agree==true){
            this.disabled = false;
        }
        else{
            this.disabled = true;
        }
        
    }
    
    
    
    
}
