package com.mjc.stage2;

import java.util.ArrayList;
import java.util.List;

public class ShopStock {
    private final List<Product> productList;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

   public List<Product> ExucutePattern(FilteringStrategy filteringStrategy){
       List<Product> arr =new ArrayList<>();
       for(Product prod :productList){
           if(filteringStrategy.filter(prod))
           arr.add(prod);
       }
       return arr;
   }

    // Write your code here!
}
