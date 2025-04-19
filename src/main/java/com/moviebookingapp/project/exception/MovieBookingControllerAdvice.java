package com.moviebookingapp.project.exception;

import com.moviebookingapp.project.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MovieBookingControllerAdvice{

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponse> handleError(CustomException exception){
        return new ResponseEntity<>(ErrorResponse.builder()
                .message(exception.getMessage())
                .success(false)
                .build(), HttpStatus.BAD_REQUEST);
    }
}
