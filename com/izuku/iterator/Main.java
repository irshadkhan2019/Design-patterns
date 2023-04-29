package com.izuku.iterator;

public class Main {
    public static void main(String[] args) {
        BrowseHistory history =new BrowseHistory();
        history.push("google.com");
        history.push("amazoon.com");
        history.push("vlorant.com");
        Iterator itr=history.createIterator();

        while(itr.hasNext()){
          System.out.println(itr.current());
          itr.next();
        }

    }
}