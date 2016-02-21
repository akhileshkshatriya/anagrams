package com.kcompany.exercise;


import com.kcompany.exercise.algo.Anagram;
import com.kcompany.exercise.printer.ConsolePrinter;
import com.kcompany.exercise.reader.FileReader;

import java.util.Optional;

public class ApplicationContext {

    private static final String READER = "reader";
    private static final String PRINTER = "printer";
    private static final String ANAGRAM = "anagram";


    public static ApplicationContext getApplicationContext() {
        return new ApplicationContext();
    }

    private ApplicationContext (){}

    public Optional<Object> getBean(String beanName) {
        switch (beanName) {
            case READER:
                return Optional.of(new FileReader());
            case PRINTER:
                return Optional.of(new ConsolePrinter());
            case ANAGRAM:
                return Optional.of(new Anagram());
            default:
                return Optional.empty();
        }
    }
}
