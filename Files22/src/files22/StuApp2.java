/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author brosnanb
 */
public class StuApp2 {

    public static void main(String[] args)  {
        //The students in the file will be added to the group sd2
        Group sd2 = new Group();
        double avg;
        String sName;
        int sNumber;
        boolean done = false;

        try (Scanner sc = new Scanner(new File("student2.txt"))) {
            while (done == false) { //needed to come back from catch if InputMismatchException occurs
                try {
                    while (sc.hasNext()) {
                        sNumber = sc.nextInt();
                        avg = (sc.nextDouble() + sc.nextDouble() + sc.nextDouble()) / 3;
                        sName = sc.next() + " " + sc.next();
                        sd2.add(new Student(sNumber, avg, sName));
                    }
                    done = true; //All input in the file has been processed
                } catch (InputMismatchException ex) {
                    System.out.println("Invalid data");
                    sc.next(); //move cursor on to next token in file
                    //but does this make sense in this context?
                    //look at gpa
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        sd2.displayAll();
    }

}
