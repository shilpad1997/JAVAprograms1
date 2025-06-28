//Reverse Words
//Given "Java is fun", output "fun is Java".
package com.mycompany.mavenproject1;
import java.util.*;

public class StringPractice16_reversing_a_string {
    public static void main(String args[]){
        System.out.println("Enter the string:");
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String str3="";
        String str1= str + " ";
        String str2="";
        
        for(int i=0; i< str1.length(); i++){
            char ch= str1.charAt(i);
            if(ch != ' '){
                str2= str2 + ch;
            }
            else{
                str3 = str2 + " "+ str3;
                str2="";
            }
        }
        System.out.println("Reverse of the string: " + str3);           
    }
}
