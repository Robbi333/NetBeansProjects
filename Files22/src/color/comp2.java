package color;

import java.util.Comparator;

public class comp2  implements Comparator<Shape>{
    
    @Override
    public int compare(Shape o1, Shape o2){

        int x;

        x= o1.getColour().compareTo(o2.getColour());

        if(x==0){
            x = ((Double)o1.getArea()).compareTo(o2.getArea());
        }
    }
}
