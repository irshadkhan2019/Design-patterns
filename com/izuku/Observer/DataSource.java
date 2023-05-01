package com.izuku.Observer;

public class DataSource extends Subject {
    private int value;

    public int getValue() {
      return value;
    }

    public void setValue(int value) {
      this.value = value;
      //pass values to observers push method
      notifyObservers(value);
    }


}
