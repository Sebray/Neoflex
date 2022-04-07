package com.neoflex.calculator.serviceimpl;
import com.neoflex.calculator.dto.ResultDto;
import com.neoflex.calculator.exception.DivisionByZeroException;
import com.neoflex.calculator.service.ActionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ActionServiceImpl implements ActionService {

    @Override
    public ResultDto getSumOfTwoValues(double val1, double val2) {
        return new ResultDto(val1 + val2);
    }

    @Override
    public ResultDto getDifferenceOfTwoValues(double val1, double val2) {
        return new ResultDto(val1 - val2);
    }

    @Override
    public ResultDto getMultipleOfTwoValues(double val1, double val2) {
        return new ResultDto(val1 * val2);
    }

    @Override
    public ResultDto getDividingOfTwoValues(double val1, double val2) {
        if(val2 == 0)
            throw new DivisionByZeroException("The denominator is zero");

        return new ResultDto(val1 / val2);
    }
}
