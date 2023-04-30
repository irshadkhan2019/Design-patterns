package com.izuku.command.editor;

public class Main {
  public static void main(String[] args) {

    //Write Doc content
    HtmlDocument document=new HtmlDocument();
    document.setContent("One 4 All");
    System.out.println(document.getContent());

    //create history to store commands
    History history=new History();

    //create Bold command
    BoldCommand command = new BoldCommand(document, history);
    command.execute();

    //document after bold
    System.out.println(document.getContent());

    //reverting/undo bold
    UndoCommand undo=new UndoCommand(history);
    undo.execute();

    //htmldoc content after Undo operation
    System.out.println(document.getContent());


  }
}
