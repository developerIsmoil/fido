package spring.io.task.task2.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditDTO {
    @NotBlank
    private double principalDebt;
    @NotBlank
    private double percentage;
    @NotBlank
    private int months;
}
