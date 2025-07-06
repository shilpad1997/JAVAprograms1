//Finding maximum element
package com.mycompany.mavenproject1;


public class ArrayPractice3 {
    public static void main(String args[]){
        int A[]= {1,7,0,98,7,8,9,358,45,789,741};
        int max= A[0];
        
        
        for(int i = 0; i< A.length; i++){
            if(A[i] > max){
                max= A[i];
            }
        }
        System.out.println("Maximum number:" +max);
    }
    
}
