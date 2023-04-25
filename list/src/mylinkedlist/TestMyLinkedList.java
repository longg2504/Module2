package mylinkedlist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(50);
        ll.addFirst(61);


        ll.add(4,9);
        ll.add(4,9);
        ll.add(5,20);
        ll.printList();
    }
}
