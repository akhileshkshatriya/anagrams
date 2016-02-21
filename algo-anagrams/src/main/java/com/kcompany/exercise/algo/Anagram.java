package com.kcompany.exercise.algo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

    private static final int MIN_SIZE = 1;

    public Collection<List<String>> getGroupedAnagrams(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(this::sort))
                    .values().stream()
                        .filter(ll -> ll.size() > MIN_SIZE)
                            .collect(Collectors.toList());
    }

    private String sort(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
