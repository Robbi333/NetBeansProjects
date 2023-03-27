/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Random;

/**
 *
 * @author D00251715
 */
public class coolthing { 

    
    static String[] createAlphaNumericArrayStrings(int stringLength, int sizeOfStringArray) {

        //defining the content of the string.
        String allCharStringContains = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvxyz";

        //.length() returns the total number of characters contained in the string
        int maximum = allCharStringContains.length();

        StringBuffer stringBufferObj;
        //here array of a string is created with the size we sent as an argument.
        String[] stringArray = new String[sizeOfStringArray];

        //Creating the Random object;
        Random randomObj = new Random();

     //this for loop helps to generate a number of strings which we provided 
        //and stores that srings in array
        for (int i = 0; i < sizeOfStringArray; i++) {
            //creating new StringBuffer object for each string
            stringBufferObj = new StringBuffer();
            //creating a string from allCharStringContains 
            for (int j = 0; j < stringLength; j++) {
                int createdRandomChar = randomObj.nextInt(maximum);
                stringBufferObj.append(allCharStringContains.charAt(createdRandomChar));
            }
            //setting a created string into stringArray in index[i]
            stringArray[i] = stringBufferObj.toString();
        }
        //returning the Array of Strings object
        return stringArray;
    }
}
