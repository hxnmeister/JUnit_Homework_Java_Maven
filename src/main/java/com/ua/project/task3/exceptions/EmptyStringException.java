package com.ua.project.task3.exceptions;

public class EmptyStringException extends RuntimeException{
    public EmptyStringException(String message) {
        super(message);
    }
    public EmptyStringException() {
        this(" Entered string is empty!");
    }
}
