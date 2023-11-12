package com.personal.myApplications.exception;

public class ApplicationNotFoundError extends Exception{
    public ApplicationNotFoundError(String msg){
        super(msg);
    }
}
