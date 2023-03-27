/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brosnanb
 */
public class Group {

    private ArrayList<Student> myStuds; //Why is Student in <>? What would be the impact of  private ArrayList myStuds;?

    public Group() { //The constructor assigns values to the fields/instance variables of the class
        myStuds = new ArrayList<>();
    }

    public boolean add(Student s) {
        return myStuds.add(s);
    }

    public boolean add(String f) { //f is the name of the file where the student data is stored
        Group sd2 = new Group();
        double avg;
        String sName;
        int sNumber;
        boolean done = false;

        String line;
        String[] aLine;
        Scanner lSc;
        try ( Scanner sc = new Scanner(new File("student2.txt"))) {
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
                        } else {
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
        return false;
    }
//    public boolean add(File f){
//        
//    }

    public void displayAll() {
        System.out.println(myStuds);
    }
    //Write a method in Group to output the details 
    //of all students with a gpa >= 40 to a new file year2Student.txt.

   public void getover40(String name) throws FileNotFoundException {
        PrintWriter outToFile = new PrintWriter(new File("students2.txt"));
        for (Student a : myStuds) {
            if (a.getGpa() < 40) {
                outToFile.println(a.getName()+ " " + a.getId() + " "+ a.getGpa());
            }
        }
   }
   
    public void getLower40(String name) throws FileNotFoundException {
        PrintWriter outToFile = new PrintWriter(new File("repeats.txt"));
        for (Student a : myStuds) {
            if (a.getGpa() < 40) {
                outToFile.println(a.getName()+ " " + a.getId() + " "+ a.getGpa());
            }
        }

    }

}
