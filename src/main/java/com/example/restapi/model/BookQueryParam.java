package com.example.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //롬복 사용할 때 쓰는 어노테이션
@AllArgsConstructor //전체 파라미터를 가진 생성자 추가
@NoArgsConstructor //기본 생성자
public class BookQueryParam {
    private String category;
    private String issuedYear;
    private String issuedMonth;
    private String issuedDay;
}
