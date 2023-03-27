/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package utils;

/**
 *
 * @author D00251715
 */
public class Arrayutils {

    public  void main(String[] args) {
        System.out.println(checkValidWord("AHHHHH"));
        System.out.println(checkBinary("0101010101"));
        System.out.println(checkWeekend("Saturday"));

    }

    public  boolean emptyChecker(String test) {
        return test != null;

    }

    // 1. Write a regular expression to check that a
    // string only contains lowercase and uppercase letters
    // (i.e., no numbers or special characters.)
    public  boolean checkValidWord(String word) {
        if (emptyChecker(word) == false) {
            return false;
        }
        String range = "[a-zA-Z]*";

        return word.matches(range);
    }

    // 2. Write a regular expression to check that a
    // String is a binary number
    // (i.e., only contains 1’s and 0’s)

    public  boolean checkBinary(String word) {
        if (emptyChecker(word) == false) {
            return false;
        }
        String range = "[01]+";

        return word.matches(range);
    }
    // 3. Write a regular expression that checks that a
    // String is either Saturday or Sunday.

    public  Boolean checkWeekend(String word) {
        if (emptyChecker(word) == false) {
            return false;
        }

        String range = "(?i:s(atur|un)day)";

        return word.matches(range);
    }

    // 4. Write a regular expression to check for a valid DkIT student number
    // (i.e., a ‘D’ followed by two zeros and 6 more numbers)
    public  Boolean checkDkitNum(String word) {
        if (emptyChecker(word) == false) {
            return false;
        }

        String range = "D{1}0{2}[0-9]{6}";

        return word.matches(range);
    }

    // 5. Write a regular expression to check for a valid Irish mobile number
    // (i.e., starts with 08, followed by 3, 5, 6, 7 or 9, then 7 other numbers.)
    public  Boolean checkIrishNum(String word) {
        if (emptyChecker(word) == false) {
            return false;
        }

        String range = "08[35679][0-9]{7}";

        return word.matches(range);
    }

    //6.	Write a regular expression to check for a valid password – 
    //decide for yourself what conventions make a suitable password 
    //and describe them in a comment.

   
    public  Boolean checkPassword(String word){
        if (emptyChecker(word) == false) {
            return false;
        }
        //Minimum eight characters, at least one letter and one number:
        String range = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        
        return word.matches(range);
    }

    //7.	Write a regular expression to check for a valid email address
   //  – what makes up a valid email address?
   public  Boolean checkEmail(String word){
    if (emptyChecker(word) == false) {
        return false;
    }

    String range = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    return word.matches(range);
   }
   
   public void displayMenu() {

        System.out.println("Choose an option:");
        System.out.println("1. Check if a password is valid");
        System.out.println("2. Check if an email address is valid");
        System.out.println("3. Exit");
    }
}
