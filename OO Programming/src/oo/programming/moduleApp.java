/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.programming;

/**
 *
 * @author d00251715
 */
public class moduleApp {

    public static void main(String[] args) {

        Course c1 = new Course("Computing");

        c1.addModule(new Module("123", "Comp", 10));
        c1.addModule(new Module("124", "Math", 5));
        c1.addModule(new Module("125", "Programming", 10));
        c1.addModule(new Module("126", "Data Analysis", 5));
        c1.addModule(new Module("127", "Web Dev", 5));

        System.out.println("***********");

        System.out.println(c1.showNumberOfModules());

    }

}
