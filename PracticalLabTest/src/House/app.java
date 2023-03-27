/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package House;

import java.util.ArrayList;

/**
 *
 * @author D00251715
 */
public class app {

    public static void main(String[] args) {

        House a = new House("A91XDT8", 156.7, 4);
        House b = new House("A92Y8C8", 53125, 7);
        House c = new House("A9T4G4G", 5353, 6);
        House d = new DeluxHouse("patio", "A9HDFH4", 53153, 6);
        House e = new DeluxHouse("pool", "A9K75KG", 6764, 3);
        House f = new House("A54J46H", 100, 1);

        Properties myProp = new Properties();

        myProp.addProperty(a);
        myProp.addProperty(b);
        myProp.addProperty(c);
        myProp.addProperty(d);
        myProp.addProperty(e);
        myProp.addProperty(f);

        System.out.println("Before deletion "+myProp.Properties.toString());

        myProp.deleteHouse("A91XDT8");

        System.out.println("After deletion " + myProp.Properties.toString());

        System.out.println(myProp.getAverageRent()+ " Euro is the average amount of rent paid by all houses");
        
        System.out.println("The amount of DeluxHouses in this list are " +myProp.getNumHouseType("DeluxHouse"));
    }
}
