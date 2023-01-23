package spring.io.task.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.io.task.task2.entity.Credit;

public interface CreditRepository extends JpaRepository<Credit, Long> {
}
