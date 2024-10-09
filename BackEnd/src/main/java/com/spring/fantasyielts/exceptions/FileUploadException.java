package com.spring.fantasyielts.exceptions;


public class FileUploadException extends RuntimeException {
    public FileUploadException(String message) {
        super(message);
    }
}