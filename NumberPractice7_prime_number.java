//Find if a number is a prime number. 
//A prime number is a natural number greater than 1, divisible only by 1 and itself.
//Examples include 2, 3, 5, 7, and 11. 
package com.mycompany.mavenproject1;
import java.util.*;

public class NumberPractice7_prime_number {
         public static void main(String args[]){
         System.out.println("Enter the number: ");
         Scanner input= new Scanner(System.in);
         int n= input.nextInt();
         int count=0;
         
         for(int i=1; i <=n; i++){
             if(n%i == 0){
                 count++;
             }                 
         }
         if(count == 2){
             System.out.println("Its a Prime number");             
         }
         else{
             System.out.println("Its not a Prime number");   
         }
        
    }
    
}
