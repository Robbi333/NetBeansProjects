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
public class Building {

    private ArrayList<Heater> list;
    private String name;

    public Building(String name) {
        list = new ArrayList();
        this.name = name;
    }

    public void addHeater(Heater a) {
        list.add(a);
    }

    public double calcAvgHeat() {
        double total = 0;

        for (int i = 0; i < list.size(); i++) {
            total += list.get(i).getTemp();
        }
        return total / list.size();
    }

    public double getWarmest() {
        double high = list.get(0).getTemp();

        for (Heater element : list) {
            if (element.getTemp() > high) {
                high = element.getTemp();
            }
        }
        return high;
    }

    public double getColdest() {
        double lowest = list.get(0).getTemp();

        for (Heater element : list) {
            if (element.getTemp() < lowest) {
                lowest = element.getTemp();
            }
        }
        return lowest;
    }

    public boolean removeHeater(int id) {
        boolean done = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
            }
            done = true;
        }
        return done;
    }

    public int showNumberOfHeaters() {
        return list.size();
    }

    public int showNumberOfHotHeaters(int hot) {

        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTemp() >= hot) {
                count++;
            }
        }
        return count;
    }

    public String findHeater(int id){
    
        String nameofbulding = null;
        
    for(int i = 0; i < list.size(); i++){
    if(list.get(i).getId() == id){
      nameofbulding = name;
    }
    }
    return nameofbulding;
    }
    
    public ArrayList<Heater> findAllColdHeaters(int temp){
    
    ArrayList<Heater> h = new ArrayList();
        
        for (Heater element : list) {
            if (element.getTemp() < temp) {
                h.add(element);
            }
        }
        return h;
    }
    
    }

