package com.izuku.adapter;

import com.izuku.adapter.izukuFilter.Caramel;

public class CaramelAdapter extends Caramel implements Filter {

  @Override
  public void apply(Image image) {
     init();
     render(image);
  }
  
}
