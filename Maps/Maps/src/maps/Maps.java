/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maps;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author leoze
 */
public class Maps {

//excercise one
    public static void main(String[] args) {
//1.Write a program to investigate the methods contained in
//the HashMap class.  Use Java defined data types
//as your key-value pairs (e.g. String, Integer).
//Add key-value pairs to the hashmap.
//Retrieve the value for a specified key.
//Test if the hashmap contains a specific key or value.
//Print the contents of the hashmap.

        Map<String, Double> results = new HashMap();

        results.put("john", 54.54);
        results.put("liam", 85.6);
        results.put("joseph", 40.5);
        results.put("david", 90.1);

        System.out.println(results);

        System.out.println(results.get("joseph"));

        System.out.println(results.containsKey("liam"));
        System.out.println(results.containsValue(40.5));

        System.out.println(results.keySet());

        System.out.println(results.values());

        double average = 0;

        for (Double element : results.values()) {
            average = average + element;
        }
        System.out.println("average mark is " + average / results.size());

        //increase each student mark by 10
//        for(Double element : results.values()){
//            element = element + (element*0.1);
//            for(String elements : results.keySet())
//            results.put(elements, element);
//        }
        for (Map.Entry<String, Double> element : results.entrySet()) {
            String key = element.getKey();
            double value = element.getValue();
          //  results.put(key, value + value * 0.1);
            //results.put(element.getKey(), element.getValue()*element.getValue()*0.1);
        }

        System.out.println(results);
        
        System.out.println("Student\tGrade");
        
         for (Map.Entry<String, Double> element : results.entrySet()) {
            String key = element.getKey();
            double value = element.getValue();
            results.put(key, value + value * 0.1);
            //results.put(element.getKey(), element.getValue()*element.getValue()*0.1);
             System.out.println(element.getKey() + " : " + element.getValue());
         }

         //change a students name
         //change a grade for a student
         
         
         for (Map.Entry<String, Double> element : results.entrySet()) {
            String key = element.getKey();
            double value = element.getValue();
            
            results.put(key, value + value * 0.1);
            //results.put(element.getKey(), element.getValue()*element.getValue()*0.1);
             System.out.println(element.getKey() + " : " + element.getValue());
         }

    }

}
