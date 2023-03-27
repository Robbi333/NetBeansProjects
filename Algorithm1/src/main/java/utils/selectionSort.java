/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import static utils.bubblesort.bubbleSortopt;
import static utils.bubblesort.print;
import static utils.bubblesort.swap;

/**
 *      1 +
 * @author D00251715
 */
public class selectionSort {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 5, 5, 3, 2, 4, 4, 5, 6, 7, 10, 42, 43, 43, 53, 53, 53, 53, 53, 3421, 413, 43, 542, 6, 536, 547, 547, 546, 34643, 653, 7, 5, 54, 754, 754, 754, 754, 75, 754, 745, 754, 754, 754, 734, 743, 64, 264, 26, 254, 324, 23, 43, 653, 63, 47, 547, 65875, 9879, 879, 987, 8, 78, 78, 78, 7, 87, 87, 87, 87, 87, 8, 8, 8, 8, 8, 8, 8, 8, 8, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 65, 6, 56, 5, 65, 65, 65, 65, 65, 65, 65, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 5, 454, 54, 54, 675, 6, 56, 565, 65, 6, 56, 56, 56, 5, 65, 65, 65, 65, 65, 65, 65, 6, 56, 56, 56, 56, 56, 56, 56, 565, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 423, 432, 523, 4, 634, 634, 65, 654, 76, 47, 68, 56, 856, 765, 745, 654, 645, 654, 7, 64, 764, 74, 67, 47, 547, 546, 565, 76, 76, 76, 76, 76, 7, 7, 7, 7, 7, 7, 5, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 43, 43, 43, 43, 53, 6, 567, 576, 76, 86, 6, 45564, 5234, 532, 432, 54, 26375, 5, 64, 8, 678, 65876, 74, 746, 76, 764, 76, 76, 76, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 67, 564, 54, 54, 54, 54, 54, 54, 54, 54, 54, 545, 454, 54, 54, 54, 5423, 523, 52, 4, 54, 53, 56, 36, 47, 5, 7, 8, 7686, 4, 86, 86, 86, 6, 6, 6, 6, 5, 65, 65, 65, 65, 65, 5, 54, 46, 8, 9, 56, 45, 4, 6, 7, 98, 90, 0, 8, 67, 5, 4, 6, 7, 98, 9, 0, 8, 7, 6, 8, 597, 597, 75, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 957, 975, 975, 957, 975, 957, 975, 975, 975, 975, 975, 975, 975, 975, 975, 97, 975, 975, 975, 975, 975, 975, 975, 975, 975, 764, 746, 746, 73, 557, 37, 5365, 3635, 735, 86, 859, 7986, 9, 89, 8, 75846, 735, 753, 864, 975, 0, 80, 979, 68, 85, 7, 735, 753, 753, 753, 753, 8, 67, 6, 7, 7, 7, 6, 6, 5, 5, 4, 54, 64, 64, 64, 64, 64, 4, 5, 6, 7, 9};
        //int[] arr = new int[]{1,4,6,5,4};
        
       // print(SelectionSort(arr));
        int createStringLength = 1;
        int createArraySize = 1000000;
        //here we receive the array of strings from our static function 
        String[] generatedStrings = coolthing.createAlphaNumericArrayStrings(createStringLength, createArraySize);
        //printing the array of strings that we generated
//        System.out.println("Generated array of Random strings are"
//                + "\n"
//                + "=============================");
//        for (String a : generatedStrings) {
//            System.out.println(a);
//        }
//        System.out.println("=============================");

        //print(bubbleSortopt(generatedStrings));
    }

    public static int[] selectionSort(int[] nums) {

        int minpos;
        int min;

        for (int i = 0; i < nums.length - 1; i++) {
            minpos = i;
            min = nums[i];
            for (int j = minpos+1; j < nums.length; j++) {
                if (nums[j] < min) {
                    minpos = j;
                    min = nums[j];
                }
                
            }
            swap(nums, i,minpos);
        }
        return nums;
    }

}
