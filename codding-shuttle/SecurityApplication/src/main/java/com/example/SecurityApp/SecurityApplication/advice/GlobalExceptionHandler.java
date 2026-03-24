package com.example.SecurityApp.SecurityApplication.advice;

import com.example.SecurityApp.SecurityApplication.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiError> handleResourceNotFoundException(ResourceNotFoundException exception){
        ApiError errorResponse = ApiError.builder()
                .error(exception.getMessage())
                .status(HttpStatus.NOT_FOUND)
                .build();

        return ResponseEntity.status(errorResponse.getStatus()).body(errorResponse);
    }
}
