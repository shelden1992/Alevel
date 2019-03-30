package com.company.test.TestLinkedList1;

 public class Node<E> {

        private E e;
        private Node next;

        public Node(E value, Node next) {
            this.e=value;
        }

     public Node(E value) {
            this.e = value;
     }

     public E getValue() {
            return e;
        }

        public void setValue(E value) {
            this.e=value;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next=next;
        }
    }

