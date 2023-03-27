/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author brosnanb
 */
public class StuApp {
//Assuming all data in the file is valid
    //FileNotFoundException will be handled by the JVM
    public static void main(String[] args) throws FileNotFoundException {
        //The students in the file will be added to the group sd2
        Group sd2 = new Group();
        File myFile = new File("student.txt");
        if (myFile.exists()) {
            Scanner sc = new Scanner(myFile);
            double avg;
            String sName;
            int sNumber;
            while (sc.hasNext()) {
                sNumber = sc.nextInt();
                avg = (sc.nextDouble() + sc.nextDouble() + sc.nextDouble()) / 3;
                sName = sc.next() + " " + sc.next();
                sd2.add(new Student(sNumber, avg, sName));
            }
        } else {
            System.out.println("Invalid file");
        }
        sd2.displayAll();
    }

}
