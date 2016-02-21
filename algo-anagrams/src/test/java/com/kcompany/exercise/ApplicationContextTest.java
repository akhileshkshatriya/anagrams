package com.kcompany.exercise;

import com.kcompany.exercise.algo.Anagram;
import com.kcompany.exercise.printer.Printer;
import com.kcompany.exercise.reader.Reader;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class ApplicationContextTest {

    private static final String VALID_BEAN_READER = "reader";
    private static final String VALID_BEAN_PRINTER = "printer";
    private static final String VALID_BEAN_ANAGRAM = "anagram";
    private static final String INVALID_BEAN = "invalid-bean-name";

    @Test
    public void testGetApplicationContext() {
        ApplicationContext context = ApplicationContext.getApplicationContext();

        assertNotNull(context);
    }

    @Test
    public void testGetBean_ShouldReturnValidReaderObject() {
        ApplicationContext context = ApplicationContext.getApplicationContext();

        Optional<Object> optional = context.getBean(VALID_BEAN_READER);
        assertTrue(optional.isPresent());

        Object reader = optional.get();
        assertTrue(reader instanceof Reader);
        assertNotNull(reader);
    }

    @Test
    public void testGetBean_ShouldReturnValidPrinterObject() {
        ApplicationContext context = ApplicationContext.getApplicationContext();

        Optional<Object> optional = context.getBean(VALID_BEAN_PRINTER);
        assertTrue(optional.isPresent());

        Object printer = optional.get();
        assertTrue(printer instanceof Printer);
        assertNotNull(printer);
    }

    @Test
    public void testGetBean_ShouldReturnValidAnagramObject() {
        ApplicationContext context = ApplicationContext.getApplicationContext();

        Optional<Object> optional = context.getBean(VALID_BEAN_ANAGRAM);
        assertTrue(optional.isPresent());

        Object anagram = optional.get();
        assertTrue(anagram instanceof Anagram);
        assertNotNull(anagram);
    }

    @Test
    public void testGetBean_ShouldReturnOptionalObject() {
        ApplicationContext context = ApplicationContext.getApplicationContext();

        Optional<Object> optional = context.getBean(INVALID_BEAN);
        assertFalse(optional.isPresent());
    }
}