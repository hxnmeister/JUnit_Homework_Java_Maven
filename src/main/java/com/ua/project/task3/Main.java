package com.ua.project.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;
        String searchSubstring;

        try {
            StringReader stringReader = StringReader.builder().build();

            while(true) {
                System.out.print(" Enter your line to check what it contains (Enter \"0\" to exit): ");
                inputString = scanner.nextLine();

                if(inputString.equals("0")) {
                    System.out.println(" Shutting down program...");
                    return;
                }

                stringReader.setSubject(inputString);

                System.out.println("-".repeat(50));
                System.out.println(" Your line contains:");
                System.out.print(stringReader.isPalindrome() ? "  Palindrome\n" : "");
                System.out.println("  Vowels: " + stringReader.countVowels());
                System.out.println("  Consonants: " + stringReader.countConsonants());
                System.out.println("-".repeat(50));

                System.out.print(" Enter word to search in line, enter \"0\" to skip: ");
                searchSubstring = scanner.nextLine();

                if(!searchSubstring.equals("0")) {
                    System.out.println("  Count of entries of word \"" + searchSubstring + "\": " + stringReader.countSubstringEntering(searchSubstring));
                    System.out.println("-".repeat(50));
                }
            }
        }
        catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
