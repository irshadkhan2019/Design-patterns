package com.izuku.Observer;

public class ChartObserver implements Observer {

  @Override
  public void update(int value) {
    // TODO Auto-generated method stub
    System.out.println("chart got updated"+value);
  }
  
}
