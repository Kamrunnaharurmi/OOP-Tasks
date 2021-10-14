/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

/**
 *
 * @author Flora
 */
import java.util.Scanner;
public class Task2 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int A[]=new int[10];
        int k=0;
        int l=0;
        for(int i=0;i<10;i++)
        {
        A[i]=input.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            if(A[i]<0)
            {
                k++;
            }
            else
            {
                l++;
            }
        }
        System.out.printf("Number of negative number : %d\n",k);
        System.out.printf("Number of positive number : %d\n",l);
    }
}
