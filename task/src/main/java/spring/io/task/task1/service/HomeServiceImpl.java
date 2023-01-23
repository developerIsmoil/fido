package spring.io.task.task1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import spring.io.task.task1.payload.LoginDTO;
import spring.io.task.task1.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class HomeServiceImpl implements HomeService {
    private final UserRepository userRepository;
    private Integer count = 0;

    @Override
    public HttpEntity<?> login(LoginDTO loginDTO) {

//        User user = userRepository.findByIdAndLoginAndPassword(1L, "login", "password");

        System.out.println(count);
        if (loginDTO.getLogin().equals("login") && loginDTO.getPassword().equals("password") && (count < 3)) {
            count = 0;
            return ResponseEntity.ok("Success");
        } else {
            ++count;
            if (count >= 3) {
//              boolean isAccountNonLocked();
                return ResponseEntity.ok("Block");
            }
            return ResponseEntity.ok("Don't success");
        }
    }
}
