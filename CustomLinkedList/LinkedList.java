package CustomLinkedList;

public class LinkedList {

    private Node head;

    public void insertFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int data){
        Node newNode = new Node(data);
        Node current = head;

        if(head == null){
            head = newNode;
        } else{
            while(current.next!=null){
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void display(){
        Node current = head;

        while(current!=null) {
            System.out.println(current.data);
            current = current.next;
        }

    }

    public void search(int data){
        Node current = head;

        while(current!=null){

            if(current.data == data){
                System.out.println("Found!");
                return;
            }
            current = current.next;
        }

        System.out.println("Not found!");

    }

    public void deleteFront(){
        if(head == null){
            System.out.println("No node at the front.");
            return;
        }
        head = head.next;
        System.out.println("Deleted the node at the front.");
    }


    public void deleteEnd(){
        if(head == null){
            System.out.println("No node at the end.");
        }

        if(head.next == null){
            head = null;
        } else{
            Node current = head;

            do {
                if(current.next.next == null){
                    current.next = null;
                    System.out.println("Deleted the node at the end.");
                    break;
                }
                current = current.next;
            } while(current.next!=null);
        }
    }

}
