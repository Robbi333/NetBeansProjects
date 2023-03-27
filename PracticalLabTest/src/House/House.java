/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package House;

/**
 *
 * @author D00251715
 */
public class House {

    private String eircode;
    private double area;
    private int numRooms;

    public House(String eircode, double area, int numRooms) {
        this.eircode = eircode;
        this.area = area;
        this.numRooms = numRooms;
    }

    public House() {

    }

    public String getEircode() {
        return eircode;
    }

    public void setEircode(String eircode) {
        this.eircode = eircode;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public boolean setNumRooms(int numRooms) {

        boolean result = false;

        if (numRooms > 0) {
            this.numRooms = numRooms;
            result = true;
        }
        return result;
    }

    public double calcRent(House a) {

        return a.getNumRooms() * 90.50;
    }

    @Override
    public String toString() {
        return "House{" + "eircode=" + eircode + ", area=" + area + ", numRooms=" + numRooms + '}';
    }

    @Override
    public boolean equals(Object obj) {

        boolean result = false;

        if (this.eircode.equalsIgnoreCase(eircode)) {

            result = super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        return result;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
