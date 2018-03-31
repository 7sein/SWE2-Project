import { Component } from '@angular/core';

import { ProductService } from '../../services/product/product.service';
import { BrandService } from '../../services/brand/brand.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent {

    constructor(private productService: ProductService, private brandService: BrandService) { }

    
    Product = { Name: '', Category: '', Price: 0.0 };
    
    addProduct(){
        this.productService.addProduct(this.Product).subscribe(
            data => {
                console.log(data);
            },
            error => {
                console.log(error);
            }
        );
    }
    
    Brand = { Name: '', Category: '' };
    
    addBrand(){
        this.brandService.addBrand(this.Brand).subscribe(
            data => {
                console.log(data);
            },
            error => {
                console.log(error);
            }
        );
    }

}
