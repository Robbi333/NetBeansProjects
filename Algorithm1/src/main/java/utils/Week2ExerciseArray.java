package utils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author D00251715
 */
public class Week2ExerciseArray {

    public static int ArrayLargest(int[] num) {

        int large = num[0];

        for (int i = 0; i == num.length; i++) {

            if (large < num[i]) {

                large = num[i];
            } 
        }

        return large;
    }

}
