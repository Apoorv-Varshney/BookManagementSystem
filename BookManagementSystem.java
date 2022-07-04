package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagementSystem {


   public static ArrayList<Rack> bookRack = new ArrayList<>();


    public static void main(String[] args) {
        BookManagementSystem bms = new BookManagementSystem();
        Scanner s = new Scanner(System.in);
        while(true){

            System.out.println("Enter 1 to add book");
            System.out.println("Enter 2 to delete book");
            System.out.println("Enter 3 to find book");
            System.out.println("Enter 4 to add New Rack");
            System.out.println("Enter 5 to quit");
            int input = s.nextInt();
            bms.addRack("MyRack");
            switch(input){

                case 1:{
                    System.out.println("Enter Book name");
                    String bname=s.next();
                    System.out.println("Enter Book author");
                    String bAuth = s.next();
                    System.out.println("Enter Book summary");
                    String bSum = s.next();
                    System.out.println("Enter book ID");
                    String bId = s.next();
                    bms.getRack().addBook(new Book(bId,bname,bAuth,bSum));
                    break;
                }
                case 2:{
                    System.out.println("Enter Book name");
                    String bname=s.next();
                    bms.getRack().removeBook(bname);
                    break;
                }
                case 3:{
                    System.out.println("Enter Book name");
                    String bname=s.next();
                    bms.getRack().findBook(bname);
                    break;
                }
                case 4:{
                    System.out.println("Enter Book name");
                    String rName=s.next();
                    bms.addRack(rName);
                    break;
                }
                case 5:{
                    break;
                }
            }

        }

    }


    public void addRack(String rackId){
        Rack rack = new Rack(rackId);
        bookRack.add(rack);
    }

    public Rack getRack(){
      return bookRack.get(bookRack.size()-1);
    }

    public Boolean deleteRack(String rackId){

        for(int i=0;i<bookRack.size();i++){

            if(bookRack.get(i).rackId.equals(rackId)){
                bookRack.remove(i);
                return  true;
            }
        }
        return false;
    }


}
