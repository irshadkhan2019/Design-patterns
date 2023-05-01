package com.izuku.Observer;

public class Main {
    public static void main(String[] args) {
      DataSource ds = new DataSource();
      ds.addObserver(new ChartObserver(ds));
      ds.addObserver(new SpreadSheetObserver(ds));
      ds.setValue(12);
      System.out.println("------------ \n");

      ds.setValue(20);
    }
}
