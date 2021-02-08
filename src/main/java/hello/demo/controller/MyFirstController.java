package hello.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller


public class MyFirstController {

    @GetMapping("/")
    @ResponseBody
    public String index (){
        return "index"; // dette navn skal være det samme som vores html fil
    }
}
