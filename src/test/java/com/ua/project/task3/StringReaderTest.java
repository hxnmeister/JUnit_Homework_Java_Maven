package com.ua.project.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringReaderTest {
    static StringReader stringReader = StringReader.builder().build();

    @Test
    void isPalindrome_ShouldReturnTrue_WhenSubjectIsPalindrome() {
        stringReader = StringReader.builder().subject("madam").build();

        assertTrue(stringReader.isPalindrome());
    }

    @Test
    void isPalindrome_ShouldReturnFalse_WhenSubjectIsNotPalindrome() {
        stringReader = StringReader.builder().subject("engine").build();

        assertFalse(stringReader.isPalindrome());
    }

    @Test
    void countVowels_ShouldReturnCountOfVowels_WhenCalled() {
        stringReader = StringReader.builder().subject("hello world!").build();

        int expected = 3;
        int actual = stringReader.countVowels();

        assertEquals(expected, actual);
    }

    @Test
    void countConsonants_ShouldReturnCountOfConsonants_WhenCalled() {
        stringReader = StringReader.builder().subject("hello world!").build();

        int expected = 7;
        int actual = stringReader.countConsonants();

        assertEquals(expected, actual);
    }

    @Test
    void countSubstringEntering_ShouldReturnCountOfSubstringEntering_WhenCalled() {
        stringReader = StringReader.builder().subject("hello world, hello. hi bye heeelo!").build();

        int expected = 2;
        int actual = stringReader.countSubstringEntering("HEllO");

        assertEquals(expected, actual);
    }

    @Test
    void checkSubject_ShouldThrow_WhenSubjectIsNull() {
        stringReader = StringReader.builder().build();

        assertThrows(RuntimeException.class, stringReader::countConsonants);
    }

    @Test
    void checkSubject_ShouldThrow_WhenSubjectIsEmpty() {
        stringReader = StringReader.builder().subject("").build();

        assertThrows(RuntimeException.class, stringReader::countConsonants);
    }
}
