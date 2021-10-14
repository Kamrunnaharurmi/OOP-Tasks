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
public class Task2 {
    public static void main(String[] args){
        Book book1,book2,book3;
        book1=new Book();
        book2=new Book();
        book3=new Book();
        
        book1.book_title="JAVA for Beginners 3rd edition";
        book1.author="Prof. David";
        book1.number_of_pages=537;
        book1.book_price=299;
        book1.book_publication="Easy Coding Publications";
        
        book2.book_title="Omega Point 12th edition";
        book2.author="Humayun Ahmed";
        book2.number_of_pages=122;
        book2.book_price=128;
        book2.book_publication="Shomoy Prokashoni";
        
        book3.book_title="Digital Fortress 5th edition";
        book3.author="Dan Brown";
        book3.number_of_pages=356;
        book3.book_price=520;
        book3.book_publication="St. Martin Press";
        
        System.out.println("Book1");
        book1.showInfo();
        System.out.println("Book2");
        book2.showInfo();
        System.out.println("Book3");
        book3.showInfo();
        
        System.out.println("Book1-"+book1);
        System.out.println("Book2-"+book2);
        System.out.println("Book3-"+book3);
        
        book1=book3;
        book1.book_title="Digital Fortress 5th edition";
        book1.showInfo();
        
        System.out.println("Book1-"+book1);
        System.out.println("Book2-"+book2);
        System.out.println("Book3-"+book3);          
    }
    
}
