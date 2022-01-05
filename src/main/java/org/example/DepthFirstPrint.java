package org.example;

public class DepthFirstPrint {

    void print(BinaryNode node) {

        System.out.print(node.getData() + ", ");

        if (node.getLeft() == null && node.getRight() == null) {
            return;
        }

        if (node.getLeft() != null) {
            print(node.getLeft());
        }

        if (node.getRight() != null) {
            print(node.getRight());
        }
    }
}
