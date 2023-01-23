package spring.io.task.task1.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.io.task.task2.payload.CreditDTO;

import javax.validation.Valid;

@RequestMapping(CreditController.CREDIT_CONTROLLER)
public interface CreditController {
    String CREDIT_CONTROLLER = "/api";

    @PostMapping("/calculate")
    String calculate(@Valid @RequestBody CreditDTO calculateDTO);
}
