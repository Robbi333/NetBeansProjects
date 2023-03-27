package work;

public class LinkedLists {
    
    private node first;
    private int size;

    public LinkedLists(){

        first = null;
        size = 0;
    }
    
public int size(){
    return size;
}

public boolean add(){

    Node newNode = new Node(value);

    if(first == null){

        fisrt = newNode;
    } else {

        Node current = first;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    size++;
    return true;
}

public 



    private static class Node{
        private int data;
        private Node next; 

        public Node(int value){
            this.data= value;
        }

    }

    
}
