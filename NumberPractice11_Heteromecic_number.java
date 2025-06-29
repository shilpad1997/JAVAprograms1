//A Pronic number, also known as a Heteromecic number or Rectangular number, 
//is a number that is the product of two consecutive integers.
package com.mycompany.mavenproject1;
import java.util.Scanner;


public class NumberPractice11_Heteromecic_number {
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum= 0; int m= n;
        for(int i=1; i< n;i++){
            if(n%i ==0){
                if(i*(i+1)==n){
                    sum++;                    
                }
            }
            
        }
        if(sum== 0){
            System.out.println("Not a Pronic number");
        }
        else{
            System.out.println("A Pronic number");
        }
}
}       
