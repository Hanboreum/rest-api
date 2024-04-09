package com.example.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class userInfo {
    private String name;
    private int tel;
    private String email;

}

/*
{
"name" : "hanboreum",
"tel" : 010111222
"email" : "email@email"
}

 */