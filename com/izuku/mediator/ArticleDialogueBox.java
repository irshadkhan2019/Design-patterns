package com.izuku.mediator;

public class ArticleDialogueBox extends DialogueBox{

  //below components belong to ArticleDialogBox(Owner)
  private ListBox articleListBox = new ListBox(this);
  private TextBox titleTextBox = new TextBox(this);
  private Button saveButton = new Button(this);

  public void simulateUserInteraction(){
    articleListBox.setSelection("Article One");
    titleTextBox.setContent(null);
    System.out.println("Textbox :"+ titleTextBox.getContent());
    System.out.println("Button :"+ saveButton.isEnabled());
  }

  @Override
  public void changed(UIControl control) {
    if(control == articleListBox){
      articleSelected();
    }
    else if (control == titleTextBox){
      titleChanged();
    }
  }
  private void titleChanged(){
   String content = titleTextBox.getContent();
   Boolean isEmpty =(content==null || content.isEmpty() );
   saveButton.setEnabled(!isEmpty);
  }
  private void articleSelected(){
    titleTextBox.setContent(articleListBox.getSelection());
    saveButton.setEnabled(true);
  }
  
}
