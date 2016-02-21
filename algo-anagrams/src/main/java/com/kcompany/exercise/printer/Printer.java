package com.kcompany.exercise.printer;

import java.util.Collection;
import java.util.List;

public interface Printer {
    void print(Collection<List<String>> groupedAnagrams);
}
