package com.izuku.memento;

public class Main {
    public static void main(String[] args) {
       Editor editor=new Editor();
       History history =new History();
       System.out.println(editor.getContent());
       System.out.println(history);
       editor.setContent("a");
       System.out.println(editor.getContent());
       history.push(editor.createState());
       System.out.println("content:"+editor.getContent());
       System.out.println("list top:"+history.topState().getContent());
       
       editor.setContent("b");
       history.push(editor.createState());
       System.out.println("content:"+editor.getContent());
       System.out.println("list top:"+history.topState().getContent());
       
       editor.setContent("c");
       editor.restore(history.pop()); 
       System.out.println("content:"+editor.getContent());
       System.out.println("list top:"+history.topState().getContent());
       
       

       


    }
}