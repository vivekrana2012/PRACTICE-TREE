package org.example;

public class BinarySearchTree implements Tree {

    private BinaryNode root;

    public BinarySearchTree(BinaryNode root) {
        this.root = root;
    }

    public void printBFS() {
        new DepthFirstPrint().print(this.root);
    }

    public void add(BinaryNode node) {
        add(this.root, node);
    }

    private void add(BinaryNode node, BinaryNode newNode) {

        if (node.compareTo(newNode) == 0) {
            return;
        }

        if (node.compareTo(newNode) < 0) {
            if (node.getRight() != null) {
                add(node.getRight(), newNode);
            } else {
                node.setRight(newNode);
            }
        } else {
            if (node.getLeft() != null) {
                add(node.getLeft(), newNode);
            } else {
                node.setLeft(newNode);
            }
        }
    }
}
