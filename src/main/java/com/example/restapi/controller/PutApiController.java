package com.example.restapi.controller;

import com.example.restapi.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j //로그백? 관련
@RestController
@RequestMapping("/api")
public class PutApiController {

    //http://localhost:8080/api/put
    @PutMapping(path = "/put")
    public void put(@RequestBody UserInfo userInfo){
        log.info("Request : {}", userInfo); //request 는 메세지. 중괄호 내용은 뒤에 있는 객체가 맵핑. toString 호춯
    }


}
