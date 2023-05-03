package com.izuku.visitor;

public class HighlightOperation implements Operation{

  @Override
  public void apply(HeadingNode headingNode) {
    System.out.println("Highligting Heading");
  }

  @Override
  public void apply(AnchorNode anchorNode) {
    System.out.println("Highligting Anchor");
  }
  
}
