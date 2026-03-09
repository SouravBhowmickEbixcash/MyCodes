package com.example.SecurityApp.SecurityApplication.advice;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ApiError {

    private LocalDateTime timeStamp;
    private String error;
    private HttpStatus status;

    private ApiError (){
        this.timeStamp = LocalDateTime.now();
    }

    private ApiError (String error, HttpStatus status){
        this();
        this.error = error;
        this.status = status;
    }

    public static class Builder {
        private String error;
        private HttpStatus status;

        public Builder error(String message) {
            this.error = message;
            return this;
        }

        public Builder status(HttpStatus status){
            this.status = status;
            return this;
        }

        public ApiError build(){
            return new ApiError(error, status);
        }
    }
}
