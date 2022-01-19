package com.training.spring.rest.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestErrorHandler {


    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleException(final IllegalArgumentException exp) {
        return exp.getMessage();
    }

    //    @ExceptionHandler(MethodArgumentNotValidException.class)
    //    @ResponseStatus(HttpStatus.BAD_REQUEST)
    //    public String handleException(final MethodArgumentNotValidException exp) {
    //        return "Validasyon patladı : " + exp.getMessage();
    //    }
    //
    //    @ExceptionHandler(ConstraintViolationException.class)
    //    @ResponseStatus(HttpStatus.BAD_REQUEST)
    //    public String handleException(final ConstraintViolationException exp) {
    //        return " JPA Validasyon patladı : " + exp.getMessage();
    //    }
    //
    //
    //    @ExceptionHandler(Exception.class)
    //    @ResponseStatus(HttpStatus.BAD_REQUEST)
    //    public String handleException(final Exception exp) {
    //        return exp.getMessage();
    //    }

}

