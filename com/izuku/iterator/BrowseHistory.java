package com.izuku.iterator;

public class BrowseHistory {
  private String[] urls =new String[10];
  private int count;

  public void push(String url){
    urls[count++]=url;
  }

  public String pop(){
    return urls[--count];
  }

  public Iterator createIterator(){
    return new ArrayIterator(this);
  }

  //Inner class 
  public class ArrayIterator implements Iterator{

    private BrowseHistory history;
    private int index;

    public ArrayIterator(BrowseHistory history){
      this.history=history;
    }

    @Override
    public boolean hasNext() {
      // TODO Auto-generated method stub
      return (index<history.count);
      
    }

    @Override
    public String current() {
      // TODO Auto-generated method stub
      return history.urls[index];
      
    }

    @Override
    public void next() {
      // TODO Auto-generated method stub
       index++;
      
    }

  }

}
