package utils;

public class partitionArray {

    public static int[] partionArray(int[] org, int pivot) {

        int[] lessThan = new int[org.length];
        int[] greaterThan = new int[org.length];
        int[] combined = new int[org.length];

        int pos1 = 0;
        int pos2 = 0;
        int pos3 = 0;

        for (int i = 0; i < org.length; i++) {

            if (org[i] < pivot) {
                lessThan[pos1] = org[i];
                pos1++;
            } else {
                greaterThan[pos2] = org[i];
                pos2++;
            }
        }
        for (int i = 0; i < pos1; i++) {
            combined[pos3] = lessThan[i];
            pos3++;

        }
        for (int i = 0; i < pos2; i++) {
            combined[pos3] = greaterThan[i];
            pos3++;

        }

        return combined;
    }

    public static String[] partitionString(String[] org, String pivot) {

        String[] ascending = new String[org.length];
        String[] descending = new String[org.length];
        String[] combo = new String[org.length];

        int pos1 = 0;
        int pos2 = 0;
        int pos3 = 0;

        for (int i = 0; i < org.length; i++) {
            if (org[i].compareToIgnoreCase(pivot) < 0) {
                ascending[pos1] = org[i];

                pos1++;

            } else {
                descending[pos2] = org[i];

                pos2++;
            }
        }

        for (int i = 0; i < pos1; i++) {
            combo[pos3] = ascending[i];
            pos3++;
        }
        for (int i = 0; i < pos2; i++) {
            combo[pos3] = descending[i];
            pos3++;
        }

        return combo;
    }

    public static int[] partionArrayGrades(int[] org, int pivot) {

        int[] lessThan = new int[org.length];
        int[] greaterThan = new int[org.length];
        int[] combined = new int[org.length];

        int pos1 = 0;
        int pos2 = 0;
        int pos3 = 0;

        for (int i = 0; i < org.length; i++) {

            if (org[i] < pivot) {
                lessThan[pos1] = org[i];
                pos1++;
            } else {
                greaterThan[pos2] = org[i];
                pos2++;
            }
        }
        int passed = 0;
        for (int i = 0; i < pos1; i++) {
            combined[pos3] = lessThan[i];
            pos3++;

        }
        for (int i = 0; i < pos2; i++) {
            combined[pos3] = greaterThan[i];
            pos3++;
            passed++;
        }

        System.out.println("you passed " + passed + " classes");

        return combined;
    }

}
