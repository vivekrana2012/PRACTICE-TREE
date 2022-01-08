package org.example.test;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveRepetitionIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String pattern = sc.nextLine();

        Map<Character, Long> state = pattern.chars().mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        state.entrySet().forEach(System.out::print);
    }
}
