package org.example;

public class Index {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree(new BinaryNode("l"));

        tree.add(new BinaryNode("a"));
        tree.add(new BinaryNode("c"));
        tree.add(new BinaryNode("g"));
        tree.add(new BinaryNode("b"));
        tree.add(new BinaryNode("k"));

        tree.add(new BinaryNode("r"));
        tree.add(new BinaryNode("z"));
        tree.add(new BinaryNode("t"));
        tree.add(new BinaryNode("v"));
        tree.add(new BinaryNode("n"));

        //                  l
        //      a                       r
        //          c              n          z
        //       b      g               t
        //                  k               v

        tree.printBFS();
    }
}
