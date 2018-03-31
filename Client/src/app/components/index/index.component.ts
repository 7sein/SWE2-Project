import { Component } from '@angular/core';

import { UserService } from '../../services/user/user.service';
import { Router, Routes } from '@angular/router';

import { StoreownerComponent } from '../../components/storeowner/storeowner.component';
import { AdminComponent } from '../../components/admin/admin.component';
import { CustomerComponent } from '../../components/customer/customer.component';
 
@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})



export class IndexComponent{

    constructor(private userService: UserService, private router: Router) { }
    
    
    user = { UserName: '', Password: '' };
    
    login(){
        this.userService.login(this.user).subscribe(
            data => {
                console.log(data);
                if (data['status'] == "Admin"){
                    this.router.navigate(['admin']);
                } else if (data['status'] == "StoreOwner"){
                    this.router.navigate(['storeOwner']);
                } else if (data['status'] == "Customer"){
                    this.router.navigate(['customer']);
                }
            },
            error => {
                console.log(error);
            }
        );
    }
    
    
    user1 = { Name: '', UserName: '', Password: '', Type: '' };
    
    signUp(){
        this.userService.SignUp(this.user1).subscribe(
            data => {
                console.log(data);
            },
            error => {
                console.log(error);
            }
        );
    }
    

}

