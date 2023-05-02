package com.izuku.chainOfResponsibility;

public class Authenticator extends Handler {

  public Authenticator(Handler next) {
    super(next);
  }

  // call by Handle method obtained via Handler class parent
  @Override
  public boolean doHandle(HttpRequest request) {
     boolean isValid=(request.getUsername()=="izuku" && 
                      request.getPassword()=="1234"
                         );
     System.out.println("Authentication");                    
     return !isValid;                    
  }
  
}
