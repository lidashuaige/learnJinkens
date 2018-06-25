package com.lixiangyang.learnjinkens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class LearnjinkensApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnjinkensApplication.class, args);
    }


@GetMapping("/hello")
@ResponseBody
public String helloWordController(){
        System.out.println("hello");
        return  "helloword";
}
}
