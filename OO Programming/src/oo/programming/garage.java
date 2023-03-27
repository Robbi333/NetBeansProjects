/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.programming;

import java.util.ArrayList;

/**
 *
 * @author D00251715
 */
public class garage {
    
    private ArrayList<Car> fleet;
    private String name;
    
    public garage(String name) {
        fleet = new ArrayList();
        this.name = name;
    }
    
    public ArrayList<Car> getFleet() {
        return fleet;
        
    }
    
    public boolean addcar(Car c) {
        return fleet.add(c);
    }
    
    public int showNumberOfCars() {
        return this.fleet.size();
    }
    
    public double getAverageKmDrive() {
        double total = 0;
        
        for (int i = 0; i < fleet.size(); i++) {
            total += fleet.get(i).getKM();
        }
        return total / fleet.size();
    }
    
    public double getAverageKmDriveV2() {
        double total = 0;
        
        for (Car element : fleet) {
            total += element.getKM();
        }
        return total / fleet.size();
    }
    
    public double getMostKmDrive() {
        double high = fleet.get(0).getKM();
        
        for (int i = 0; i < fleet.size(); i++) {
            if (fleet.get(i).getKM() > high) {
                high = fleet.get(i).getKM();
            }
        }
        return high;
    }

    public double getMostKmDriveV1() {
        double high = fleet.get(0).getKM();
        
        for (Car element : fleet) {
            if (element.getKM() > high) {
                high = element.getKM();
            }
        }
        return high;
    }
    
    public ArrayList<Car> getHighMileage(double m) {
        ArrayList<Car> h = new ArrayList();
        
        for (Car element : fleet) {
            if (element.getKM() > m) {
                h.add(element);
            }
        }
        return h;
    }
    
    public int getNumberofModel(String m){
    
        int count = 0;
        
        for(Car element: fleet){
        if(element.getModel().equalsIgnoreCase(m)){
        count++;
        }
        }
        return count;
    }
    
    public ArrayList<Car> findallModelCars(String a){
    
    ArrayList<Car> h = new ArrayList();
    
    for(Car element: fleet){
        if(element.getModel().equalsIgnoreCase(a))
            h.add(element);
    }
    return h;
    }
}
