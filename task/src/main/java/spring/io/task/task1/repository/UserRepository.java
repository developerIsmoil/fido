package spring.io.task.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.io.task.task1.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByIdAndLoginAndPassword(Long id, String login, String password);
}
