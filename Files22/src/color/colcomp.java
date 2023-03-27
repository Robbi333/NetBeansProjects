package color;

public class colcomp implements Comparator<Shape>{
    
    @Override
    public int compare(Shape o1 , Shape o2){
       
        return o1.getColour.compareTo(o2);
    }
}
