package com.restapi.apihandling.uc3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AbilityForGreetingApp {

    // Using first or last name
    @GetMapping("/{first}/{last}")
    public String greetFirstAndLast(@PathVariable("first") String first, @PathVariable("last") String last) {
        return "Hello " + first + " " + last + " there!!";
    }

    // Using RequestParam for optional first or last name
    @GetMapping("/set")
    public String greet(@RequestParam(required = false) String first,
                        @RequestParam(required = false) String last) {
        if (first != null) {
            return "Hello Mr. " + first;
        } else if (last != null) {
            return "Hello Mr. " + last;
        } else {
            return "Hello Guest!";
        }
    }
}
