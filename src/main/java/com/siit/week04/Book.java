package com.siit.week04;

public class Book {

    private String title;
    private String type;
    private String subtype;
    private int pageCount;
    private int bookCode;
    private boolean available;
    public int dayCheckedOut = -1;

//constructors

    public Book(String title, String type, int pageCount, int bookCode) {
        this.title = title;
        this.type = type;
        this.pageCount = pageCount;
        this.bookCode = bookCode;
        available = false;

    }

    //gtters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available, int currentDayCheckedOut) {
        this.available = available;
        setDayCheckedOut(dayCheckedOut);
    }

    public int getDayCheckedOut() {
        return dayCheckedOut;
    }

    private void setDayCheckedOut(int dayCheckedOut) {
        this.dayCheckedOut = dayCheckedOut;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }
}
