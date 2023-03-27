package work;

public class LinkedListsStr {

    private static class Node {

        private Node last;
        private String data;
        private Node next;

        public Node(String value) {
            this.last = null;
            this.data = value;
            this.next = null;
        }

        public boolean hasNext() {
            return next == null;
        }
    }
    private Node first;

    private int size;

    public LinkedListsStr() {
        first = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void clear() {

        first = null;
        size = 0;
    }

    public boolean add(String word, int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid Pos");
        }
        if (index == 0) {
            return add(word);

        }

        Node current = first;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node newNode = new Node(word);
        newNode.next = current.next;
        current.next = newNode;
        size++;
        return true;
    }

    public void delete() {
        Node current = first;
        if (current.next == null) {
            Node temp = first;
            while (temp.next != current) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            temp.next = null;
            current = first;
        }
    }


    public boolean add(String word) {
        Node newNode = new Node(word);

        if (first == null) {
            first = newNode;
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        return true;
    }

    public String set(int index, String word) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid Pos");
        }

        Node current = first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        String org = current.data;

        current.data = word;

        return org;
    }

    public String get(int pos) {

        String finalP = null;

        if (pos >= size || pos < 0) {

            throw new IndexOutOfBoundsException("Illegal pos inputed");
        }
        int tracker = 0;
        Node current = first;
        while (current != null) {

            if (tracker == pos) {

                finalP = current.data;
            }
            current = current.next;
            tracker++;
        }
        return finalP;
    }

    public int indexOf(String word) {

        if (word == null) {

            throw new IllegalArgumentException("The word is null");
        }
        if (size == 0) {
            throw new NullPointerException("mate there's nothing here");
        }
        int tracker = -1;
        Node current = first;

        while (current.next != null) {
            if (current.data.equalsIgnoreCase(word)) {
                return tracker;
            }
            current = current.next;
            tracker++;
        }
        return tracker;

    }

    public String remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid Pos");
        }
        String original;
        if (index == 0) {
            original = first.data;
            first = first.next;
        } else {
            Node current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            original = current.next.data;
            current.next = current.next.next;
        }
        size--;
        return original;
    }
}
