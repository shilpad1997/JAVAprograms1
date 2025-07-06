//Searching an Element
package com.mycompany.mavenproject1;
import java.util.*;
public class ArrayPractice2 {
    public static void main(String args[]){
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the element you want to search :");
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();       
        
        for(int i = 0; i < A.length; i++){
            if(A[i]==a){
                System.out.println("Element found at the position:" + i); 
                System.exit(0);
            }
            
        }
        System.out.println("Element not present!!");  
    }
}
