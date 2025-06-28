//Count the number of words in a string
package com.mycompany.mavenproject1;
import java.util.*;

public class StringPractice15_num_of_words_In_a_String {
    public static void main(String args[]){
        System.out.println("Enter the string:");
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        
        String str1= str + " ";
        int count= 0;
        String str2= "";
        for(int i=0; i< str1.length(); i++){
            char ch= str1.charAt(i);
            if(ch != ' '){
                str2 = str2 + ch;
            }
            else{
                count++;
                str2= "";
            }           
        }
        System.out.println("Number of words in the string: " + count);                
    }
}
