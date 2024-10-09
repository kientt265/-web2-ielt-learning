package com.spring.fantasyielts.advices;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.spring.fantasyielts.exceptions.DataNotFoundException;
import com.spring.fantasyielts.exceptions.FileUploadException;
import com.spring.fantasyielts.exceptions.InvalidInput;
import com.spring.fantasyielts.exceptions.InvalidParamException;
import com.spring.fantasyielts.responses.BaseResponse;

@RestControllerAdvice
public class GlobalHandlerExceptions {
    @ExceptionHandler
    public ResponseEntity<BaseResponse> handleDataNotFoundException(DataNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body(new BaseResponse(LocalDate.now(), ex.getMessage()));
    }

    @ExceptionHandler(value = FileUploadException.class)
    public ResponseEntity<BaseResponse> handleFileUploadExceptions(FileUploadException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new BaseResponse(LocalDate.now(), ex.getMessage()));
    }

    @ExceptionHandler(value = InvalidParamException.class)
    public ResponseEntity<BaseResponse> handleInvalidParamException(InvalidParamException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new BaseResponse(LocalDate.now(), ex.getMessage()));
    }

    @ExceptionHandler(value = InvalidInput.class)
    public ResponseEntity<BaseResponse> handleInvalidInputException(InvalidInput ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new BaseResponse(LocalDate.now(), ex.getMessage()));
    }
}
