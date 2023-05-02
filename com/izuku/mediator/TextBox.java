package com.izuku.mediator;

public class TextBox extends UIControl {
  public TextBox(DialogueBox owner) {
    super(owner);
  }

  private String content;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
    owner.changed(this);
  }

}
