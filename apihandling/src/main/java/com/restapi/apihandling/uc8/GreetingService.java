package com.restapi.apihandling.uc8;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final GreetingDelete greetingDelete;


    public GreetingService(GreetingDelete greetingDelete) {
        this.greetingDelete = greetingDelete;
    }
    // to save message
    public String saveMessage(String message){
        int ans= greetingDelete.saveMessage(message);
        return ans>0?"message saved!": "failed to save message";
    }
    public String deleteMessage(int id){
        int ans= greetingDelete.deleteMessage(id);
        return ans>0?"Deleted record successfully!" : "Failed to delete record!";
    }
}
