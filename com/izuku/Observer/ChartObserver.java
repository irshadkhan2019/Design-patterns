package com.izuku.Observer;

public class ChartObserver implements Observer {
  private DataSource dataSource;

  public ChartObserver(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public void update() {
    // TODO Auto-generated method stub

    System.out.println("chart got updated with :"+dataSource.getValue());
  }
  
}
