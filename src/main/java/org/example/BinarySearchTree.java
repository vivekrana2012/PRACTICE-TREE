package org.example;

import java.math.BigDecimal;

public class BinarySearchTree<T extends Comparable<T>> implements Tree {

    private final BinaryNode<T> root;

    public BinarySearchTree(T t) {
        this.root = new BinaryNode<>(t);
    }

    public void printBFS() {
        new DepthFirstPrint().print(this.root);
    }

    public int height() {
        return heightNow(this.root);
    }

    private int heightNow(BinaryNode<T> node) {

        if (node == null) {
            return 0;
        }

        int left = heightNow(node.getLeft());
        int right = heightNow(node.getRight());

        if (left > right) {
            return left + 1;
        } else {
            return right + 1;
        }
    }

    public void add(T t) {
        add(this.root, new BinaryNode<>(t));
    }

    private void add(BinaryNode<T> node, BinaryNode<T> newNode) {

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

    public BigDecimal maxSum() {

        if (this.root.getData() instanceof Number) {
            return maxSum(this.root);
        }

        return null;
    }

    private BigDecimal maxSum(BinaryNode<T> node) {

        if (node == null) {
            return BigDecimal.ZERO;
        }

        BigDecimal leftSum = maxSum(node.getLeft());
        BigDecimal rightSum = maxSum(node.getRight());

        BigDecimal sum = BigDecimal.ZERO;

        if (leftSum.compareTo(rightSum) > 0) {
            sum = sum.add(leftSum);
        } else {
            sum = sum.add(rightSum);
        }

        return sum.add(new BigDecimal(node.getData().toString()));
    }

    public BigDecimal sum() {

        if (this.root.getData() instanceof Number) {
            return sum(this.root);
        }

        return null;
    }

    private BigDecimal sum(BinaryNode<T> node) {

        if (node == null) {
            return BigDecimal.ZERO;
        }

        BigDecimal leftSum = sum(node.getLeft());
        BigDecimal rightSum = sum(node.getRight());

        BigDecimal sum = BigDecimal.ZERO;

        if (leftSum != null) {
            sum = sum.add(leftSum);
        }

        if (rightSum != null) {
            sum = sum.add(rightSum);
        }

        return sum.add(new BigDecimal(node.getData().toString()));
    }
}
