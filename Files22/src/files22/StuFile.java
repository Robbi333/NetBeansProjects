/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files22;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author brosnanb
 */
public class StuFile {
    // Write a program that reads a file student.txt. 
    //Format: StudentNumber examMark1 examMark2 examMark3 StudentName. 
    //You may assume that all data in the file is valid. 
    //Your program should output each students name and their average mark. 

    public static void main(String[] args) throws FileNotFoundException { //Why do we need a throws clause? What else could we have done?
        File myFile = new File("student.txt");
        DecimalFormat df = new DecimalFormat("#.##");
        if (myFile.exists()) { //What would be the impact of removing this if statement?
            Scanner sc = new Scanner(myFile);
            double avg;
            while (sc.hasNext()) {
                sc.next();//What is the purpose of this statement? Why is the value read from the file not stored in a variable?
                avg = (sc.nextDouble() + sc.nextDouble() + sc.nextDouble()) / 3; //Explain
                System.out.println(sc.next() + " " + sc.next() + " got " + df.format(avg)); //What happens if the name in the file is enclosed in ""?
            }
        } else {
            System.out.println("Invalid file");
        }
    }
}
