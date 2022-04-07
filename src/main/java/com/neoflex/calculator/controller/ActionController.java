package com.neoflex.calculator.controller;

import com.neoflex.calculator.dto.ResultDto;
import com.neoflex.calculator.exception.ArgumentIsNullException;
import com.neoflex.calculator.service.ActionService;
import io.swagger.v3.oas.annotations.*;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/actions")
public class ActionController {

    private final ActionService actionService;

    @GetMapping("/summary")
    @Operation(description = "Суммирование 2-х чисел")
    @Parameters(value = {@Parameter(name = "1-е число", example = "2.0"), @Parameter(name = "2-е число", example = "1")})
    public ResponseEntity<ResultDto> getSumOfTwoValues(@Parameter(name = "1-е число", description = "Переменная") @RequestParam(required = false) Double val1, @Parameter(name = "2-е число", description = "Перменная") @RequestParam(required = false) Double val2){
        if(val1 == null || val2 == null)
            throw new ArgumentIsNullException("Arguments are not passed on");
        
        return new ResponseEntity<>(actionService.getSumOfTwoValues(val1, val2), HttpStatus.OK);
    }

    @Operation(description = "Разность 2-х чисел")
    @GetMapping("/subtract")
    public ResponseEntity<ResultDto> getDifferenceOfTwoValues(@Parameter(name = "1-е число", description = "Переменная") @RequestParam(required = false) Double val1, @Parameter(name = "2-е число", description = "Перменная") @RequestParam(required = false) Double val2){
        if(val1 == null || val2 == null)
            throw new ArgumentIsNullException("Arguments are not passed on");

        return new ResponseEntity<>(actionService.getDifferenceOfTwoValues(val1, val2), HttpStatus.OK);
    }

    @GetMapping("/multiply")
    @Operation(description = "Умножение 2-х чисел")
    @Parameters(value = {@Parameter(name = "1-е число", example = "2.0"), @Parameter(name = "2-е число", example = "1")})
    public ResponseEntity<ResultDto> getMultipleOfTwoValues(@Parameter(name = "1-е число", description = "Переменная") @RequestParam(required = false) Double val1, @Parameter(name = "2-е число", description = "Перменная") @RequestParam(required = false) Double val2){
        if(val1 == null || val2 == null)
            throw new ArgumentIsNullException("Arguments are not passed on");

        return new ResponseEntity<>(actionService.getMultipleOfTwoValues(val1, val2), HttpStatus.OK);
    }

    @GetMapping("/division")
    @Operation(description = "Деление 2-х чисел")
    public ResponseEntity<ResultDto> getDividingOfTwoValues(@Parameter(name = "1-е число", description = "Числитель") @RequestParam(required = false) Double val1, @Parameter(name = "2-е число", description = "Знаменатель") @RequestParam(required = false) Double val2){
        if(val1 == null || val2 == null)
            throw new ArgumentIsNullException("Arguments are not passed on");

        return new ResponseEntity<>(actionService.getDividingOfTwoValues(val1, val2), HttpStatus.OK);
    }
}
