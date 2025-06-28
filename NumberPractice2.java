//A Niven number, also known as a harshad number, is a number that is divisible by the sum of its digits
//For example, 126 is a Niven number because 1 + 2 + 6 = 9, and 126 is divisible by 9. 
package com.mycompany.mavenproject1;
import java.util.*;

public class NumberPractice2 {
     public static void main(String args[]){
         System.out.println("Enter the number: ");
         Scanner input= new Scanner(System.in);
         int n= input.nextInt();
         int sum = 0;
         int m= n;
         
         while(n != 0){
             int d= n % 10;
             sum= sum +d;
             n = n/10;             
         }
         if(m%sum==0){
             System.out.println("Niven number!!");
         }
         else{
             System.out.println("Not a Niven number!!");
         }
             
     }
}
