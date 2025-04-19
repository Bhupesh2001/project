package com.moviebookingapp.project.exception;

public class CustomException extends RuntimeException{
    public CustomException(String errorMessage){
        super(errorMessage);
    }
}
