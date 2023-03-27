/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.programming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author D00251715
 */
public class FileInput {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("numbers.txt");
        Scanner input = new Scanner(file);
        
        
//        int total = 0;
//        for (int i = 0; i < 10; i++) {
//            int num = input.nextInt();
//         
//            total = total + num;
//        }
//        total = total / 10;
//        System.out.println("The average is " +total);
        
        
        System.out.println("These are all the Even Numbers in the file");
        while(input.hasNext()){
          int num = input.nextInt();
        if(num % 2 == 0){
            
            System.out.println(num);
        }
        }
    }
}
