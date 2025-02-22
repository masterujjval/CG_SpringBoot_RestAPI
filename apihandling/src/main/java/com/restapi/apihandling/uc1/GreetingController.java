package com.restapi.apihandling.uc1;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @RequestMapping(value={"","/","/home"})
    public String home(){
        return "Hello from bridgelabz!!!";
    }

    // with request mapping using get method
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String query(@RequestParam(value = "name") String name){
        return "Hello "+name;

    }
    // now we post some data for that we use post mapping as header required json data and postmapping
    // transfer data in json
    @PostMapping("/post")
    public String post(@RequestBody String name){
        return "Hello "+name+" from Post request handler!";
    }
    // now use put mapping to generate put request

    @PutMapping("/put/{first}")
    public String put(@RequestParam(value = "lastname")String lastname, @PathVariable String first){
        return "Hello "+first+" "+lastname;
    }

}
