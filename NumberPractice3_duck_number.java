//Duck number= a number which has zeros present in it e.g 402, 280
package com.mycompany.mavenproject1;
import java.util.*;

public class NumberPractice3_duck_number {
    public static void main(String args[]){
         System.out.println("Enter the number: ");
         Scanner input= new Scanner(System.in);
         int n= input.nextInt();
         int m= n;
         int count=0;
         while(n!=0){
             int d= n%10;
             if(d==0){
                 count++;
             } 
             n=n/10;
         }
        if(count> 0){
            System.out.println("It is a duck number!!");
        }
        else{
            System.out.println("It is not a duck number!!");
        }
    }     
    
}
