package com.izuku.state;

public class Main {
    public static void main(String[] args) {
      Valorant agent=new Valorant();
      System.out.println("SAGE AGENT State \n");
      agent.setCurrentAgent(new SageAgent());
      agent.ultimate();
      agent.basic();
     


      System.out.println("Yoru AGENT State \n");
      agent.setCurrentAgent(new YoruAgent());
      agent.ultimate();
      agent.basic();
    }
}