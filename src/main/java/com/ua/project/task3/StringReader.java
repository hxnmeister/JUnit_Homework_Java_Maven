package com.ua.project.task3;

import com.ua.project.task3.exceptions.EmptyStringException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StringReader {
    private String subject;

    private void checkSubject() {
        if(subject == null) {
            throw new NullPointerException();
        }
        else if(subject.isEmpty()) {
            throw new EmptyStringException();
        }
    }

    public boolean isPalindrome() {
        try {
            checkSubject();

            final String REVERSED_SUBJECT = new StringBuilder(subject).reverse().toString();
            return subject.equals(REVERSED_SUBJECT);
        }
        catch(RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public int countVowels() {
        try {
            checkSubject();

            final String VOWELS = "aeiouy";
            int count = 0;

            for (char c : subject.toCharArray()) {
                if(VOWELS.contains(String.valueOf(c).toLowerCase())){
                    ++count;
                }
            }

            return count;
        }
        catch(RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public int countConsonants() {
        try {
            checkSubject();

            final String CONSONANTS = "bcdfghjklmnpqrstvwxyz";
            int count = 0;

            for (char c : subject.toCharArray()) {
                if(CONSONANTS.contains(String.valueOf(c).toLowerCase())){
                    ++count;
                }
            }

            return count;
        }
        catch(RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public int countSubstringEntering(String substring) {
        try {
            checkSubject();

            int count = 0;

            for (String line : subject.split("[\\s!.,;?]+")) {
                if(line.equalsIgnoreCase(substring)){
                    ++count;
                }
            }

            return count;
        }
        catch(RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
