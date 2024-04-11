package com.example.restapi.controller;

import com.example.restapi.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class ResponseApiController {

    //http://localhost:8080/api/v1
    @GetMapping("") //default
    public ResponseEntity<UserInfo> user(){
        var user = new UserInfo();
        user.setUserName("USERNAME");
        user.setUserTel(1032489);
        user.setUserEmail("@gmail.com");
        log.info("user: {}", user);

        var response = ResponseEntity //status 코드, body 를 넣어줄 수 있다.
                .status(HttpStatus.ACCEPTED) //http status지정한다.
                .header("x-custom" , "high")
                .body(user); // user 지정
        return response;
    }
}
/*
객체 리턴
 @GetMapping("/api/v1")
    public UserInfo user(){
        var user = new UserInfo();
        user.setUserName("USERNAME");
        user.setUserTel(1032489);
        user.setUserEmail("@gmail.com");
        log.info("user: {}", user);
        return user;
    }

String return
@GetMapping("") //default address
    public String user(){
        var user = new UserInfo();
        user.setUserName("nameuser");
        user.setUserEmail("@gmail.com");
        user.setUserTel(0234543);

        log.info("user: {}", user);
        return user.toString();
    }
 */