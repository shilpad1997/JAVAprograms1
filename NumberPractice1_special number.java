//special number= sum of the digit + product of the digit = the number
package com.mycompany.mavenproject1;
import java.util.*;

public class NumberPractice1 {
    public static void main(String args[]){
         System.out.println("Enter the number: ");
         Scanner input= new Scanner(System.in);
         int n= input.nextInt();
         int m=n;
         int sum= 0;
         int prod=1;
         
         while(n!=0){
             int d= n%10;
             sum= sum+ d;
             prod= prod *d;
             n=n/10;             
        }
        int num= sum +prod;
        if(num==m){
            System.out.println("Its is a special num");
        }
        else{
            System.out.println("Its is not a special num");
        }     
        
         
    }
   
    
}
