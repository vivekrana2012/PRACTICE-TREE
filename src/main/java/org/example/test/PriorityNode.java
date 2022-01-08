package org.example.test;

import lombok.Getter;
import lombok.Setter;
import org.example.Node;

@Setter
@Getter
public class PriorityNode implements Node {

    private char data;
    private int priority;
    private PriorityNode left;
    private PriorityNode right;
}
