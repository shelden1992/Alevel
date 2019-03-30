package com.company.myLinkedList;

public class SinglyLinkedList<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size=0;


    public SinglyLinkedList() {
//        firstNode=new Node<>(null, lastNode, null);
//        lastNode=new Node<>(null, null, firstNode);

    }


    public int contains(Object o) throws IllegalAccessException {
        Node temp=firstNode;
        int currentIndex=0;
        while (temp != null) {
            if (o.equals(temp.getValue())) {
                return currentIndex;
            } else {
                temp=temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalAccessException("No finder this element");
    }


    public void remove(Object o) {
        int currentIndex=0;
        Node<E> temp=firstNode;
        if (firstNode.getValue().equals(o)) {
            firstNode=null;
            temp=temp.setNext(temp.getNext());
            firstNode=temp;
            size--;
        } else {

            while (temp.getNext() != null) {
                if (temp.getNext().getValue().equals(o)) {

                    temp.setNext(temp.getNext().getNext());

                    size--;
                    return;

                } else {
                    temp=temp.getNext();
                    currentIndex++;
                }
            }
        }
    }


    public Node<E> remove(int index) {
        int currenIndex=0;
        Node<E> temp=firstNode;
        if (currenIndex == index) {

            firstNode=null;
            temp=temp.setNext(temp.getNext());
            firstNode=temp;
            size--;

        } else if (size - 1 == index) {

            while (temp.getNext().getNext() != null) {//дошли до предпоследного элемента, который нужно удалить! temp - последний элемент
                temp=temp.getNext();

            }
            temp.setNext(null);
            size--;
        } else

        {
            while (temp.getNext() != null) {
                if (currenIndex + 1 == index) {
                    size--;
                    return ( temp=temp.setNext(temp.getNext().getNext()) );

                } else
                    temp=temp.getNext();
                currenIndex++;
            }

        }
        return null;
    }

    public void clear() {

    }

    public E get(int index) throws IllegalAccessException {
        if (index > size) {
            throw new IllegalArgumentException("WTF? index>size");
        }
        int currentIndex=0;
        Node<E> temp=firstNode;
        while (temp != null) {
            if (currentIndex == index) {
                return temp.getValue();
            } else {
                temp=temp.getNext();
                currentIndex++;
            }
        }
        return null;
    }

    public E set(int index, E element) {


        return null;
    }


    public void add(E e) {
        if (e == null) {
            throw new NullPointerException("The first argument for addLast() is null.");
        } else if (firstNode == null) {
            this.firstNode=new Node<E>(e);

        } else {
            Node<E> temp=firstNode;
            while (temp.getNext() != null) {
                temp=temp.getNext();

            }
            temp.setNext(new Node<E>(e));
        }
        size++;
    }

    public void add(int index, E e) {
        int currentIndex=0;
        Node<E> temp=firstNode;

        if (index < 0) {
            throw new IllegalArgumentException("WTF? index<0");
        } else if (e == null) {
            throw new NullPointerException("You do again?");
        }

        if (currentIndex == index) {
            firstNode=new Node<E>(e);

//            while (temp.getNext() != null) {
//                temp=temp.setNext(temp);
            {
            }

            size++;
        } else {

            temp=temp.getNext();
            currentIndex++;
        }
        size++;
    }


    public int size() {
        return this.size;
    }

    public void Clear() {
        Node<E> temp=firstNode;
        firstNode=null;
        while (temp.getNext() != null) {
            temp=temp.getNext().setNext(null);

        }
        size=0;
    }


    private class Node<E> {
        private E currenElement;
        private Node next;
        private Node prev;

        public Node(E currenElement, Node next) {
            this.currenElement=currenElement;
            this.next=next;
        }

        public Node(E value, Node next, Node prev) {
            this.currenElement=value;
            this.next=next;
            this.prev=prev;
        }

        public Node(E e) {
            this.currenElement=e;
        }

        public E getValue() {
            return currenElement;
        }

        public void setValue(E value) {
            this.currenElement=value;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> setNext(Node next) {
            return this.next=next;

        }


    }
}
