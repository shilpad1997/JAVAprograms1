//A perfect number in Java, and in mathematics generally, is a positive integer that is equal to the 
//sum of its proper positive divisors (divisors excluding the number itself)
// (1 + 2 + 3) equals 6
package com.mycompany.mavenproject1;
import java.util.*;

public class NumberPractice9_Perfect_Number {
         public static void main(String args[]){
         System.out.println("Enter the number: ");
         Scanner input= new Scanner(System.in);
         int n= input.nextInt();
         int sum=0;
         int m= n;
         for(int i= 1; i<= n; i ++){
             if(i!=n && n%i==0){
                 sum=sum+i;
             }                 
        }
        if(sum==m){
            System.out.println("A perfect number");
        }
        else{
            System.out.println("not A perfect number");
        }
         
    }
}
