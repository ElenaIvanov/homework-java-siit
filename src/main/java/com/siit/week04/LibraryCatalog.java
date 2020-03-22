package com.siit.week04;

import java.util.*;

public class LibraryCatalog {
    //fields
    List<Book> bookCollection = new ArrayList<Book>();
    int currentDay = 0;
    int lengthCheckOutPeriod = 10;
    double lateFees = 1.0;

    //comstructors
    public LibraryCatalog(List<Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public LibraryCatalog(List<Book> bookCollection, int currentDay, int lengthCheckOutPeriod, double lateFees) {
        this.bookCollection = bookCollection;
        this.currentDay = currentDay;
        this.lengthCheckOutPeriod = lengthCheckOutPeriod;
        this.lateFees = lateFees;
    }

    //main
    public static void main(String[] args) {
        //create list of book
        List<Book> bookCollection = new ArrayList<Book>();
          //create book abject
           Book book1 = new Book("Harry Potter and bla bla", "novel", 789, 1234);
           Book book2 = new Book("Michelangelo's art collection", "art collection", 431, 1235);
           Book book3 = new Book("Casa din intuneric", "novel", 200, 1255);
           Book book4 = new Book("Book to be removed", "art collection", 125, 1295);
           //assign them subtypes
           book1.setSubtype("mystery");
           book2.setSubtype("high quality paper");
           book3.setSubtype("SF");
          //add the books to the collection library
        bookCollection.add(book1);
        bookCollection.add(book2);
        bookCollection.add(book3);
        bookCollection.remove(book4);

        System.out.println("\nHello. Welcome to my library. We have various types of books, like: " +
                                book1.getType() + " and " + book2.getType() +".");

        //list all books in the library
        System.out.println("The entire collection of books:");
        for(int i = 0; i < bookCollection.size(); i++) {
            System.out.println(bookCollection.get(i).getTitle());
        }

        System.out.println("Check the availability of the books in the library:");
        //calling the constuctor on the book coll
        LibraryCatalog lc = new LibraryCatalog(bookCollection);
        //to finish
    }




    //instance methods
    public void checkOutBook(String title){
        Book book = getBook(title);
        if(book.isAvailable() ){
            notAvailable(book);
        } else {
            book.setAvailable(true, currentDay);
            System.out.println("Hello! You just checked out the book "+ title + ". You have to return it in " + (getCurrentDay() + getLengthCheckOutPeriod()) + " days.");
        }
    }

    public void returnBook(String title){
        Book book = getBook(title);
        int totalDaysLate = currentDay - (book.getDayCheckedOut() + getLengthCheckOutPeriod());

        if(totalDaysLate>0){
            System.out.println("You have to pay RON" + getLateFees() + " because you are late reutrining the book with " + totalDaysLate);
        } else {
            System.out.println("Thank you for returining the book on time.");
        }
        book.setAvailable(false, -1);
    }

    public void notAvailable(Book book){
        System.out.println("We are sorry. The book you are looking for: " + book.getTitle() + " is not available anymore. You can check again in " + (book.getDayCheckedOut() +
                            getLengthCheckOutPeriod()));
    }

    //getters and setters
    public Book getBook(String bookTitle) {
        return getBookCollection().get(Integer.parseInt(bookTitle));
    }

    public List<Book> getBookCollection() {
        return bookCollection;
    }

    public void setBookCollection(List<Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(int currentDay) {
        this.currentDay = currentDay;
    }

    public int getLengthCheckOutPeriod() {
        return lengthCheckOutPeriod;
    }

    public void setLengthCheckOutPeriod(int lengthCheckOutPeriod) {
        this.lengthCheckOutPeriod = lengthCheckOutPeriod;
    }

    public double getLateFees() {
        return lateFees;
    }

    public void setLateFees(double lateFees) {
        this.lateFees = lateFees;
    }
}
