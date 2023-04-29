package com.izuku.state;

public class SageAgent implements Agent {
  public AgentType type=AgentType.SENTINEL;

  @Override
  public void ultimate() {
    // TODO Auto-generated method stub
    System.out.println("ULT--> I can Revive Others \n ");
   
  }

  @Override
  public void basic() {
    // TODO Auto-generated method stub
    System.out.println("I am "+ type);
    System.out.println("I can Heal Others ");
    System.out.println("I can slow Others ");
  }

  
}
