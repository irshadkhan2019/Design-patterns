package com.izuku.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
  
  private List<EditorState> states=new ArrayList<>();

  public void push(EditorState state){
      states.add(state);
  }

  public EditorState pop(){
    Integer lastIndex=states.size()-1;
    EditorState lastState=states.get(lastIndex);
    states.remove(lastState);
    return lastState;
  }

  public EditorState topState(){
    return states.get(states.size()-1);
  }

}
