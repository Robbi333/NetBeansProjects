package com.mycompany.softwaretest;

import java.util.Scanner;

public class SoftwareTest {

    public static void main(String[] args) {

        //int num1;
        //int num2;

        //num1 = getInput("Enter your first number: ");
        //num2 = getInput("Enter your second number: ");

        //System.out.println("The sum of the numbers is "+ sumDouble(num1,num2));
        //System.out.println("**********");

       // boolean ans = sleepIn(true,false);

       /* if(ans = true) {
            System.out.println("You can sleep!");
        }
        else{

            System.out.println("You can't sleep!");
        }

        boolean monkee = monkeyTrouble(true, true);

        if(mokee=true){

            System.out.println("BIG MONKEY PROBLEM");
        }
        else {

            System.out.println("NO PROBLEM");
        } */

    int reason = sleepIn(true, true);

    if (reason == 4){

        System.out.println("NO SLEEP");
    }
    else if(reason == 2){
        System.out.println("vacation! AND its the weekend, continue sleeping");
    }
    else if(reason == 3){
        System.out.println("vacation! AND its a weekday, take a nap");
    }
    else {
        System.out.println("no vacation BUT its the weekend, hmmmm sleep");
    }

    }


    public static int sumDouble(int a, int b){

        int total;

        if(a == b ){

            total = 2 * (a + b);


        } else {

            total = a + b;

        }


        return total;
    }
    public static int getInput(String prompt) {

        Scanner sc = new Scanner(System.in);

        int num1;

        System.out.println(prompt);
        num1 = sc.nextInt();

        return num1;

    }
    public static void display(String message) {
        System.out.println(message);
    }



   /* public static boolean sleepIn(boolean weekday, boolean vacation){

    if (weekday == true && vacation == false){

        return false;
    }
    else{
        return true;
    } */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if (aSmile == bSmile) {
            return true;
        } else {
            return false;
        }
    }

    public static int sleepIn(boolean weekday, boolean vacation){

        //1  WEEKEND W/ VACAY
        //2  VACAY ON WEEKEND
        //3  VACAY ON WEEKDAY
        //4  no sleep :(


    if (weekday == true && vacation == false){

        return 4;
    }
    else if (weekday == false && vacation == true){
        return 2;
    }
    else if (weekday == true && vacation == true){
        return 3;
    }
    else {
        return 1;
    }



}
}