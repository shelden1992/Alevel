package com.company.test.TestLinkedList1;

public class SingleLinkedList<E> {
    private Node<E> head;
    private int size=0;

    public void add(E value) {
        if (head == null) {
            this.head=new Node<E>(value);
        } else {
            Node temp=head;
            while (temp.getNext() != null) {
                temp=temp.getNext();
            }
            temp.setNext(new Node<>(value));

        }
        size++;
    }

    public void add(int index, E value) {
        if (index < 0) {
            throw new IllegalArgumentException("WTF? index<0");
        }
        else if (value == null) {
            throw new NullPointerException("You do again?");
        }
        int currentIndex=0;
        Node temp=head;
        if (currentIndex == index) {

        } else {
            temp=temp.getNext();
            currentIndex++;
        }
        size++;


    }


    public E get(int index) throws IllegalAccessException {
        if (index > size) {
            throw new IllegalArgumentException("WTF? index>size");
        }
        int currentIndex=0;
        Node<E> temp=head;
        while (temp != null) {
            if (currentIndex == index) {
                return temp.getValue();
            } else {
                temp=temp.getNext();
                currentIndex++;
            }


        }
        throw new IllegalAccessException();
    }

    public void remove(int index) throws NullPointerException {
        int currentIndex=0;
        Node temp=head;
        while (temp != null) {
            if (( currentIndex + 1 ) == index) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp=temp.getNext();
                currentIndex++;
            }


        }
        size--;

    }


    public int contains(Object o) throws IllegalAccessException {
        Node temp=head;
        int currentIndex= 0;
        while (temp != null) {
            if (o.equals(temp.getValue())) {
                return  currentIndex;
            } else {
                temp=temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalAccessException("No finder this element");
    }

    int size() {
        return size;
    }

}
