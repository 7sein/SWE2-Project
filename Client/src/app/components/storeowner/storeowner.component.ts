import { Component } from '@angular/core';
import { StoreService } from '../../services/store/store.service';
import { UserService } from '../../services/user/user.service';

@Component({
  selector: 'app-storeowner',
  templateUrl: './storeowner.component.html',
  styleUrls: ['./storeowner.component.css']
})

export class StoreownerComponent {

    
    stores: any;
    storeProducts: any;
    original: boolean;
    actions: any;
    res: any;
    
    
    constructor(private storeService: StoreService, private userService: UserService) {
        
        this.getAllStores();
        
    }
    
    getAllStores(){
        this.storeService.getAllStores().subscribe(
            data => {
                this.stores = data;
                console.log(this.stores);
            },
            error => {
                console.log(error);
            }
        );
    }
    
    
    Store = { Name: '', Location: '', Type: '' };
    
    addStore(){
        this.storeService.addStore(this.Store).subscribe(
            data => {
                console.log(data);
                this.getAllStores();
                this.Store.Name = '';
                this.Store.Location = '';
                this.Store.Type = '';
                
            },
            error => {
                console.log(error);
            }
        );
    }
    
    getStore(storeName){
        console.log(storeName);
        this.storeService.getStoreProducts(storeName).subscribe( // getProducts
            data => {
                console.log(data);
                this.storeProducts = data;
            },
            error => {
                console.log(error);
            }
        );
        
        this.storeService.checkOriginal(storeName).subscribe( // getActions of original stroOwner
            data => {
                

                console.log(data);
                
                this.res = data;
                if(this.res.status === "Ok"){
                    
                    this.original = true;
                    this.storeService.getStoreActions(storeName).subscribe(
                        data => {
                            console.log(data);
                            this.actions = data;
                        },
                        error => {
                            console.log(data);
                        }
                    );
                
                } else {
                    this.original = false;
                }
                //console.log(this.original);
            },
            error => {
                console.log(error);
            }
        );
        
    }
    
    
    Product = {Product: '', Brand: '', Store: ''};
    
    addProductToStore(){
        
        this.storeService.addProductToStore(this.Product).subscribe(
            data => {
                console.log(data);
                this.Product.Product = '';
                this.Product.Brand = '';
                this.Product.Store = '';
            },
            error => {
                console.log(error);
            }
        );
        
    }
    
    storeName = '';
    collaporatorUserName = '';
    
    addNewCollaporator(){
        this.userService.addNewCollaporator(this.storeName, this.collaporatorUserName).subscribe(
            data => {
                console.log(data);
                this.storeName = '';
                this.collaporatorUserName = '';
                
            },
            error => {
                console.log(error);
            }
        );
        
    }
    
 

}

export interface store{
    Name: string;
    totalUsersViews: number;
    totalBoughtProducts: number;
}

export interface storeProduct{
    UsersViews: number;
    BoughtProducts: number;
    Brand: string;
    Product: string;
    Store: string;
    StoreID: number;
    ProductID: number;
    BrandID: number;
}