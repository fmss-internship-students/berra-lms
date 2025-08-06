package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

    public class BookOperations {
    private static final Scanner scanner = new Scanner(System.in);
    List<Book> books = new ArrayList<>();

    public Book addBook() {
        // book alanlarını al

        System.out.println("ID giriniz:");
        Long id = scanner.nextLong();
        scanner.nextLine();

        System.out.println("bookName");
        String bookName= scanner.nextLine();

        System.out.println("authorName");
        String authorName= scanner.nextLine();

        System.out.println("pageCount");
        int pageCount= scanner.nextInt();
        scanner.nextLine();

        System.out.println("count");
        int count= scanner.nextInt();
        scanner.nextLine();

        // Book nesnesi oluştur
        Book book = new Book(id, bookName, authorName, pageCount, count);



        // book nesnesini listeye ekle

        books.add(book);
        System.out.println("Kitap Başarıyla Eklendi: " + book.getBookName());

        return book;
    }

    public Book updateBook(Long bookId) {
        // id ile book nesnesini listeden bul
        // Book nesnesinin alanlarını güncelle
        // Book nesnesini kaydet

            for (Book book : books) {
                if (book.getId().equals(bookId)) {
                    System.out.println("Yeni Kitap Adı: ");
                    String newBookName = scanner.nextLine();

                    System.out.println("Yeni Yazar Adı: ");
                    String newAuthorName = scanner.nextLine();

                    System.out.println("Yeni Sayfa Sayısı: ");
                    int newPageCount = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Yeni Kitap Adedi: ");
                    int newCount = scanner.nextInt();
                    scanner.nextLine();

                    book.setBookName(newBookName);
                    book.setAuthorName(newAuthorName);
                    book.setPageCount(newPageCount);
                    book.setCount(newCount);

                    System.out.println("Kitap başarıyla güncellendi: " + book.getBookName());
                    return book;
                }
            }
            System.out.println("Kitap bulunamadı!");
        return null;
    }

    public boolean deleteBook(Long bookId) {
        // id ile book nesnesini bul
        // book nesnesini listeden kaldır

        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    public Book getBookById(Long bookId) {
        // id ile book nesnesini bul
        // Book nesnesini dön

        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return book;
            }
        }

        return null;
    }

    public List<Book> getAllBooks() {
        // Listededeki book nesnelerini liste halinde dön

            for (Book book : books) {
                System.out.println("Kitap Adı: " + book.getBookName());
                System.out.println("Yazar Adı: " + book.getAuthorName());
                System.out.println("Sayfa Sayısı: " + book.getPageCount());
                System.out.println("Kitap Adedi: " + book.getCount());
            }

        return books;
          }


        public void getBooksByAuthor() {
            System.out.print("Lütfen yazar adını girin: ");
            String author = scanner.nextLine();

            boolean bulundu = false;

            for (Book book : books) {
                if (book.getAuthorName().equalsIgnoreCase(author)) {
                    System.out.println("Kitap: " + book.getBookName());
                    bulundu = true;
                }
            }

        }


        public void getTotalPageCount() {
            System.out.println("Kitaplar ve Sayfa Sayıları:");
            for (Book book : books) {
                System.out.println( " " + book.getBookName() + ": " + book.getPageCount() + " sayfa");

            }

        }


        public void getTotalBookCount() {
            int count = books.size();
            System.out.println("Toplam kitap sayısı: " + count);

        }




    }

