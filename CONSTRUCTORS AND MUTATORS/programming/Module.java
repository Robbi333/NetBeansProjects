/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.programming;

/**
 *
 * @author D00251715
 */
public class Module {

    private String Code;
    private String Description;
    private double Credits;

    public Module() {

    }

    public Module(String Code1, String Descrip, double Credits) {

        Description = Descrip;
        Code = Code1;
        this.Credits = Credits;

    }

    public String Code() {

        return this.Code;

    }

    public String Description() {

        return this.Description;

    }

    public double Credits() {

        return this.Credits;

    }

    public void setCode(String c) {

        this.Code = c;

    }
    public void setDescription(String d) {

        this.Code = d;

    }
    public void setCredits(double c) {

        this.Credits = c;

    }
    
}
