package com.company;

import java.util.ArrayList;

public class Rack {


    public String rackId;
    private ArrayList<Book> books = new ArrayList<Book>(10);


    public Rack(String rackId) {
        this.rackId = rackId;
    }


    public boolean addBook(Book book) {
        if (this.books.size() >= 10) {
            return false;
        }
        else {
            books.add(book);
        }
        return false;
    }

    public Book findBook(String bookName) {
      for(Book book :this.books){

          if(book.getBookName().equals(bookName)){
              return book;
          }

      }
      return null;
    }


    public boolean removeBook(String bookName){
        if(this.books.size()==0){
            System.out.println("rack already Empty");
            return false;
        }

        for (int i = 0; i <books.size() ; i++) {
            if(books.get(i).getBookName().equals(bookName)){
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    public final int getRackSize() {
        return this.books.size();
    }

    public final String getRackId(){
        return this.rackId;
    }


}
