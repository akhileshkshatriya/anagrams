package com.kcompany.exercise;

import com.kcompany.exercise.algo.Anagram;
import com.kcompany.exercise.printer.Printer;
import com.kcompany.exercise.reader.Reader;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class Application {

    private static final String INPUT_FILE_NAME = "sample.txt";

    public static void main(String[] args) throws IOException {

        ApplicationContext context = ApplicationContext.getApplicationContext();

        Reader reader = (Reader) context.getBean("reader").get();
        List<String> words = reader.read(INPUT_FILE_NAME);
        System.out.println("Inputs : " + words);

        Anagram anagram = (Anagram) context.getBean("anagram").get();
        Collection<List<String>> groupedAnagrams = anagram.getGroupedAnagrams(words);

        Printer printer = (Printer) context.getBean("printer").get();
        printer.print(groupedAnagrams);
    }
}
