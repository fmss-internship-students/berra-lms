package org.example;


public class Book {

   private String bookName;
   private String authorName;
   private int pageCount;
   private int Count;
   private Long id;

    public Book( Long id, String bookName, String authorName, int pageCount, int Count) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.pageCount = pageCount;
        this.Count = Count;
    }

    public Long getId() {
        return id;
    }

     public String getBookName() {
     return bookName;

    }


    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    public String getAuthorName() {
    return authorName;

    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageCount() {
        return pageCount;
    }



    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }


    public int getCount() {
        return Count;
    }


    public void setCount(int count) {
        this.Count = count;
    }
}