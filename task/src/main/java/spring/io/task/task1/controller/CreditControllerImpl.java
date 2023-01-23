package spring.io.task.task1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import spring.io.task.task2.payload.CreditDTO;
import spring.io.task.task2.service.CreditService;

@RestController
@RequiredArgsConstructor
public class CreditControllerImpl implements CreditController {
    private final CreditService creditService;

    @Override
    public String calculate(CreditDTO calculateDTO) {
        return creditService.calculate(calculateDTO);
    }
}
