package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String[] bookName = new String[3];
    private static long Count;
    String[] authorName = new String[]{"a","b","c"};
    int[] pageCount = new int[50];
    static int[] bookCount = new int[50];
    static Scanner scanner = new Scanner(System.in);
    static Book[] books = new Book[50];

    public static void main(String[] args) {

        BookOperations operations = new BookOperations();
        System.out.println("----Kütüphane Otomasyon Sistemine Hoşgeldiniz!----");

        while (true) {
            System.out.println("\n 1. Kitabı Ekle");
            System.out.println("\n 2. Kitapları Listele");
            System.out.println("\n 3. Yazar Ara");
            System.out.println("\n 4. Sayfa Sayısı");
            System.out.println("\n 5. Toplam Kitap Sayısı");
            System.out.println("\n 6. Kitap Güncelleme");
            System.out.println("\n 7. Kitap Silme ");
            System.out.println("\n 8. Çıkış");
            System.out.println("\n Seçiminiz :");

            int selection = scanner.nextInt();
            scanner.nextLine();

        if (selection==1) {

               operations.addBook();


            }  else if(selection==2){
              
            operations.getAllBooks();

        }     else if (selection == 3) {   
                  operations.getBooksByAuthor();

            }  else if (selection == 4) {

                   operations.getTotalPageCount();

            }     else if (selection == 5) {
                      operations.getTotalBookCount();

              }    else if (selection == 6) {
                       System.out.print("Güncellemek istediğiniz kitabın ID'sini girin: ");
                       Long bookId = scanner.nextLong();
                       scanner.nextLine();
                       operations.updateBook(bookId);

             }     else if (selection == 7) {
                       System.out.print("Silmek istediğiniz kitabın ID'sini girin: ");
                       Long bookId = scanner.nextLong();
                       scanner.nextLine(); 

                       boolean deleted = operations.deleteBook(bookId);
                       if (deleted) {
                           System.out.println("Kitap başarıyla silindi.");
                       }

             }  else if (selection == 8) {
                         System.out.println("Çıkış yapılıyor. İyi Günler :)");
                         break;

             }













        }
    }

}





