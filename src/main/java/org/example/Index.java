package org.example;

public class Index {

    public static void main(String[] args) {

        BinarySearchTree<String> tree = new BinarySearchTree<>("l");

        tree.add("a");
        tree.add("c");
        tree.add("g");
        tree.add("b");
        tree.add("k");

        tree.add("r");
        tree.add("z");
        tree.add("t");
        tree.add("v");
        tree.add("n");

        //                  l
        //      a                       r
        //          c              n          z
        //       b      g               t
        //                  k               v

        tree.printBFS();

        System.out.println("height - " + tree.height());

        BinarySearchTree<Integer> anotherTree = new BinarySearchTree<>(1);

        anotherTree.add(4);
        anotherTree.add(6);
        anotherTree.add(8);
        anotherTree.add(2);
        anotherTree.add(9);

        anotherTree.add(3);
        anotherTree.add(5);
        anotherTree.add(10);
        anotherTree.add(18);
        anotherTree.add(29);

        System.out.println("Sum - " + anotherTree.sum());
        System.out.println("Sum - " + anotherTree.maxSum());
    }
}
