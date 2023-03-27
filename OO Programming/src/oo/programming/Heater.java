package oo.programming;

/**
 *
 * @author D00251715
 */

public class Heater {
     // Create a class, Heater, with instance variables temp, of type int and change 
    //of type int and 2  
    //static constants MAX and MIN with values 40 and 5, respectively. 
	//Modify the class as appropriate to include a new field heaterId which 
    //should be unique for each heater and set by the system. Heater ids should start at 1.

    private int temp; //instance variables should be private - encapsulation
    private int change;
    private int id;

    public static final int MAX = 40;//Static fields belong to the class
    public static final int MIN = 5;//Constants can be public as they can't be changed

    private static int idCounter = 1; //Class keeps track of number of Heater objects created

//1.	Define a no argument constructor, 
//the temperature field should be set to 15 in the constructor and change to 5.
    public Heater() {
        this.temp = 15;
        this.change = 5;
        id = idCounter;

        idCounter++;
    }
    
//2.	Add accessors to return the values of the fields.

    public int getTemp() {//instance method must be called using an object reference
        return temp;
    }

    public int getChange() {
        return change;
    }

    public int getId() {
        return id;
    }

    public static int getIdCounter() {//Static method,can and should be called using a class reference
        return idCounter;
    }
    

//3.	Add a method, setChange(), 
    //that takes a single integer parameter and uses 
    //it to set the value of change. 
    //Add a check to this method to prevent a negative value being 
    //assigned to change.
    public boolean setChange(int c) {//good practice to return a boolean so that client can easily determine if update was successful and act accordingly
        boolean done = false;
        if (c > 0) {
            this.change = c;//this keyword refers to the current object - default
           // change = c;
            done = true;
        }
        return done;
    }

    public boolean setTemp(int temp) {
        boolean done = false;
        if (temp > Heater.MIN && temp < MAX) {//Static constant, class reference (MIN), if no Class specified, looks in current class(MAX)
            this.temp = temp;//need this here to distinguish between instance variable and parameter name
            done = true;
        }
        return done;
    }
//4.	Create mutators warmer() and cooler() 
    //to increase and decrease the temperature of 
    //the heater by the value in the change field. 
    //Warmer() should not allow the temperature 
    //to be set to a value greater than MAX. 
    //Cooler() should not allow the temperature to be 
    //set to a value less than MIN.
    public boolean warmer(int temp){
        boolean done = false;
        if(this.temp + temp <= MAX){
            this.temp = this.temp+ temp;
            done = true;
        }
        return done;
    }
    public boolean warmerV2(int temp){
        boolean done = false;
        if(this.temp + temp <= MAX){
            this.temp = this.temp+ temp;
            done = true;
        }
        else{
            this.temp = MAX;
        }
        return done;
    }
    // warmer() requirement would need to be clarified by customeruser
//5.	Modify the class as appropriate to include a new field heaterId which 
    //should be unique for each heater and set by the system. Heater ids should start at 1.

    
    @Override
    public String toString() {
        return "Heater{" + "temp=" + temp + ", change=" + change + ", id=" + id + '}';
    }

}

