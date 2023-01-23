package spring.io.task.task1.component;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.io.task.task1.entity.User;
import spring.io.task.task1.repository.UserRepository;

import java.util.Objects;

@RequiredArgsConstructor
@Component
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;

    @Value("${spring.sql.init.mode}")
    private String initMode;

    @Value("${spring.profiles.active}")
    String profile;

    @Override
    public void run(String... args) throws Exception {
        if (Objects.equals(profile, "prod") && Objects.equals(initMode, "always")) {
            System.exit(-1);
        }

        if (Objects.equals(initMode, "always")) {
            userRepository.save(new User("login", "password", false));
        }
        System.err.printf("Sql Init mode is '%s'\n", initMode);
    }
}
