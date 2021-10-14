/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Flora
 */
public class Book {
    String book_title,author,book_publication;
    int number_of_pages;
    int  book_price;
    
    void showInfo(){
        System.out.println("Book Title - "+book_title);
        System.out.println("Author - "+author);
        System.out.println("Price- "+book_price);
        System.out.println("Number of Pages - "+number_of_pages);
        System.out.println("Book Publication - "+book_publication);
        
    }
}
