package com.izuku.adapter;

import com.izuku.adapter.izukuFilter.Caramel;

public class Main {
  public static void main(String[] args) {
    ImageView imageView = new ImageView(new Image());

    //applying our filter
    imageView.apply(new VividFilter());

    //applying 3rd party filter via COmposition
    imageView.apply(new CaramelFilter(new Caramel()));
    
    //applying 3rd party filter via Inheritance
    imageView.apply(new CaramelAdapter());
  }
}
