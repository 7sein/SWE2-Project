import { Component } from '@angular/core';
import { StoreService } from '../../services/store/store.service';

@Component({
  selector: 'app-storeowner',
  templateUrl: './storeowner.component.html',
  styleUrls: ['./storeowner.component.css']
})

export class StoreownerComponent {

    
    stores: store[];
    storeProducts: storeProduct[];
    
    
    constructor(private storeSerice: StoreService) {
        
        this.storeSerice.getStoresStatistics().subscribe(
            data => {
                this.storeProducts = data as storeProduct[];
                for(let SP of this.storeProducts){
                    let flag: boolean = false;
                    for(let S of this.stores){
                        if(S.Name == SP.Store){
                            S.totalUsersViews += SP.UsersViews;
                            S.totalBoughtProducts += SP.BoughtProducts;
                            flag = true;
                            break;
                        }
                    }
                    if(flag == false){
                        let s: store;
                        s.Name = SP.Store;
                        s.totalUsersViews = SP.UsersViews;
                        s.totalBoughtProducts = SP.BoughtProducts;
                        this.stores[this.stores.length] = s;
                    }
                }
                
            },
            error => {
                console.log(error);
            }
        );
        
    }
    
    
    Store = { Name: '', Location: '', Type: '' };
    
    addStore(){
        this.storeSerice.addStore(this.Store).subscribe(
            data => {
                console.log(data);
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