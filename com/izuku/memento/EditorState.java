package com.izuku.memento;

public class EditorState {

  private final String content;

  // contructor
  public EditorState(String content){
    this.content=content;
  }

  public String getContent(){
    return content;
  }

}