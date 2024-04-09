package com.example.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class userInfo {
    private String name;
    private Integer tel; //제이슨 활용시 래퍼런스 타입 추천
    private String email;

}

/*
{
"name" : "hanboreum",
"tel" : 10111222,
"email" : "email@email"
}

 */