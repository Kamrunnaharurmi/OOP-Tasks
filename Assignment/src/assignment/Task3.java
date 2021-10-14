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
public class Task3 {
    public static void main(String[] args){
         BillCalculator myamount;
         myamount = new BillCalculator();
         System.out.println("Total Bill for 25 units = "+myamount.getTotalBill(25));
         System.out.println("Total Bill for 250 units = "+myamount.getTotalBill(250));
         System.out.println("Total Bill for 812 units = "+myamount.getTotalBill(812));
    }
}