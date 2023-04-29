package com.izuku.state;

public class Valorant {
  private Agent currentAgent;

  public void ultimate(){
    currentAgent.ultimate();
  }
  public void basic(){
    currentAgent.basic();
  }

  public Agent getCurrentAgent(){
     return currentAgent;
  }
  public void setCurrentAgent(Agent newAgent){
    this.currentAgent=newAgent;
 }
 



}
