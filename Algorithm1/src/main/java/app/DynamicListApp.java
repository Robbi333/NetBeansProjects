/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import utils.dynamicLists;

/**
 *
 * @author D00251715
 */
public class DynamicListApp {

    public static void main(String[] args) {
        dynamicLists myList = new dynamicLists();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Postition" + i + " :" + myList.get(i+19));
        } 
    }

}
