package com.neoflex.calculator.exception;

public class ArgumentIsNullException extends RuntimeException{
    
    public ArgumentIsNullException() {
        super();
    }

    public ArgumentIsNullException(String message) {
        super(message);
    }

    public ArgumentIsNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArgumentIsNullException(Throwable cause) {
        super(cause);
    }

    protected ArgumentIsNullException(String message, Throwable cause,
                                      boolean enableSuppression,
                                      boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
