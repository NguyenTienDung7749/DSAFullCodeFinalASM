package ASM1Code.DataStructure.LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList myList = new SingleLinkedList();
        myList.add(7); myList.add(11); myList.add(3); myList.add(2); myList.add(9);

        // Check in main.java
        myList.traverse();
        myList.search(11);
        myList.search(99);
    }
}
