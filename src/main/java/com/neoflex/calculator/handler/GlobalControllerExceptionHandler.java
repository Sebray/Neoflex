package com.neoflex.calculator.handler;

import com.neoflex.calculator.dto.ErrorDto;
import com.neoflex.calculator.exception.ArgumentIsNullException;
import com.neoflex.calculator.exception.DivisionByZeroException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(DivisionByZeroException.class)
    public @ResponseBody
    ResponseEntity<ErrorDto> handleDivisionByZeroException(Exception e) {
        Calendar timestamp = Calendar.getInstance();
        return new ResponseEntity<>(
                new ErrorDto(e.getMessage(), timestamp.getTime()),
                HttpStatus.UNPROCESSABLE_ENTITY
        );
    }

    @ExceptionHandler(ArgumentIsNullException.class)
    public @ResponseBody
    ResponseEntity<ErrorDto> handleArgumentIsNullException(Exception e) {
        Calendar timestamp = Calendar.getInstance();
        return new ResponseEntity<>(
                new ErrorDto(e.getMessage(), timestamp.getTime()),
                HttpStatus.BAD_REQUEST
        );
    }

}
