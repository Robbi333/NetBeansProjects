/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.programming;

/**
 *
 * @author D00251715
 */
public class App {

    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 45, 2);
        Car c2 = new Car();
        Car c3 = new Car("Ford");

        System.out.println("c1 " + c1.getModel() + " " + c1.getKM() + " " + c1.getL());
        System.out.println("c2 " + c2.getModel() + " " + c2.getKM() + " " + c2.getL());
        System.out.println("c3 " + c3.getModel() + " " + c3.getKM() + " " + c3.getL());
    
        c1.setKM(222);
        c2.setL(333);
        c2.setModel("Mazda FC");
        c3.setModel("Trueno");
    
        System.out.println("c1 " + c1.getModel() + " " + c1.getKM() + " " + c1.getL());
        System.out.println("c2 " + c2.getModel() + " " + c2.getKM() + " " + c2.getL());
        System.out.println("c3 " + c3.getModel() + " " + c3.getKM() + " " + c3.getL()); 
    
    }
}
