package exception23;

public class IllegalEmailException extends IllegalArgumentException{

    public IllegalEmailException(String s){
        super(s);
    }
}