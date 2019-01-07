package com.greenfox.frontend.services;

import com.greenfox.frontend.models.Result;
import com.greenfox.frontend.models.Until;
import com.greenfox.frontend.models.What;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.IntStream;

@Service
public class ResultService {

    public Result getSum(Until until){
        int result = 0;
        for (int i = 1; i <= until.getUntil(); i++) {
            result += i;
        }
        return new Result<>(result);
    }

    public Result getFactor(Until until){
        int result = 1;
        for (int i = 1; i <= until.getUntil() ; i++) {
            result *= i;
        }
        return new Result<>(result);
    }

    public Result getArraySum(What what){
        return new Result<>(Arrays.stream(what.getNumbers()).sum());
    }

    public Result getArrayMultiplication(What what){
        return new Result<>(IntStream.of(what.getNumbers()).reduce(1,Math::multiplyExact));
    }

    public Result getArrayElementsDoubled(What what){
        return new Result<>(Arrays.stream(what.getNumbers()).map(i -> i * 2));
    }
}
