package com.siit.week04.LibraryApp;

import com.siit.week04.LibraryApp.Entity.Album;
import com.siit.week04.LibraryApp.Entity.Book;
import com.siit.week04.LibraryApp.Entity.Novel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
@AllArgsConstructor
public class LibraryCatalog {
    //fields
    private static List<Book> bookCollection = new ArrayList<Book>();
    private static List<Novel> novels = new ArrayList<>();
    private static List<Album> albums = new ArrayList<>();

    int currentDay = 0;
    int lengthCheckOutPeriod = 10;
    double lateFees = 1.0;


    public static void main(String[] args) {
        Novel novel1 = new Novel("Head First Java", 780, 3333, true, "Personal Development");
        Novel novel2 = new Novel("Head First Design Patterns", 600, 9999, true, "Personal Skils Improvement");
        Novel novel3 = new Novel("Bla bla bla", 8, 9998, true, "Sci-Fi");
        novels.add(novel1);
        novels.add(novel2);
        novels.add(novel3);
        novels.remove(novel3);

        Album album1 = new Album("Album ART", 199, 90000, true, "High");
        Album album2 = new Album("Album State of mind", 500, 90001, false, "Average");
        Album album3 = new Album("Album bla bla", 99, 1245, true, "Poor");
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);
        albums.remove(album3);

        addToBookCollection(bookCollection, novels, albums);
        removeBook(bookCollection, 0);
        showAllBooks(bookCollection, novels, albums);


    }
    //instance methods

    public static void showAllBooks(List<Book> bookCollention, List<Novel> novels, List<Album> albums) {
        int size = bookCollention.size();

        for (int i = 0; i <= size - 1; i++) {
            if (bookCollention.get(i) instanceof Novel) {
                System.out.println(bookCollention.get(i).getBookName() + " is a novel by type " + ((Novel) bookCollention.get(i)).getType());

            } else if (bookCollention.get(i) instanceof Album) {
                System.out.println(bookCollention.get(i).getBookName() + " ia an album. The paper quality is " + ((Album) bookCollention.get(i)).getPaperQuality());
            }
        }
    }

    public static int addToBookCollection(List books, List novels, List albums) {
        int novelSize = novels.size();
        int albumSize = albums.size();

        for (int j = 0; j <= novelSize - 1; j++) {
            books.add(novels.get(j));
        }
        for (int i = 0; i <= albumSize - 1; i++) {
            books.add(albums.get(i));
        }
        return novelSize;
    }

    public static void removeBook(List<Book> bookCollection, int i) {
        System.out.println("The title " + bookCollection.get(i).getBookName() + " was removed from the book collection ");
        bookCollection.remove(i - 1);
    }


    public void checkOutBook(String title) {
        Book book = getBook(title);
        if (book.isAvailable()) {
            notAvailable(book);
        } else {
            book.setAvailable(true);
            System.out.println("Hello! You just checked out the book " + title + ". You have to return it in " + (getCurrentDay() + getLengthCheckOutPeriod()) + " days.");
        }
    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int totalDaysLate = currentDay - (book.getDayCheckedOut() + getLengthCheckOutPeriod());

        if (totalDaysLate > 0) {
            System.out.println("You have to pay RON" + getLateFees() + " because you are late reutrining the book with " + totalDaysLate);
        } else {
            System.out.println("Thank you for returining the book on time.");
        }
        book.setAvailable(false);
    }

    private Book getBook(String title) {
    }

    public void notAvailable(Book book) {
        System.out.println("We are sorry. The book you are looking for: " + book.getBookName() + " is not available anymore. You can check again in " + (book.getDayCheckedOut() +
                getLengthCheckOutPeriod()));
    }


}
