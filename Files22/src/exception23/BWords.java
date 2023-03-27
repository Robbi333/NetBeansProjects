package exception23;

import java.util.ArrayList;

public class BWords {

    private ArrayList<String> beeWords;


    public BWords() {
        this.beeWords = new ArrayList();
    }

    public boolean add(String c) {

        String regEx = "(^b\\w+)|(\\w+b$)";
        if (c == null || !c.matches(regEx)) {
            throw new IllegalWordException("Invalid Word inputed");
        }
        return beeWords.add(c);
    }

    @Override
    public String toString() {
        return "BWords [beeWords=" + beeWords + "]";
    }

}
