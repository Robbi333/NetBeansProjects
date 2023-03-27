/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.programming;

/**
 *
 * @author D00251715
 */
public class HeaterApp {

    public static void main(String[] args) {

        Building carrols = new Building("PJs");

        carrols.addHeater(new Heater());
        carrols.addHeater(new Heater());
        carrols.addHeater(new Heater());
        carrols.addHeater(new Heater());

        Building mpc = new Building("MPC");

        mpc.addHeater(new Heater());
        mpc.addHeater(new Heater());
        mpc.addHeater(new Heater());
        mpc.addHeater(new Heater());

        System.out.println("Number of heaters in PJs");
        System.out.println(carrols.showNumberOfHeaters());

        System.out.println("Number of heaters in MPC");
        System.out.println(mpc.showNumberOfHeaters());

        System.out.println("Display the number of heaters with a temperature greater than 30 in carrols.");
        System.out.println();

        System.out.println("temp of the heater with ID 1 in MPC");
        
        System.out.println("Warmest heater in PJs");
        System.out.println(carrols.getWarmest());
        
        
    }
}
