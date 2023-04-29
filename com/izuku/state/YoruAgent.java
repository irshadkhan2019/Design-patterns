package com.izuku.state;

public class YoruAgent implements Agent {

  public AgentType type=AgentType.DUELIST;

  @Override
  public void ultimate() {
    // TODO Auto-generated method stub
    System.out.println("ULT ---> I can go to another Dimension \n");
   
  }

  @Override
  public void basic() {
    // TODO Auto-generated method stub
    System.out.println("I am "+ type);
    System.out.println("I can Flash Others ");
    System.out.println("I can clone myself ");
  }
  
}
