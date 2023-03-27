package exception23;

/**
 *
 * @author D00251715
 */
public class filehandlin {
    
  public static void main(String[] args) {
        
        try {
           
            System.out.println(divide(1,0));
            
            
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        
       System.out.println(divide1(1,0));
    }

    
    
    public static int divide(int num1 , int num2){

        return num1 / num2;
    }

    public static int divide1(int num1, int num2){

        int total;

        try {
           total = num1 / num2;
           
           return total;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    
        return 0;
}
    
public static int divide3(int num1, int num2){

    int total = 0;
    boolean flag = false;

    try {
        while(flag = false);
        if(num1 <= 0 || num2 <= 0){

            
        }
        total = num1 / num2;
        flag = true;
    } catch (ArithmeticException e) {
        System.out.println("ArithmeticException");
    }

    return total;
}
   
}
