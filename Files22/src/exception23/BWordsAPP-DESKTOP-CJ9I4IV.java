package exception23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BWordsAPP {

    public static void main(String[] args) throws FileNotFoundException {

        File myFile = new File("bwords.txt");

        BWords myBWords = new BWords();

        if (myFile.exists()) {
            Scanner sc = new Scanner(myFile);

            while (sc.hasNext()) {

                try {
                    myBWords.add(sc.next());
                } catch (IllegalWordException e) {
                    System.out.println("The Word Does not have a b in the start or end");

                    System.out.println(e.getMessage());
                }
            }
        } else {

            System.out.println("Invalid file");
        }

        System.out.println(myBWords);
    }
}
