package com.izuku.Observer;

public class SpreadSheetObserver implements Observer {

  @Override
  public void update(int value) {
    // TODO Auto-generated method stub
    System.out.println("Spreadsheet got updated"+ value);
  }
  
}
