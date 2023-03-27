package work;

public class LInkedListAPP {

    public static void main(String[] args) {

        LinkedListsStr s = new LinkedListsStr();

        s.add("bladee");
        s.add("Ecco2k");
        s.add("ThaiBoy Digital");
        s.add("whitearmour");
        s.add("Rob");


        for (int i = 0; i < 5; i++)
            System.out.println(s.get(i));

    }
}
