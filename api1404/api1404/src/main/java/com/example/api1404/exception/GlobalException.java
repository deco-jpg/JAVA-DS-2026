package com.example.api1404.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, Object>> runtimeException(RuntimeException runtimeException){
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(Map.of("mensagem",runtimeException.getMessage()));
    }
}
