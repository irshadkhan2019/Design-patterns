package com.izuku.command;
import com.izuku.command.fx.Command;

public class AddCustomerCommand implements Command {
    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
      this.service = service;
    }


    @Override
    public void execute() {
      // Delegate logic  to Customer service
      service.addCustomer();
    }
    
}
