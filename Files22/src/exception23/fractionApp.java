package exception23;

public class fractionApp{

    public static void main(String[] args) {
       try{
        Fraction f1 = new Fraction(5,null);
         System.out.println(f1.getFractions);
       } catch(NullDenominatorException e){

        System.out.println("Try Again");

        System.out.println(e.getMessage());
       }
        
    }
}