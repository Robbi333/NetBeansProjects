/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package utils;

/**
 *
 * @author D00251715
 */
public class StringUtilities {

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

    // this method returns in which position a string was found
    public static int wordFinder(String[] textarr, String value) {

        // using result as a place holder for the positon
        int result = 0;

        for (int i = 0; i < textarr.length; i++) {
            // if the word that we have, equals to the i element in the array then
            if (textarr[i].equalsIgnoreCase(value)) {
                //return straight away the position
                return i;
                // else set result to -1 ( meaning not found in the array)
            } else {
                result = -1;
            }
        }
        // return result
        return result;
    }

    // Method to partion a array of Strings in ascending order
    public static String[] partitionString(String[] textArr, String pivot) {

        // we make 3 new arrays all with appropiate names
        String[] ascending = new String[textArr.length];
        String[] descending = new String[textArr.length];
        String[] combo = new String[textArr.length];

        // initialize 3 positional trackers for the 3 new arrays
        int pos1 = 0;
        int pos2 = 0;
        int pos3 = 0;

        // loop through the array
        for (int i = 0; i < textArr.length; i++) {
            // if the current element compared to pivot returns less than 0
            if (textArr[i].compareToIgnoreCase(pivot) < 0) {
                // we make the current element in the array into the ascending 
                //array that we created
                ascending[pos1] = textArr[i];
                // update position
                pos1++;

                // if not then we put into the descending array
            } else {
                descending[pos2] = textArr[i];
                //update position
                pos2++;
            }
        }

        // two for loops to loop through pos1 and pos2 to put the info in the
        // combo array that we created.
        for (int i = 0; i < pos1; i++) {
            combo[pos3] = ascending[i];
            pos3++;
        }
        for (int i = 0; i < pos2; i++) {
            combo[pos3] = descending[i];
            pos3++;
        }
        // return the new array
        return combo;
    }

    public static boolean contains(String[] textarr, String value) {

        for (int i = 0; i < textarr.length; i++) {
            // loop through array and checks if the value exists inside array
            // returns if true
            if (textarr[i].equalsIgnoreCase(value)) {

                return true;
            }
        }

        return false;
    }

    public static String[] ArrToNewArray(String[] dedup, int pos) {
        // making a new array to copy the info too
        String[] newarr = new String[pos];
        // loop through the original array up to the position
        for (int i = 0; i < pos; i++) {
            // copy it over to the new array
            newarr[i] = dedup[i];
        }
        // return the new array
        return newarr;
    }
    // same concept as above, but we are doing it backwards
    public static String[] backwardsArrToNewArray(String[] dedup, int pos) {
        // using the tracker that we created in the next method as pos
        String[] newarr = new String[pos];

        // here we start from the back
        for (int i = dedup.length - 1; i >= pos ; i--) {
            // in the first loop we copy the last position to the last available 
            // position
            newarr[i] = dedup[i];
        }
        return newarr;
    }

    public static String[] blankDeleteDeduplicate(String[] textarr, int stop) {

        // first part that gets filtered will be put into this array
        String[] dedup = new String[textarr.length];
        // the rest that dont get filtered go in here
        String[] textarrALT = new String[textarr.length];
        // we create a positional tracker for the first array
        int pos = 0;
        // tracker to use a pos for the above method
        int tracker = 0;
        // and third position for a later array that we create
        int pos3 = 0;
        // loop through the original array up to stop
        for (int i = 0; i < stop; i++) {

            // using contains we check if the array has the word already
            if (!contains(dedup, textarr[i])) {
                // puts that word into the dedup array
                dedup[pos] = textarr[i];
                //update 
                pos++;
            }
        }
        // loop through the back of the array up to stop
        for (int s = textarr.length - 1; s >= stop; s--) {
            // put all the values after stop into new array
            textarrALT[s] = textarr[s];
            // update
            tracker ++;
        }
        // blank deleting the org filtered array
        ArrToNewArray(dedup, pos);
        // blank deleting the rest of the array
        backwardsArrToNewArray(textarrALT,tracker);
           // creating a new array using the pos tracker and tracker tracker
           // this will give us the length
         String[] combo = new String[pos + tracker];
        // using two for loops to add them together
        for (int i = 0; i < stop; i++) {
            combo[pos3] = dedup[i];
            pos3++;
        }
        for (int i = 0; i < tracker; i++) {
            combo[pos3] = textarrALT[i];
            pos3++;
        }
        // return the combo
        return combo;
    }
}
