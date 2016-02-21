package com.kcompany.exercise.printer;


import java.util.Collection;
import java.util.List;

public class ConsolePrinter implements Printer {

    public void print(Collection<List<String>> groupedAnagrams) {
        System.out.println("");
        System.out.println("Anagrams Found :: ");

        groupedAnagrams.stream().forEach(
                list -> {
                    list.stream().forEach(s ->
                            System.out.print(s + " "));
                    System.out.println("");
                }
        );
        System.out.println("");
    }
}
