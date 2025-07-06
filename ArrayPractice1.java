//finding sum of all the elements
package com.mycompany.mavenproject1;

public class ArrayPractice1 {
    public static void main(String args[]){
        int A[] = {1,2,3,4,5,6,7,8,9};
        int sum= 0;
               
        for(int i=0;i< A.length; i++){
            sum = sum + A[i];            
        }                
        System.out.println("Sum of all the element:" + sum);
    }
    
}
