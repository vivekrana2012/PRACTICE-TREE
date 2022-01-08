package org.example.test;

public class PriorityQueue {

    private PriorityNode root;

    void insert(PriorityNode node) {

        if (this.root == null) {
            this.root = node;
        } else {
            insertNow(this.root, node);
            balance();
        }
    }

    private void balance() {

    }

    private void insertNow(PriorityNode node, PriorityNode newNode) {

        if (node.getLeft() == null) {
            node.setLeft(node);
        }
    }
}
