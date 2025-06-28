//A composite number is a positive integer that is not prime.
//In other words, it has a positive divisor other than one or itself. 
package com.mycompany.mavenproject1;
import java.util.*;

public class NumberPractice8_composite_number {
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
         if(count > 3){
             System.out.println("Its a Composite number");             
         }
         else{
             System.out.println("Its not a Composite number");   
         }
        
    }
}
