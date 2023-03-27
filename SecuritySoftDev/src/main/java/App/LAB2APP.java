package App;

import java.util.InputMismatchException;
import java.util.Scanner;
import utils.Arrayutils;

public class LAB2APP {

    public static void main(String[] args) {

        Arrayutils test = new Arrayutils();

        System.out.println("Welcome!!");
        System.out.println("You can use this app to validate your password and email.");

        boolean flag = false;

        do {
            test.displayMenu();
            try {
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                flag = true;
                switch (choice) {
                    case 1:
                        
                        System.out.println("Enter your Password.");
                        System.out.println("Please be aware that the requirements are:");
                        System.out.println("Minimum eight characters, at least one letter and one number:");
                        String word = sc.next();
                        while (test.checkPassword(word) == false) {
                            if (test.checkPassword(word) == true) {

                                
                               System.out.println("Your password fits the requirements.");
                               break;
                            } else {

                                System.out.println("Your password does not fill the requirements");
                                break;
                            }
                        }
                    case 2:
                        System.out.println("Enter your email");
                        String email = sc.nextLine();
                        if (test.checkEmail(email) == true) {

                            System.out.println("You have inputed a valid email.");
                        } else {
                            System.out.println("Incorrect format.");
                        }
                        break;
                    case 3:
                        flag = true;
                        break;
                    default:
                        flag = false;
                        System.out.println("Enter a valid number");
                        
                }
            }catch(InputMismatchException e){
                System.out.println("Please enter a number");
            }
        } while (flag == false);
    }
}
