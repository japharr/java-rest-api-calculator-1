package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinusServiceTest {
    @Test
    void subtractInteger() {
        MinusService minusService = new MinusService();

        Result result = minusService.minus(5, 2);

        assertEquals(result.getResult(), 3);
    }
}
