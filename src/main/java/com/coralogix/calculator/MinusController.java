package com.coralogix.calculator;

import com.coralogix.calculator.model.Result;
import com.coralogix.calculator.services.AddService;
import com.coralogix.calculator.services.MinusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("minus")
public class MinusController {

    @Autowired
    private MinusService minusService;

    @GetMapping
    public Result add(@RequestParam int a, @RequestParam int b) {
        return minusService.minus(a, b);
    }
}
