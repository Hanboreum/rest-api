package com.example.restapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //restapi 방식 지원
@RequestMapping("/api") //어떤 주소를 맵핑할건지
public class PostApiController {

    @PostMapping("/post") //post의 요청에 대한 요청을 받음
    public void post(

    ){

    }
}
