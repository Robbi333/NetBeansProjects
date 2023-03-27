/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package House;

/**
 *
 * @author D00251715
 */
public class DeluxHouse extends House {

    private String feature;

    public DeluxHouse(String feature, String eircode, double area, int numRooms) {
        // this is the instance variables from the base class
        // being extended to the subclass
        super(eircode, area, numRooms);
        //assings a value to the instance variable
        this.feature = feature;
    }

    public String getSpecial() {
        return feature;
    }

    public void setSpecial(String feature) {
        this.feature = feature;
    }

    // this is here because we are overriding a method in the base
    // class.
    @Override
    public double calcRent(House a) {

        return (super.calcRent(a) / .33 * 100) + super.calcRent(a);
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "DeluxHouse{" + "feature=" + feature + '}';
    }

}
