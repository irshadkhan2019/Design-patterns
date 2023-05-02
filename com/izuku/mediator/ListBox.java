package com.izuku.mediator;

public class ListBox extends UIControl {
  public ListBox(DialogueBox owner) {
    super(owner);
  }

  private String Selection;

  public String getSelection() {
    return Selection;
  }

  public void setSelection(String selection) {
    Selection = selection;
    owner.changed(this);
  }

}
