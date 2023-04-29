package com.izuku.strategy;

public class ImageStore {
    public void store(String fileName,Compressor compressor,Filter filter){
      compressor.compress(fileName);
      filter.applyfilter(fileName);
    }
}
