/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author D00251715
 */
public class bubblesort {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 5, 5, 3, 2, 4, 4, 5, 6, 7, 10, 42, 43, 43, 53, 53, 53, 53, 53, 3421, 413, 43, 542, 6, 536, 547, 547, 546, 34643, 653, 7, 5, 54, 754, 754, 754, 754, 75, 754, 745, 754, 754, 754, 734, 743, 64, 264, 26, 254, 324, 23, 43, 653, 63, 47, 547, 65875, 9879, 879, 987, 8, 78, 78, 78, 7, 87, 87, 87, 87, 87, 8, 8, 8, 8, 8, 8, 8, 8, 8, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 65, 6, 56, 5, 65, 65, 65, 65, 65, 65, 65, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 5, 454, 54, 54, 675, 6, 56, 565, 65, 6, 56, 56, 56, 5, 65, 65, 65, 65, 65, 65, 65, 6, 56, 56, 56, 56, 56, 56, 56, 565, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 423, 432, 523, 4, 634, 634, 65, 654, 76, 47, 68, 56, 856, 765, 745, 654, 645, 654, 7, 64, 764, 74, 67, 47, 547, 546, 565, 76, 76, 76, 76, 76, 7, 7, 7, 7, 7, 7, 5, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 43, 43, 43, 43, 53, 6, 567, 576, 76, 86, 6, 45564, 5234, 532, 432, 54, 26375, 5, 64, 8, 678, 65876, 74, 746, 76, 764, 76, 76, 76, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 67, 564, 54, 54, 54, 54, 54, 54, 54, 54, 54, 545, 454, 54, 54, 54, 5423, 523, 52, 4, 54, 53, 56, 36, 47, 5, 7, 8, 7686, 4, 86, 86, 86, 6, 6, 6, 6, 5, 65, 65, 65, 65, 65, 5, 54, 46, 8, 9, 56, 45, 4, 6, 7, 98, 90, 0, 8, 67, 5, 4, 6, 7, 98, 9, 0, 8, 7, 6, 8, 597, 597, 75, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 957, 975, 975, 957, 975, 957, 975, 975, 975, 975, 975, 975, 975, 975, 975, 97, 975, 975, 975, 975, 975, 975, 975, 975, 975, 764, 746, 746, 73, 557, 37, 5365, 3635, 735, 86, 859, 7986, 9, 89, 8, 75846, 735, 753, 864, 975, 0, 80, 979, 68, 85, 7, 735, 753, 753, 753, 753, 8, 67, 6, 7, 7, 7, 6, 6, 5, 5, 4, 54, 64, 64, 64, 64, 64, 4, 5, 6, 7, 9};
        
        //print(bubbleSort(arr));
        
        int createStringLength = 1;
        int createArraySize =1000000;
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
    
        print(bubbleSortopt(generatedStrings));
    }

    public static void print(int[] arr) {
        // For every pos in the array
        for (int i = 0; i < arr.length; i++) {
            // print every slot
            System.out.println("Slot " + i + ": " + arr[i]);
        }
    }
    
     public static void print(String[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Slot " + i + ": " + data[i]);
        }
    }

    public static void swap(int[] nums, int pos1, int pos2) {

        int tmp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = tmp;

    }
     public static void swap(String[] words, int pos1, int pos2) {

        String tmp = words[pos1];
        words[pos1] = words[pos2];
        words[pos2] = tmp;

    }

    public static int[] bubbleSort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }

        }
        return nums;
    }

    public static String[] bubbleSort(String[] words) {

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    swap(words, j, j + 1);
                }
            }

        }
        return words;
    }
    
    public static String[] bubbleSortopt(String[] words) {
        boolean swapped;
        for (int i = 0; i < words.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    swap(words, j, j + 1);
                    swapped = true;
                }
            }
            if(swapped == false){
            break;
            }
        }
        return words;
    }

}
