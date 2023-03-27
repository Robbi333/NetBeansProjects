/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.programming;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author D00251715
 */
public class App {

    public static void main(String[] args) {
        /*
    b)	Create a CarApp class that contains a main method
a.	Store 5 instances of the Car class in an ArrayList or an array.
b.	Write methods in main to:
c.	Display the model of each car
        
        
        
        
d.	Increase the Km driven by a different random amount for each car object.
e.	Display the details of the car that spent the most on fuel.
         */
        Car[] myArr = new Car[5];

        myArr[0] = (new Car("Mazda FC", 323, 4242));
        myArr[1] = (new Car("Panda Trueno", 4421, 531));
        myArr[2] = (new Car("EG6 Honda Civic", 516, 253));
        myArr[3] = (new Car("Evo VI Mistubishi", 43213, 53513));
        myArr[4] = (new Car("Impreza Subaru", 252, 25564));

        System.out.println("**************");

        displayModel(myArr);
        incKMRDM(myArr);
        
        System.out.println("**************");

        Car c1 = new Car("Toyota", 45, 2);
        Car c2 = new Car();
        Car c3 = new Car("Ford");

        System.out.println("c1 " + c1.getModel() + " " + c1.getKM() + " " + c1.getL());
        System.out.println("c2 " + c2.getModel() + " " + c2.getKM() + " " + c2.getL());
        System.out.println("c3 " + c3.getModel() + " " + c3.getKM() + " " + c3.getL());

        c1.setKM(222);
        c2.setL(333);
        c2.setModel("R32");
        c3.setModel("EVO V");

        System.out.println("c1 " + c1.getModel() + " " + c1.getKM() + " " + c1.getL());
        System.out.println("c2 " + c2.getModel() + " " + c2.getKM() + " " + c2.getL());
        System.out.println("c3 " + c3.getModel() + " " + c3.getKM() + " " + c3.getL());

        System.out.println("C1 KM " + c1.getKmPerL() + "KM");

        System.out.println("C1 COST " + c1.getCost(50) + "EURO");

        c1.incL(5);

        System.out.println("C1 COST(UPDATED) " + c1.getCost(50) + " EURO");

        c1.incKm(200);

        System.out.println("C1 INCREASING KM " + c1.getKM());
    }

    public static void displayModel(Car[] garage) {

       

        for (int i = 0; i < garage.length; i++) {

            System.out.println(garage[i].getModel());

        }

    }

    public static void incKMRDM(Car[] garage) {

          Random rg = new Random();
          
        for (int i = 0; i < garage.length; i++) {
            garage[i].setKM(garage[i].getKM() + rg.nextInt());

        }
        
    }
    
    
        public static void spentMost(Car[] garage) {

          Car most = garage[0];
          
        for (int i = 1; i < garage.length; i++) {
            if(garage[i].getCost(1.8)>most.getCost(1.8)){
            
            most = garage[i];
            }
            System.out.println(most.getModel());
        } 

    }
}
