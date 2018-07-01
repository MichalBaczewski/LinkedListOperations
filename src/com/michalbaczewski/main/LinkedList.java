package com.michalbaczewski.main;

public class LinkedList<T> {

    private LinkedListElement<T> head;
    private LinkedListElement<T> tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T element) {
        LinkedListElement<T> newElement = new LinkedListElement<>(element);
        if (isEmpty()) {
            tail = newElement;
            head = newElement;
        } else {
            tail.nextElement = newElement;
            tail.nextElement.prevElement = tail;
            tail = tail.nextElement;
        }
        size++;
    }

    public void add(int index, T element) {
        LinkedListElement<T> newElement = new LinkedListElement<>(element);
        if (!isEmpty() && index > 0 && index < size) {
            LinkedListElement<T> currentElement = getElement(index);
            currentElement.prevElement.nextElement = newElement;
            newElement.prevElement = currentElement.prevElement;
            currentElement.prevElement = newElement;
            newElement.nextElement = currentElement;
            size++;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

//    public T remove(int index) {
//
//    }

    private LinkedListElement<T> getElement(int index) {
        if (!isEmpty() && index < size) {
            LinkedListElement<T> currentElement = head;
            for (int i = 0; i < index; i++) {
                currentElement = currentElement.nextElement;
            }
            return currentElement;
        } else {
            throw new IndexOutOfBoundsException();
        }
   }

   public T get(int index) {
        return getElement(index).value;
   }


    public int getSize() {
        return size;
    }

    private class LinkedListElement<T> {
        private T value;
        private LinkedListElement<T> nextElement;
        private LinkedListElement<T> prevElement;

        public LinkedListElement(T value) {
            this.value = value;
            this.nextElement = null;
            this.prevElement = null;
        }
    }
}
