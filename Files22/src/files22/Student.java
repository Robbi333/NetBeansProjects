/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files22;

/**
 *
 * @author brosnanb
 */
public class Student {
    private int id;
    private double gpa;
    private String name;

    public Student(int id, double gpa, String name) {
        this.id = id;
        this.gpa = gpa;
        this.name = name;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	
	//What is output from your app if the toString() is removed from here??

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", gpa=" + gpa + ", name=" + name + '}';
    }

   
      
      
    
}
