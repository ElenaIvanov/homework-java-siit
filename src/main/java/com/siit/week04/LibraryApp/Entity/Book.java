package com.siit.week04.LibraryApp.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Book {

    private String bookName;
    private int pageCount;
    private int bookCode;
    private boolean available;


    public int getDayCheckedOut() {
        return 0;
    }
}

}
