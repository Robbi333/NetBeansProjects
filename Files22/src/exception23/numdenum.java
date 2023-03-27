package exception23;

public class numdenum {

    private final integer numerator;
    private final integer denominator;
    private double fraction;

    public numdenum(integer numerator,integer denominator){

        this.denominator = denominator;
        this.numerator = numerator;
        if(denominator == null){
            throw new NullDenominatorException("Invalid Denominator inputed");
        }
        this.fraction= (double)numerator/denominator;
    }

    public double getFraction() {
        return fractions;
    }

    public void setFraction(double fractions) {
        this.fraction = fractions;
    }
}
