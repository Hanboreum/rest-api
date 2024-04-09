package com.example.restapi.controller;

import com.example.restapi.model.BookQueryParam;
import org.springframework.web.bind.annotation.*;

@RestController //RestApi를 처리하는 컨트롤러
@RequestMapping("/api") //api로 시작하는 주소를 받겠다.
public class RestApiController {

    @GetMapping(path = "/hello")
    public String hello(){
        //"http://localhost:8080/api/hello"
        var html = "<html> <body> <h1>Hello spring boot </h1> </body> </html>";
        return html;
    }

    //http://localhost:8080/api/echo/{message}/age/{age}/is-man/{isMan} 양식
    //http://localhost:8080/api/echo/hello/age/24/is-man/false
    @GetMapping(path ="/echo/{message}/age/{age}/is-man/{isMan}") //Path variable 있다면 중괄호가 들어감
    public String echo(@PathVariable(name = "message") String msg,//주소에는 대문자를 넣지 않아서 _ 사용
                       @PathVariable int age, //PathVariable: 경로에서 값을 추출할 때 사용.
                       @PathVariable boolean isMan){
        System.out.println("echo message" + msg);
        System.out.println("age" + age);
        System.out.println("or not" +isMan);
        System.out.println();
        return msg.toUpperCase(); // 대문자로 변환해 리턴
        //String 타입 변수 외 다른 타입 받기, boolean, integer
        //int : null 불가. 기본 값이 0
        //Integer : null 할당 가능
        //이 경우엔, int 가 어울린다.
    }

    // http://localhost:8080/api/book?category=IT&issuedYear=2023&issued-month=01&issued_day=31
    //category 부터 파싱. category 는 String 이겠죠
    @GetMapping(path = "/book")
    public void queryParam( @RequestParam String category, // RequestParam: 쿼리 매개변수에서 값을 추출할 때 사용.
                            @RequestParam String issuedYear,
                            @RequestParam (name = "issued-month")String issuedMonth, //카멜 케이스 맞춰주려고
                            @RequestParam (name ="issued_day")String issuedDay){

        System.out.println(category );
        System.out.println(issuedYear);
        System.out.println(issuedMonth);
        System.out.println(issuedDay);
    }
//http://localhost:8080/api/book2?category=IT&issuedYear=2023&issuedMonth=01&issuedDay=31
    @GetMapping(path ="/book2")
    public void queryParamDto( BookQueryParam bookQueryParam){
        System.out.println(bookQueryParam);
    }

}

/*
//TODO int 형태의 param 2가지를 받아서 두 수의 합, 곱셈 해주는 주소 설계.
    // TODO String, boolean

    // http://localhost:8080/plus/mul
    @GetMapping( path = "/plus/mul")
    public void num(@PathVariable int plus , @PathVariable int mul){
        int n =2;
        int m =3;
        System.out.println(plus + n+m);
        System.out.println(mul + n*m);
    }
     //http://localhost:8080/api/book3?category=IT&issuedYear=2023&issuedMonth=01&issuedDay=31
    @GetMapping (path = "/book3")
    public String query23( @RequestParam String category, @RequestParam String issuedYear, @RequestParam String issuedMonth , @RequestParam String issuedDay ){
        return "Category: " + category + ", Issued Year: " + issuedYear + ", Issued Month: " + issuedMonth + ", Issued Day: " + issuedDay;
        //리턴시 화면에 나타남.
    }

    http://localhost:8080/api/book4?category=IT&issuedYear=2023&issuedMonth=01&issuedDay=31
@GetMapping(path = "/book4")
    public void query4 ( BookQueryParam bookQueryParam){
        System.out.println(bookQueryParam);
    }
----20240408
 @GetMapping(path = "/level/{level}")
    public int level(@PathVariable int level){
        System.out.println("level" +level);
        return level;
    }
 */