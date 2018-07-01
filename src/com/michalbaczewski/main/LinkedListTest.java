package com.michalbaczewski.main;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element1");
        linkedList.add("Element2");
        linkedList.add("Element3");
        System.out.println("========Testuję get==========");
        printLinkedList(linkedList);
        System.out.println("======Testuję wstawianie pod indeks===");
        linkedList.add(1, "Element wstawiony");
        printLinkedList(linkedList);
        System.out.println("======Testuję usuwanie===");
        linkedList.remove(2);
        printLinkedList(linkedList);
    }

    private static void printLinkedList(LinkedList<String> linkedList) {
        for (int index = 0; index < linkedList.getSize(); index++) {
            System.out.println(linkedList.get(index));
        }
    }

}
