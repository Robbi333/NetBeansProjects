package oo.programming;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author D00251715
 */
public class Car {

    /*
Example
a)	Create a class, Car with model kmDriven and litresUsed as attributes.
a.	Create a no argument constructor, a constructor that accepts values for all fields and a constructor that accepts a value for the model field.
b.	Write getters and setters for all the attributes of the class.
c.	Write a method to calculate and return the number of kilometers driven per litre.
d.	Write a method to calculate the amount spent on petrol. This method should accept the cost of a litre of petrol as a parameter. 
e.	Write a method to increase the litres used by a value passed to the method.
f.	Write a method to increase the km driven by a value passed to the method.
b)	Create a CarApp class that contains a main method
a.	Store 5 instances of the Car class in an ArrayList or an array.
b.	Write methods in main to:
c.	Display the model of each car
d.	Increase the Km driven by a different random amount for each car object.
e.	Display the details of the car that spent the most on fuel.

     */
    // Instance VAR  
    private String model;
    private double kmDriven;
    private double LUsed;

    private int id;
    private static int countcar = 0;

    // Constructors
    public Car() {
        this.id = countcar;
        countcar += 1;
    }

    public Car(String m, double kmDriven, double Litres) {
        model = m;
        this.kmDriven = kmDriven; // have to use this
        this.LUsed = Litres; // but not here cause diff names

        this.id = countcar;
        countcar += 1;
    }

    public Car(String m) {

        model = m;
        this.id = countcar;
        countcar += 1;
    }
    //Accesssors

    public String getModel() {

        return this.model;

    }

    public double getKM() {

        return this.kmDriven;

    }

    public double getL() {

        return this.LUsed;

    }

    //mutators
    public void setModel(String m) {

        this.model = m;

    }

    public boolean setKM(double k) {

        boolean done = false;
        if (k >= 0) {
            this.kmDriven = k;
            done = true;
        }
        return done;

    }

    public void setL(double l) {
        this.LUsed = l;
    }
//    c.	Write a method to calculate and return 
    //the number of kilometers driven per litre.

    public double getKmPerL() {
        return this.kmDriven / LUsed;
    }
//d.	Write a method to calculate the amount spent on petrol.
    //This method should accept the cost of a litre of petrol 
    //as a parameter. 

    public double getCost(double cost) {
        return this.LUsed * cost;
    }
//e.	Write a method to increase the litres used by a 
    //value passed to the method.

    public void incL(double l) {
        //could use setter
        this.LUsed = LUsed + l;
    }

    public void incLitresV2(double l) {
        //could use setter
        this.setL(LUsed + l);
    }
//f.	Write a method to increase the km 
    //driven by a value passed to the method.

    public void incKm(double l) {
        //could use setter
        this.kmDriven = this.kmDriven + l;
    }

    @Override
    public String toString() {
        return "Model: " + this.model + " km:" + this.kmDriven + " litres used " + this.LUsed;
    }
}
