package com.example.restapi.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.convert.Property;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
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