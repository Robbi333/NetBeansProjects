/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.programming;

import java.util.ArrayList;

/**
 *
 * @author d00251715
 */
public class Course {
    private ArrayList<Module> topics;
    private String name;
   
    public Course(String name){
        
    topics =  new ArrayList();
    
    }
    
    public boolean addModule(Module c) {
        return topics.add(c);
    }
    
    public int showNumberOfModules() {
        return this.topics.size();
    }
    
    public int getTotalCredits() {
        
        int total = 0;
        
        for (int i = 0; i < topics.size(); i++) {
            
         total = total + topics.get(i).getCredits();
        }
        return total;
    }
    
     public ArrayList<Module> findall5CreditModules(){
         ArrayList<Module> h= new ArrayList();
        
        
        for(Module element: topics){
        if(element.getCredits()< 6){
        h.add(element);
        
        }
        }
        return h;
    }
}
