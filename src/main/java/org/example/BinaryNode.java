package org.example;

import lombok.Getter;

import java.util.Objects;

@Getter
public class BinaryNode<T extends Comparable<T>> implements Node, Comparable<BinaryNode<T>> {

    private final T data;
    private BinaryNode<T> left;
    private BinaryNode<T> right;

    @Override
    public String toString() {
        return "BinaryNode{" + "data='" + data + '\'' + '}';
    }

    public BinaryNode(T data) {
        this.data = data;
    }

    @Override
    public int compareTo(BinaryNode<T> o) {

        if (o == null) {
            return 1;
        }

        if (this.getData() == null) {
            return -1;
        }

        return this.getData().compareTo(o.getData());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BinaryNode<T> that = (BinaryNode<T>) o;
        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }
}
