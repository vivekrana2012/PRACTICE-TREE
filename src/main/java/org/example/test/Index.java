package org.example.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Index {

    public static void main(String[] args) {

        String str = "abbabbac";

        String[] array = str.split("");


        Map<String, Long> state = Arrays.stream(array).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Map.Entry<String, Long>> entries = state.entrySet().stream().sorted((entry1, entry2) -> {
            return entry2.getValue().compareTo(entry1.getValue());
        }).toList();

        String finalPattern = entries.stream().map(entry -> {

            StringBuilder stringBuilder = new StringBuilder();

            long count = entry.getValue();
            String pattern = entry.getKey();

            for (int j = 0; j < count; j++) {
                stringBuilder.append(pattern);
            }

            return stringBuilder.toString();
        }).collect(Collectors.joining());

        System.out.println(finalPattern);
    }
}
