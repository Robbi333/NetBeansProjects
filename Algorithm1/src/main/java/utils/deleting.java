package utils;

import java.util.Scanner;

/**
 *
 * @author D00251715
 */
public class deleting {

    public static void print(int[] arr) {
// For every pos in the array
        for (int i = 0; i < arr.length; i++) {
// print every slot
            System.out.println("Slot " + i + ": " + arr[i]);
        }
    }

    public static void print(String[] arr) {
// For every pos in the array
        for (int i = 0; i < arr.length; i++) {
// print every slot
            System.out.println("Slot " + i + ": " + arr[i]);
        }
    }

    public static boolean removeFirst(int[] nums, int num) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == num) {

                nums[i] = 0;

                return true;
            }
        }
        return false;
    }

    public static int indexOfValue(int[] arr, int value) {

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
            }
        }
        return index;
    }
    public static int indexOfValueb(int[] arr, int value) {

        int index = -1;
        for (int i = arr.length-1;i >= 0; i--) {
            if (arr[i] == value) {
                index = i;
                return index;
            }
        }
        return index;
    }

    public static boolean shiftDel(int[] arr, int value) {

        int index = indexOfValue(arr, value);
        if (index > arr.length) {
            return false;
        }

        for (int i = 0; i < index && i < arr.length; i++) {

            arr[i] = arr[i + 1];

        }
        arr[arr.length - 1] = 0;
        return true;
    }

    public static boolean advshiftDel() {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many words will you use in your array");

        int length = sc.nextInt();

        int[] nums = new int[length];

        int pos = 0;

        for (int i = 0; i < length; i++) {

            System.out.println("enter a word for your array");

            int num = sc.nextInt();

            nums[pos] = num;

            pos++;
        }

        print(nums);

        System.out.println("What number would you like to remove");
        int value = sc.nextInt();
        for (int i = 0; i < length; i++) {
            if (value == nums[i]) {

                nums[i] = nums[i + 1];

            }
            nums[nums.length - 1] = 0;
        }

        return true;
    }

    public static boolean shiftDeleteInstanceOfValue(int[] nums, int value) {
        boolean deleted = false;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] == value) {
                deleted = true;
                shiftDel(nums, i);
            }
        }
        return deleted;
    }

    public static int[] resizeDel(int[] nums, int pos) {

        if (pos >= 0 && pos < nums.length) {
            int[] newarr = new int[nums.length - 1];

            int tracker = 0;

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] != pos) {
                    nums[i] = newarr[tracker];

                    tracker += 1;

                }
            }
            return newarr;
        }

        return nums;

    }

    public static int[] resizeDeletePosition(int[] nums, int index) {
        if (index >= 0 && index < nums.length) {
            int[] smaller = new int[nums.length - 1];
            int tracker = 0;

            for (int i = 0; i < nums.length; i++) {
                if (i != index) {
                    smaller[tracker] = nums[i];
                    tracker++;
                }
            }
            return smaller;
        }
        return nums;
    }

    public static int[] resizeDeletePositionLast(int[] nums, int value) {

        int pos = indexOfValueb(nums, value);
        int[] newnew = resizeDeletePosition(nums, pos);

        return newnew;
    }
    

    public static int[] resizeDeletePositionAll(int[] nums, int value) {
        if (value >= 0) {
            int trackerarr = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == value) {
                    trackerarr += 1;
                }
            }

            int[] smaller = new int[nums.length - trackerarr];
            int tracker = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != value) {
                    smaller[tracker] = nums[i];
                    tracker++;
                }
            }
            return smaller;
        }
        return nums;
    }
}
