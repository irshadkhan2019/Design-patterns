package com.izuku.adapter;

public class ImageView {
  private Image image;

  public ImageView(Image image){
    this.image=image;
  }

  public void apply(Filter filter){
    // System.out.println(filter);
    filter.apply(image);
  }
}
