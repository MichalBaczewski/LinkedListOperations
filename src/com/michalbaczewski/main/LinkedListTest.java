package com.michalbaczewski.main;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element1");
        linkedList.add("Element2");
        linkedList.add("Element3");
        System.out.println("========Testuję get==========");
        for (int index = 0; index < linkedList.getSize(); index++) {
            System.out.println(linkedList.get(index));
        }
        System.out.println("======Testuję wstawianie pod indeks===");
        linkedList.add(1, "Element wstawiony");
        for (int index = 0; index < linkedList.getSize(); index++) {
            System.out.println(linkedList.get(index));
        }
    }

}
