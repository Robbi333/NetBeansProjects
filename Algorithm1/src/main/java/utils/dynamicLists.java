/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author D00251715
 */
public class dynamicLists {
    
 private int[] data;
    private int size;

    public dynamicLists() {
        data = new int[10];

    }

    private void grow() {
        int[] larger = new int[data.length + 10];
        for (int i = 0; i < data.length; i++) {
            larger[i] = data[i];
        }
        data = larger;
    }

    public boolean add(int value) {

        if (size < data.length) {

            data[size] = value;
        } else {
            grow();
            data[size] = value;
        }
        size++;
        return true;
    }

    public int size() {

        return size;
    }

    public int get(int position) throws Exception {

        if (position > size) {
            throw new Exception("IndexOutOfBounds");
        }
        return data[position];

    }

    public int indexOf(int value) {

        int position = 0;
        for (int i = 0; i < data.length; i++) {

            if (data[i] == value) {
                position = i;

                return position;
            }
        }
        return -1;
    }
}