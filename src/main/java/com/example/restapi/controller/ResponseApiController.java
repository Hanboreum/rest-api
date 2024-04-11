package com.example.restapi.controller;

import com.example.restapi.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController //응답값이 Json으로 내려가겠다는 선언. api 를 만들때는 restcontroller 사용
//@Controller // html으로 응답값을 내려주겠다
@RequestMapping("/api/v1")
public class ResponseApiController {

    //http://localhost:8080/api/v1
    @GetMapping("")
    public UserInfo user(){
        var user = new UserInfo();
        user.setUserName("kimleepark");
        user.setUserEmail("@gamil.com");
        user.setUserTel(98735);

        log.info("user: {}", user);
        return user;
    }

    @GetMapping("/v2")
    public ResponseEntity<UserInfo> user1(){
        var user = new UserInfo();
        user.setUserName("kimleepark");
        user.setUserEmail("@gamil.com");
        user.setUserTel(98735);

        log.info("user: {}", user);

        var response = ResponseEntity.status(HttpStatus.CREATED)
                .header("custom", "high")
                .body(user);

        return response;

    }
}
//메소드 자체에서는 객체 리턴을 주로 사용.
//response entity는? 해당 로직 처리 중 예외 발생 시, 응답 코드를 내릴 때 사용한다.
/*
객체 리턴
 @GetMapping("") //default, RequestMapping 보다는 GetMapping 을 쓰자
    @ResponseBody //controller annotation 일 때 응답이 json으로 내려가게 된다.
    //@RequestMapping(path = "", method = RequestMethod.GET) //메소드에도 주소를 지정 할 수 있다.
    //Path, method 를 통해 어떤 request 메소드를 매칭하겠다 라고 선언 가능
    //메서드 미선언시 , post put get 모두 동작. 하지만 선언하는게 좋음
    public UserInfo user(){
        var user = new UserInfo();
        user.setUserName("USERNAME");
        user.setUserTel(1032489);
        user.setUserEmail("@gmail.com");
        log.info("user: {}", user);

        var response = ResponseEntity //status 코드, body 를 넣어줄 수 있다.
                .status(HttpStatus.ACCEPTED) //http status지정한다.
                .header("x-custom" , "high")
                .body(user); // user 지정
        return user;
    }

특별 형대 코드 리턴
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