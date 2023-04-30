package com.izuku.command.editor;

public class UndoCommand implements Command{
  private History history;

  public UndoCommand(History history) {
    this.history = history;
  }

  
  @Override
  public void execute() {
    if (history.size() >0) {
      //history pop() gives Last BoldCOmmand from Deque and 
      //that last BoldCommand obj has refernce to HTMLDOC and  Unexecute method which changes the
      //HTmldoc content to its prevCOntent prperty set in BoldCommand
      history.pop().unexecute();
    }
  }
  
}
