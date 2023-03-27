
package oo.programming;

import java.util.Random;
import java.util.Scanner;

public class OOProgramming {

    public static void main(String[] args) {
       
        // double rg = Math.random();
         Scanner sc = new Scanner(System.in);     
        // String s = "go";   
        // String = s2 = new String("go2");
        //System.out.println(StringBuilder.class); 
        //StringBuilder a = new StringBuilder();
        //a.append(a);
                
        /*Write a program that asks the user to enter the first name of a friend,
a favourite activity, a favourite colour and an emotion, and then prints the following line
(replacing the items in italics):
I had a dream that name went activity and turned colour from emotion! */

        
        
       
        
       
         System.out.println("Enter your friends name");
         String FName = sc.next();
         
         System.out.println("Enter your favourite color");
         String Color = sc.next();
         
         System.out.println("Enter an emotion");
         String Emotion = sc.next();
         
          System.out.println("Enter an activity");
         String ACT = sc.next();
         
         System.out.println("I had a dream that " + FName + " went " + ACT + " and turned " + Color + " and an " + Emotion);
         
    }
    
    
    
    
}
