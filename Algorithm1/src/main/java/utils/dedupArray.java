package utils;

/**
 *
 * @author D00251715
 */
public class dedupArray {

    public static void main(String[] args) {

        int nums[] = {1, 1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

//        System.out.println("Whether 5 appears in your array" + appears(nums,5));
//        System.out.println("Old Array");
        print(nums);
//        System.out.println("Dedup Array");
//        print(dedupArr(nums);

        // print(dedupArrNew(nums));
       // print(dedupSortedArr(nums));
        
        System.out.println(binarySearch.binarySearch(nums, 15));
    }

    public static void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Slot " + i + ": " + data[i]);
        }
    }

    public static void print(String[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Slot " + i + ": " + data[i]);
        }
    }

    public static boolean contains(int[] nums, int value) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == value) {

                return true;
            }
        }

        return false;
    }

    public static boolean containsSorted(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static int[] resize(int[] nums, int numExtraSlots) {

        int[] larger = new int[nums.length + numExtraSlots];

        for (int i = 0; i < nums.length; i++) {

            larger[i] = nums[i];
        }
        return larger;
    }

    public static int[] deduplicate(int[] nums) {
        int[] uniqueElements = new int[0];

        int pos = 0;

        for (int i = 0; i < nums.length; i++) {

            if (!contains(uniqueElements, nums[i])) {

                uniqueElements = resize(uniqueElements, 1);

                uniqueElements[pos] = nums[i];

                pos++;
            }
        }

        return uniqueElements;
    }

    public static boolean appears(int[] nums, int num) {

        for (int i = 0; i < nums.length; i++) {

            if (num == nums[i]) {

                return true;
            }
        }
        return false;
    }

    public static int[] dedupArr(int[] nums) {

        int[] dedup = new int[0];

        for (int i = 0; i < nums.length; i++) {

            if (!appears(dedup, nums[i])) {
                dedup = resize(dedup, 1);
                dedup[dedup.length - 1] = nums[i];
            }
        }
        return dedup;
    }

    public static int[] dedupArrNew(int[] nums) {

        int[] dedup = new int[nums.length];
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {

            if (!appears(dedup, nums[i])) {

                dedup[pos] = nums[i];
                pos++;
            }
        }

        return ArrToNewArray(dedup, pos);
    }

    public static int[] ArrToNewArray(int[] dedup, int pos) {
        int[] newarr = new int[pos];

        for (int i = 0; i < pos; i++) {
            newarr[i] = dedup[i];
        }
        return newarr;
    }

    public static int[] dedupSortedArr(int[] nums) {

        int[] arr = new int[nums.length];
        int pos = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] != nums[i + 1]) {
                arr[pos] = nums[i];
                pos++;
            }

        }

        arr[pos] = nums[nums.length - 1];
        pos++;

        return ArrToNewArray(arr, pos);

    }
}
