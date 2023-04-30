package com.izuku.command;

public class Main {
  public static void main(String[] args) {
      CustomerService service =new CustomerService();
      AddCustomerCommand addCustomer=new AddCustomerCommand(service);
      addCustomer.execute();

      System.out.println("------------------------- \n");
      //recording commands and reexecuting  later section
      CompositeCommand allCommands=new CompositeCommand();
      allCommands.add(new BrightnessCommand());
      allCommands.add(new ResizeCommand());
      allCommands.execute();

  }
}
