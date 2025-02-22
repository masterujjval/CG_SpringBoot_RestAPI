package com.restapi.apihandling.uc2;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// here creaing a service layer i.e class annon which handler business logic
@Service
public class GreetHelloWorldUsingServiceLayer {

    public String service(){
        return "Hello from service";
    }


}
