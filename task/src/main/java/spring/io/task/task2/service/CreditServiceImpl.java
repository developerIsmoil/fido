package spring.io.task.task2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.io.task.task2.entity.Credit;
import spring.io.task.task2.payload.CreditDTO;
import spring.io.task.task2.repository.CreditRepository;

import java.text.DecimalFormat;

@Service
@RequiredArgsConstructor
public class CreditServiceImpl implements CreditService {

    private final CreditRepository creditRepository;

    @Override
    public String calculate(CreditDTO creditDTO) {
        DecimalFormat dd = new DecimalFormat("#.##");

        try {
            double percentage = creditDTO.getPercentage() / 12 / 100;
            double principalDebt = (creditDTO.getPrincipalDebt());
            int months = creditDTO.getMonths();

            double monthlyPayment = Double.parseDouble(dd.format(
                    principalDebt *
                            (percentage +
                                    (percentage /
                                            ((Math.pow(percentage + 1, months))
                                                    - 1)))));
            for (int i = 0; i < months; i++) {
                Credit credit = new Credit();
                credit.setPrincipalDebt(principalDebt);
                credit.setMonthlyPayment(monthlyPayment);
                credit.setPercentageMonthly(Double.parseDouble(dd.format(principalDebt * percentage)));
                credit.setPrincipalMonthly(Double.parseDouble(dd.format(monthlyPayment - (principalDebt * percentage))));
                creditRepository.save(credit);
                principalDebt = Double.parseDouble(dd.format(principalDebt - (monthlyPayment - (principalDebt * percentage))));
            }
            return "Success";
        } catch (Exception e) {
            return null;
        }
    }
}
