package com.example.restapi.controller;

import com.example.restapi.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class ResponseApiController {

    //http://localhost:8080/api/v1
    @GetMapping("") //default address
    public String user(){
        var user = new UserInfo();
        user.setUserName("nameuser");
        user.setUserEmail("@gmail.com");
        user.setUserTel(0234543);

        log.info("user: {}", user);
        return user.toString();
    }
}
