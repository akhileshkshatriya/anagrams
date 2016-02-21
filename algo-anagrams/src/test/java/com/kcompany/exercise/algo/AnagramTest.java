package com.kcompany.exercise.algo;


import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class AnagramTest {

    private Anagram anagram = new Anagram();

    @Test
    public void testGetGroupedAnagrams_ShouldReturnValidAnagrams() {
        List<String> words = Arrays.asList("test", "tset");
        testValid(words);
    }

    @Test
    public void testGetGroupedAnagrams_ShouldReturnOnlyValidAnagrams() {
        List<String> words = Arrays.asList("test", "tset", "abc", "bcd");
        testValid(words);
    }

    @Test
    public void testGetGroupedAnagrams_ShouldReturnEmptyCollection() {
        List<String> words = Arrays.asList("abc", "def", "ghi");
        Collection<List<String>> groupedAnagrams = anagram.getGroupedAnagrams(words);
        assertNotNull(groupedAnagrams);
        assertTrue(groupedAnagrams.isEmpty());
    }

    private void testValid(List<String> words) {
        Collection<List<String>> groupedAnagrams = anagram.getGroupedAnagrams(words);

        assertNotNull(groupedAnagrams);
        assertFalse(groupedAnagrams.isEmpty());
        assertEquals(1, groupedAnagrams.size());
        Optional<List<String>> optional = groupedAnagrams.stream().findFirst();
        List<String> anagram = optional.get();
        assertNotNull(anagram);
        assertEquals(2, anagram.size());
        assertTrue(anagram.contains("test"));
        assertTrue(anagram.contains("tset"));
    }
}