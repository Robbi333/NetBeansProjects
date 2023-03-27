package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class set {
    
    public static void main(String[] args) {
        Set hSet = new HashSet();

        hSet.add(4);

        hSet.add("Hello");

        hSet.add(new Scanner(System.in));

        Set<String> hSet1 = new HashSet();

        System.out.println(hSet);

        Set<String> tSet = new TreeSet(hSet);

        Set<String> t2set = new TreeSet(new pgcomparator());

        t2set.addAll(hSet);

        System.out.println("reverse order" + t2set);
        Set<String> lhSet = new LinkedHashSet(hSet);

        hSet1.add("blue");
        hSet1.add("green");
        hSet1.add("red");
        hSet1.add("green");

        System.out.println("insertion order " + lhSet);

        Set<String> hSet2 = new HashSet();

        hSet2.add("blue");
        hSet2.add("red");
        hSet2.add("green");

        Set<String> union = new HashSet();
        union.addAll(hSet);
        union.addAll(hSet1);
        System.out.println("union " + union);
        Set<String> intersection = new HashSet();
        intersection.addAll(hSet);
        intersection.retainAll(hSet1);
        System.out.println("intersection " + intersection);
        Set<String> difference = new HashSet();
        difference.addAll(hSet);
        difference.removeAll(hSet1);
        System.out.println("difference " + difference);


        
    }
}

