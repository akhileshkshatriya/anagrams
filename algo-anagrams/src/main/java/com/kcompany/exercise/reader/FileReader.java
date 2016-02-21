package com.kcompany.exercise.reader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileReader implements Reader {

    private List<String> words = new ArrayList<>();

    public List<String> read(String fileName) throws IOException {

        InputStream inputStream = FileReader.class.getClassLoader().getResourceAsStream(fileName);

        if (inputStream == null) {
            throw new FileNotFoundException("property file '" + fileName + "' not found in the classpath");
        }
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNext()) {
            words.add(scanner.next().toLowerCase());
        }
        scanner.close();
        inputStream.close();
        return Collections.unmodifiableList(words);
    }
}
