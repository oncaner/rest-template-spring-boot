package org.spring.resttemplate.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BinanceException.class)
    public String handleBinanceException(BinanceException exception) {
        return exception.getMessage();
    }

    @ExceptionHandler(HttpClientErrorException.class)
    public String handleHttpClientErrorException(HttpClientErrorException exception) {
        return exception.getResponseBodyAsString();
    }

}
