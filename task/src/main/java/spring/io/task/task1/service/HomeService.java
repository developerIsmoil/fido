package spring.io.task.task1.service;

import org.springframework.http.HttpEntity;
import spring.io.task.task1.payload.LoginDTO;

public interface HomeService {
    HttpEntity<?> login(LoginDTO loginDTO);
}
