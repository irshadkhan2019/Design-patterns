package com.izuku.Observer;

public class SpreadSheetObserver implements Observer {

  private DataSource dataSource;

  public SpreadSheetObserver(DataSource dataSource) {
    this.dataSource = dataSource;
  }


  @Override
  public void update() {
    // TODO Auto-generated method stub
    System.out.println("Spreadsheet got updated with :"+dataSource.getValue());
  }
  
}
