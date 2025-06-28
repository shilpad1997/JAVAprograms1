//An automorphic number is a number whose square ends in the same digits as the number itself.
//n = 76:
//n2 = 5776
//Last two digits of 5776 are 76, so 76 is automorphic
package com.mycompany.mavenproject1;
import java.util.*;

public class NumberPractice5_Automorphic_number {
    public static void main(String args[]){
         System.out.println("Enter the number: ");
         Scanner input= new Scanner(System.in);
         int n= input.nextInt();
         int count=0;
         //int m= n;
         int n2= n*n;
         
         while(n !=0){
             int d= n % 10;
             int d2= n2 % 10;
             if(d!=d2){
                 count++;
             }
             n=n/10;
             n2=n2/10;             
         }
         if(count == 0){
             System.out.println("It is a automorphic number!!");
         }
         else{
             System.out.println("It is not a automorphic number!!");
         }
    }
}
