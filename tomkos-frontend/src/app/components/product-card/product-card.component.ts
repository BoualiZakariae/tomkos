import { Component, OnInit, Input } from '@angular/core';
import { Product } from 'src/app/model/product';

@Component({
  selector: 'app-product-card',
  templateUrl: './product-card.component.html',
  styleUrls: ['./product-card.component.css']
})
export class ProductCardComponent implements OnInit {

  @Input('product') product : Product;

  constructor() { }

  ngOnInit() {
  }

  showDeails() {
    alert(this.product.id + "/" + this.product.picture + "/" + this.product.price);
  }
}
