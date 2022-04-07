package com.neoflex.calculator.service;

import com.neoflex.calculator.dto.ResultDto;

public interface ActionService {

    ResultDto getSumOfTwoValues(double val1, double val2);

    ResultDto getDifferenceOfTwoValues(double val1, double val2);

    ResultDto getMultipleOfTwoValues(double val1, double val2);

    ResultDto getDividingOfTwoValues(double val1, double val2);
}
