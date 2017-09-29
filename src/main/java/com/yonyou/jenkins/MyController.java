package com.yonyou.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/queryOrder")
    public String queryOrder(){
        return "ok";
    }
}
