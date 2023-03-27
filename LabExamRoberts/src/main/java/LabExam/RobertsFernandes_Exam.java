/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExam;

import utils.FileHandlingUtilities;
import utils.StringUtilities;


/**
 *
 * @author D00251715
 */
public class RobertsFernandes_Exam {
    public static void main(String[] args) {
        String[] textarr = FileHandlingUtilities.readTextFile("SampleInput/LabExamSampleInput.txt");
        
        System.out.println("Normal Array");
    StringUtilities.print(textarr);
    
    
        System.out.println("New Array");
    StringUtilities.print(StringUtilities.partitionString(textarr, "Helen"));
      
    int stop = StringUtilities.wordFinder(textarr, "Helen");
    
    StringUtilities.blankDeleteDeduplicate(textarr,stop);
    
       
    }
   
}
