package sets;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.sound.sampled.SourceDataLine;

public class DGSet {
    public static void main(String[] args) {
        Set<String> Drum = new HashSet();
        Drum.add("Fred");
        Drum.add("Dan");
        Drum.add("Alan");
        Drum.add("Anne");
        Drum.add("Rob");
        Set<String> Guitar = new HashSet();
        Guitar.add("Alan");
        Guitar.add("Anne");
        Guitar.add("Rob");
        Guitar.add("Gina");
        Guitar.add("George");


        System.out.println(displayDrummerOnly(Drum,Guitar));
        System.out.println("**********************");
        System.out.println(displayGuitarsOnly(Drum, Guitar));
        System.out.println("**********************");
        System.out.println(displayBoth(Drum, Guitar));
        System.out.println("**********************");
        System.out.println(displayEither(Drum, Guitar));
    }
    
    public static Set<String> displayDrummerOnly(Set<String> d, Set<String> g){

        Set<String> difference = new HashSet();
        difference.addAll(d);
        difference.retainAll(g);

        
        System.out.println("Here are the people that only play drums only:");
        return difference;
    }
    public static Set<String> displayGuitarsOnly(Set<String> d, Set<String> g){
        Set<String> difference = new HashSet();
        difference.addAll(g);
        difference.retainAll(d);

        
        System.out.println("Here are the people that only play guitar only:");
        return difference;
    }

    public static Set<String> displayBoth(Set<String> d, Set<String> g){

        Set<String> intersection = new HashSet();
        intersection.addAll(d);
        intersection.retainAll(g);


        System.out.println("here are everyone who play both:");
        return intersection;
    }

    public static Set<String> displayEither(Set<String> d, Set<String> g){
        Set<String> union = new HashSet();
        union.addAll(d);
        union.addAll(g);

        System.out.println("Here is everyone who plays either:");
        return union;
    }
}
