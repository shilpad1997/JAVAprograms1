//Convert a string to title case (first letter uppercase)
package com.mycompany.mavenproject1;
import java.util.*;
public class StringPractice14_Title_case {
    public static void main(String args[]){
        System.out.println("Enter the string to change it to title case: ");
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        
        String str1=str + " ";
        String str2="";
        
        for(int i= 0; i< str1.length();i++){
            char ch= str1.charAt(i);
            if(ch != ' '){
            str2= str2 + ch;            
            }
            else{
                System.out.print(str2.substring(0,1).toUpperCase() + str2.substring(1,str2.length()) + " ");                
                str2="";
            }
            
        }
    }
}
