package com.kcompany.exercise.reader;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class FileReaderTest {

    private Reader reader = new FileReader();

    private static final String WORD = "act";
    private static final String VALID_INPUT_FILE_NAME = "sample.txt";
    private static final String INVALID_INPUT_FILE_NAME = "invalid-file.txt";

    @Test
    public void testRead() throws IOException {
        List<String> words = reader.read(VALID_INPUT_FILE_NAME);

        assertNotNull(words);
        assertFalse(words.isEmpty());
        assertEquals(7, words.size());
        assertTrue(words.contains(WORD));
    }

    @Test(expected = IOException.class)
    public void testRead_ShouldThrowFileNotFound() throws FileNotFoundException, IOException {
        List<String> words = reader.read(INVALID_INPUT_FILE_NAME);
    }
}
