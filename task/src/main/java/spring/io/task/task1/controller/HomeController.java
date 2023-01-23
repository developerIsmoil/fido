package spring.io.task.task1.controller;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.io.task.task1.payload.LoginDTO;

@RequestMapping(HomeController.HOME_CONTROLLER)
public interface HomeController {

    String HOME_CONTROLLER = "/api";

    @PostMapping("/login")
    HttpEntity<?> login(@RequestBody LoginDTO loginDTO);
}
