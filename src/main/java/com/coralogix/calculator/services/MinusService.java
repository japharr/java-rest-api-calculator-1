package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;
import org.springframework.stereotype.Service;

@Service
public class MinusService {
    public Result minus(int a, int b) {
        int sum = a - b;
        return new Result(sum);
    }
}
