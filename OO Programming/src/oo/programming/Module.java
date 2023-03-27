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
    private int Credits;

    private int id;
    private static int countmod = 0;

    public Module() {
        this.id = countmod;
        countmod += 1;
    }

    public Module(String Code1, String Descrip, int Credits) {

        Description = Descrip;
        Code = Code1;
        this.Credits = Credits;

        this.id = countmod;
        countmod += 1;
    }

    public Module(String Code1) {
        Code = Code1;

        this.id = countmod;
        countmod += 1;
    }

    public String getCode() {

        return this.Code;

    }

    public String getDescription() {

        return this.Description;

    }

    public int getCredits() {

        return this.Credits;

    }

    public void setCode(String c) {

        this.Code = c;

    }

    public void setDescription(String d) {

        this.Code = d;

    }

    public void setCredits(int c) {

        this.Credits = c;

    }

}
