package org.example.interview;

public class Node {

    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    void setNext(Node node) {
        this.next = node;
    }

    Node getNext() {
        return this.next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
