/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editorit
 */
package task;

/**
 *
 * @author Flora
 */
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b;
        double z;
        char l;
        System.out.print("Enter First Number: ");
        a = input.nextInt();
        System.out.print("Enter Second number: ");
        b = input.nextInt();
        System.out.print("1.Addition(+)\n");
        System.out.print("2.Substraction(-)\n");
        System.out.print("3..Multiplication(*)\n");
        System.out.print("4.Division(/)\n");
        l = input.next().charAt(0);
        switch(l){
            case '1':
                System.out.printf("The result is %d\n",a+b);
                break;
            case '2':
                System.out.printf("The result is %d\n",a-b);
                break;
            case '3':
                System.out.printf("The result is %d\n",a*b);
                break;
            case '4':
                z = a/b;
                System.out.printf("The result is %.2d\n",z);
                break;
    }
    }
}
