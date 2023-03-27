/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author D00251715
 */
public class binarySearch {

    public static void main(String[] args) {

        int nums[] = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 17, 17, 17, 17};
        String words[] = {"a", "b", "c", "d", "e", "f", "g"};

        // System.out.println("The number is found " + binarySearch(nums, 1) + " position");
        // System.out.println("The letter is found " + binarySearchStr(words, "g") + " position");
        System.out.println("The letter is found " + binarySearchFirst(nums, 1) + " position");
        System.out.println("The letter is found " + binarySearchLast(nums, 1) + " position");
    }

    public static int binarySearch(int[] nums, int num) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == num) {
                return mid;
            } else if (nums[mid] > num) {

                end = mid - 1;
            } else {
                start = mid + 1;

            }

        }
        return -1;
    }

    public static int binarySearchStr(String[] words, String word) {

        int start = 0;
        int end = words.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (words[mid].compareTo(word) == 0) {

                return mid;
            } else if (words[mid].compareTo(word) > 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return - 1;
    }

    public static int binarySearchFirst(int[] nums, int num) {

        int start = 0;
        int end = nums.length - 1;
        int pos = 0;

        while (start <= end) {

            int mid = (start + end) / 2;
            if (nums[mid] == num) {

                while (mid > -1 && nums[mid] == num) {
                    mid--;

                }
                return mid + 1;

            } else if (nums[mid] > num) {

                end = mid - 1;
            } else {
                start = mid + 1;

            }

        }

        return -1;
    }

    public static int binarySearchLast(int[] nums, int num) {

        int start = 0;
        int end = nums.length - 1;
        int pos = 0;

        while (start <= end) {

            int mid = (start + end) / 2;
            if (nums[mid] == num) {

                while (mid < nums.length - 1 && nums[mid] == num) {
                    mid++;

                }
                return mid - 1;

            } else if (nums[mid] > num) {

                end = mid - 1;
            } else {
                start = mid + 1;

            }

        }

        return -1;
    }

    public static int binarySearchStrFirst(String[] words, String word) {

        int start = 0;
        int end = words.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (words[mid].compareTo(word) == 0) {
                while (mid > -1 && words[mid].compareTo(word) == 0) {
                    mid--;

                }
                return mid + 1;
            } else if (words[mid].compareTo(word) > 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return - 1;
    }
    public static int binarySearchStrLast(String[] words, String word) {

        int start = 0;
        int end = words.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (words[mid].compareTo(word) == 0) {
                while (mid < words.length - 1 && words[mid].compareTo(word) == 0) {
                    mid++;

                }
                return mid - 1;
            } else if (words[mid].compareTo(word) > 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return - 1;
    }
}
