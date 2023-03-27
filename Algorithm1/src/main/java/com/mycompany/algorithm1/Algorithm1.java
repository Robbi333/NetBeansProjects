/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.algorithm1;

// import revision;
/**
 *
 * @author d00251715
 */
public class Algorithm1 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("BEFORE");
        for (int curr : nums) {

            System.out.println(curr);
        }

        for (int i = 0; i < nums.length; i++) {

            nums[i] = nums[i] * 2;

        }

        System.out.println(" /n AFTER");
        for (int curr : nums) {

            System.out.println(curr);
        }

        // revision.inputValidateInt(prompt, 5, 10)
    }

}
