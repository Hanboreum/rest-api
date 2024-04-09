package com.example.restapi.controller;

import com.example.restapi.model.BookRequest;
import com.example.restapi.model.userInfo;
import org.springframework.web.bind.annotation.*;

@RestController //restapi 방식 지원
@RequestMapping("/api") //어떤 주소를 맵핑할건지
public class PostApiController {
    @PostMapping("/post")
    public String post( @RequestBody BookRequest bookRequest){
        System.out.println(bookRequest);
        return bookRequest.toString(); //문자열로 반환
    }

    //http://localhost:8080/api/post2
    @PostMapping("/post2")
    public String user(@RequestBody userInfo userInfo){
        System.out.println(userInfo);
        return userInfo.toString();
    }
}
/*
 //http://localhost:8080/api/post
    @PostMapping("/post") //post의 요청에 대한 요청을 받음
    public BookRequest post(@RequestBody BookRequest bookRequest){
        System.out.println(bookRequest);
        return bookRequest;
    }
 */