package spring.io.task.task1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RestController;
import spring.io.task.task1.payload.LoginDTO;
import spring.io.task.task1.service.HomeService;

@RestController
@RequiredArgsConstructor
public class HomeControllerImpl implements HomeController {
    private final HomeService homeService;

    @Override
    public HttpEntity<?> login(LoginDTO loginDTO) {
        return homeService.login(loginDTO);
    }
}
