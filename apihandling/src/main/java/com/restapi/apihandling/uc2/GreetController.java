package com.restapi.apihandling.uc2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/api"}, method = RequestMethod.GET)
public class GreetController {

    private final GreetHelloWorldUsingServiceLayer greet;

    public GreetController(GreetHelloWorldUsingServiceLayer greet) {
        this.greet = greet;
    }
    @GetMapping("/service")
    public String service(){
        return greet.service();
    }
}
