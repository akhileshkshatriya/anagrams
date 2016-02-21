package com.kcompany.exercise.printer;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ConsolePrinterTest {

    private Printer printer = new ConsolePrinter();

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testConsoleOutput() {
        Collection<List<String>> groupedAnagrams = new ArrayList<>();
        List<String> anagram = Arrays.asList("test", "tset");
        groupedAnagrams.add(anagram);

        printer.print(groupedAnagrams);

        assertEquals("test tset \n", outContent.toString());
    }
}
