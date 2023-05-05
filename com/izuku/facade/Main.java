package com.izuku.facade;

public class Main {
  public static void main(String[] args) {
     NotificationService service = new NotificationService();
     service.send("Hello Izuku","Emperor Shanks");
  }
}
