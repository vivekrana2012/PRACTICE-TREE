package org.example;

import lombok.Getter;

import java.util.Objects;

@Getter
public class BinaryNode implements Node, Comparable<BinaryNode> {

    private final String data;
    private BinaryNode left;
    private BinaryNode right;

    @Override
    public String toString() {
        return "BinaryNode{" +
                "data='" + data + '\'' +
                '}';
    }

    public BinaryNode(String data) {
        this.data = data;
    }

    @Override
    public int compareTo(BinaryNode o) {

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
        BinaryNode that = (BinaryNode) o;
        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }
}
