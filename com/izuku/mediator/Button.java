package com.izuku.mediator;

public class Button extends UIControl{
    public Button(DialogueBox owner) {
       super(owner);
  }

    private boolean isEnabled;

    public boolean isEnabled() {
      return isEnabled;
    }

    public void setEnabled(boolean isEnabled) {
      this.isEnabled = isEnabled;
      owner.changed(this);
    }

}
