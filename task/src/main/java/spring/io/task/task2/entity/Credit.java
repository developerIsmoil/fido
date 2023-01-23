package spring.io.task.task2.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import spring.io.task.task1.entity.template.AbsLongEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Setter
@Getter
@ToString
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Entity(name = "credit")
@Where(clause = " deleted = false")
@SQLDelete(sql = " update " + "credit" + " set deleted = true where id = ?")
public class Credit extends AbsLongEntity {
    @Column(name = "asosiy_qarz")
    private double principalDebt;
    @Column(name = "oylik_asosiy_qarz")
    private double principalMonthly;
    @Column(name = "oylik_foiz")
    private double percentageMonthly;
    @Column(name = "oylik_tolov")
    private double monthlyPayment;
}
