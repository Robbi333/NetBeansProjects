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
public class StuApp3 {

    public static void main(String[] args) throws FileNotFoundException {
        //The students in the file will be added to the group sd2
        Group sd2 = new Group();
        double avg;
        String sName;
        int sNumber;
        boolean done = false;

        String line;
        String[] aLine;
        Scanner lSc;
        try (Scanner sc = new Scanner(new File("student2.txt"))) {
            while (done == false) { //needed to come back from catch if InputMismatchException occurs
                try {
                    while (sc.hasNext()) {
                        line = sc.nextLine();
                      // lSc = new Scanner(line);
                       //"hello how are you".split(" ");
                        aLine = line.split(" ");
                        if (aLine.length == 6) {
                            sNumber = Integer.parseInt(aLine[0]);
                            //sNumber = lSc.nextInt();
                            avg = (Double.parseDouble(aLine[1]) + Double.parseDouble(aLine[2]) + Double.parseDouble(aLine[3])) / 3;
                            sName = aLine[4] + " " + aLine[5];
                            sd2.add(new Student(sNumber, avg, sName));
                        }
                        else{
                            System.out.println("Missing data from this Student");
                        }
                    }
                    done = true; //All input in the file has been processed
                } catch (NumberFormatException ex) {
                    System.out.println("Ignore this one - invalid data");

                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        sd2.displayAll();
       //sd2.getGPA40();
        //sd2.getRepeats();
        
        sd2.getLower40("Student.txt");
    }
}
