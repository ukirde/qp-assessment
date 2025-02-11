import { Component } from '@angular/core';
import { Product } from '../models/product';
import { ProductServiceService } from '../product-service.service';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {
  products: Product[] = [];
 

  constructor(private productService: ProductServiceService,private fb: FormBuilder, private rout: Router,private http: HttpClient) {}

  ngOnInit(): void {
    this.productService.getAllProducts().subscribe(data => {
      this.products = data;
    });

}

addproduct: any = this.fb.group({
  'name': this.fb.control('', Validators.required),
  'price': this.fb.control('', Validators.required),
  'category': this.fb.control('', Validators.required),
  'stock': this.fb.control('', Validators.required),
})

pass(addproduct: any) {
  
    alert("User update succesfull..."+addproduct.name)
    this.productService.addProduct(this.addproduct.value).subscribe((val) => {
   
        console.log('Product added successfully:', val);
    
    },
  )
    this.addproduct.reset();
  }




}
 


