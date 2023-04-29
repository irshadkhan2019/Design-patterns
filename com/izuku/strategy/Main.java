package com.izuku.strategy;

public class Main {
  public static void main(String[] args) {
    ImageStore store=new ImageStore();
    store.store("image1", new JpegCompressor(), new BAWFilter());
    store.store("image2", new PngCompressor(), new BAWFilter());
  }
}
