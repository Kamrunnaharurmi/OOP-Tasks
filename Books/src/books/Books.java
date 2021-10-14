/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

/**
 *
 * @author Flora
 */
public class Books {
    String title,author,publications;
    int page_num,price;
    
    void showInfo(){
        System.out.println("Book Name->    "+title);
        System.out.println("Writer Name->    "+author);
        System.out.println("Number of pages->    "+page_num);
        System.out.println("Book Price->    "+price);
        System.out.println("Book Name->    "+publications);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
