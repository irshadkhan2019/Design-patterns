package com.izuku.Observer;

public class Main {
    public static void main(String[] args) {
      DataSource ds = new DataSource();
      ds.addObserver(new ChartObserver());
      ds.addObserver(new SpreadSheetObserver());
      ds.setValue(12);
    }
}
