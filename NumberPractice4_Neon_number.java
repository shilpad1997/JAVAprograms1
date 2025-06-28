//A neon number is a number where the sum of digits of the square of the number is equal to the number
package com.mycompany.mavenproject1;
import java.util.*;

public class NumberPractice4_Neon_number {
        public static void main(String args[]){
         System.out.println("Enter the number: ");
         Scanner input= new Scanner(System.in);
         int n= input.nextInt();
         int sum=0;
         int m=n;
         int sq= n*n;
         
         while(sq != 0){
             int d=sq % 10;
             sum= sum + d;
             sq= sq/10;
        }
        if(sum== m){
            System.out.println("It is a neon num!!");
        }
        else{
            System.out.println("It is not a neon num!!");
        }
    }    
}
