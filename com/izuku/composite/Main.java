package com.izuku.composite;

public class Main {
  public static void main(String[] args) {
    Shape shape1=new Shape();
    Shape shape2=new Shape();

    shape1.move();

    Group group=new Group();
    group.add(shape1);
    group.add(shape2);

    group.render();
    group.move();


  }
}
