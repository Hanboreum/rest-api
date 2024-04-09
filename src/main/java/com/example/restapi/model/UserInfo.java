package com.example.restapi.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)//해당 클래스는 스네이크 케이스를 받겠다.
public class UserInfo {
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