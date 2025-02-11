import { Component } from '@angular/core';
import { ProductServiceService } from '../product-service.service';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { Product } from '../models/product';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {
 products: Product[] = [];
 

  constructor(private productService: ProductServiceService,private fb: FormBuilder, private rout: Router,private http: HttpClient) {}

  ngOnInit(): void {
    this.productService.getAllProducts().subscribe(data => {
      this.products = data;
    });

}
}
