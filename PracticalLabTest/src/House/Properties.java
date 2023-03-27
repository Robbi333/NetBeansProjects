/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package House;

import java.util.ArrayList;

/**
 *
 * @author D00251715
 */
public class Properties {

    ArrayList<House> Properties = new ArrayList();

    public void addProperty(House a) {

        Properties.add(a);
    }

    public boolean deleteHouse(String eircode) {

        boolean result = false;

        for (int i = 0; i < Properties.size(); i++) {
            if (Properties.get(i).getEircode().equalsIgnoreCase(eircode)) {
                Properties.remove(i);
                result = true;
            }
        }
        return result;
    }

    public double getAverageRent() {
        
        double total = 0;
        double count = 0;
        
        for (int i = 0; i < Properties.size(); i++) {
           total =  Properties.get(i).calcRent(Properties.get(i)) + total;
           count++;
        }
        
       return total/count;
    }
    
   // public ArrayList getHousesWithFeature(String feature){
  //  ArrayList<House> DeluxH = new ArrayList();
    
  //  for (int i = 0; i < Properties.size(); i++) {
   //  if(Properties.get(i) instanceof DeluxHouse){
        // DeluxH.add(Properties.get(i));
   //  }
   // }
   // return DeluxH;
   // }
    
    public int getNumHouseType(String type){
        
        int count = 0;
        int countH = 0;
        int finalC = 0;
        
        for (int i = 0; i < Properties.size(); i++) {
     if(Properties.get(i) instanceof DeluxHouse){
         count++;
     }
    }
        
        for (int i = 0; i < Properties.size(); i++) {
     if(Properties.get(i) instanceof House){
         countH++;
     }
    }
        
        if(type.equalsIgnoreCase("DeluxHouse")){
            
            finalC = count;
        }
        else if(type.equalsIgnoreCase("House")){
           finalC = countH;
        }
        return finalC;
}
    
}
