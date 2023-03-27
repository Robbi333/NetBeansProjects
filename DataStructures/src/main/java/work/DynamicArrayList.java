/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work;

/**
 *
 * @author D00251715
 */
public class DynamicArrayList {

    private int[] data;
    private int count;

    public DynamicArrayList() {

        data = new int[10];
    }

    private void grow() {

        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
    }

    public boolean add(int a) {

        boolean flag = false;

        if (count < data.length) {
            data[count] = a;

            count++;

        } else {

            grow();
            data[count] = a;
            // int[] larger = new int[data.length + 10];
            //System.arraycopy(data, 0, larger, 0, data.length);
            //larger[count] = a;
        }
        return flag;
    }

    public int size() {
        return count;
    }

    public int get(int pos) throws Exception {

        int result;

        if (pos > count) {

            throw new Exception("Bad choice!");
        } else {
            result = data[pos];
        }

        return result;
    }

    public int indexOf(int num) {
        int pos = 0;

        for (int i = 0; i <= data.length; i++) {

            if (data[i] == num) {
                pos = i;
                return pos;
            }
            
        }
        return -1;
    }
}
