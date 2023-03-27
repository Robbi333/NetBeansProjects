package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ex3 {
    
    public static void main(String[] args) {
        String[] words ={"one","two","three","four"};

        Set<String> s1 = new HashSet();

        for(String s: words){

            s1.add(s);
        }

        System.out.println("Original Set " + s1);
        
        Set<String> s11 = new HashSet(Arrays.asList(words));  

        System.out.println("Original Set " + s11);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word to be removed");
        String userWord = sc.next();
        s1.remove(userWord);

        System.out.println("Original Set " + s1);

        System.out.println("Enter a word to be add");
        String userWord1 = sc.next();
        if(s1.add(userWord1)==false){
            System.out.println("Word is already in set");
        }

        System.out.println("Original Set with word added " + s1);

        for(String s:s1){
            System.out.println(s);
        }

        Iterator<String> it = s1.iterator();
        Set<String> upperCase = new HashSet();
           while(it.hasNext()){
               String element;
               element = it.next();
               it.remove();
               upperCase.add(element.toUpperCase());
           }
           s1 = upperCase;
          System.out.println("Original Set (upper case)" + s1);


          boolean flag = false;
        it = s1.iterator();
        Set<String> lowercase = new HashSet();
        
        while(it.hasNext()){
            String element;
            element = it.next();
            if(flag = true){
            it.remove();
            flag = true;
            upperCase.add(element.toLowerCase());
            }
        }

        s1.addAll(lowercase);
        System.out.println("Original Set (upper case)" + s1);


    }
}
