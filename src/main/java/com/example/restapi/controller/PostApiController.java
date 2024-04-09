package com.example.restapi.controller;

import com.example.restapi.model.BookRequest;
import org.springframework.web.bind.annotation.*;

@RestController //restapi 방식 지원
@RequestMapping("/api") //어떤 주소를 맵핑할건지
public class PostApiController {
    @PostMapping("/post")
    public String post( @RequestBody BookRequest bookRequest){
        System.out.println(bookRequest);
        return bookRequest.toString(); //문자열로 반환
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