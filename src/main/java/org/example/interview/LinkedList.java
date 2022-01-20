package org.example.interview;

public class LinkedList {

    private Node head;

    void addFirst(Node node) {

        if (this.head == null) {
            this.head = node;
        } else {
            node.setNext(this.head);

            this.head = node;
        }
    }

    void addLast(Node node) {

        if (this.head == null) {
            this.head = node;
        } else {
            addNow(this.head, node);
        }
    }

    void printNodes() {
        printNow(this.head);
    }

    private void printNow(Node node) {

        if (node != null) {
            System.out.println(node);

            printNow(node.getNext());
        }
    }

    private void addNow(Node node, Node newNode) {
        if (node.getNext() == null) {
            node.setNext(newNode);
        } else {
            addNow(node.getNext(), newNode);
        }
    }

    Node removeFirst() {

        Node removedNode = this.head;

        if (this.head != null) {
            this.head = this.head.getNext();
        }

        return removedNode;
    }

    Node removeLast() {

        if (this.head == null) {
            return null;
        }

        if (this.head.getNext() == null) {
            Node removedNode = this.head;

            this.head = null;

            return removedNode;
        }

        return removeLastNow(this.head);
    }

    Node removeLastNow(Node node) {

        if (node.getNext().getNext() == null) {

            Node removedNode = node.getNext();

            node.setNext(null);

            return removedNode;
        }

        return removeLastNow(node.getNext());
    }

    int size() {

        if (this.head == null) {
            return 0;
        }

        return sizeNow(this.head);
    }

    private int sizeNow(Node node) {

        if (node == null) {
            return 0;
        }

        return sizeNow(node.getNext()) + 1;
    }
}
