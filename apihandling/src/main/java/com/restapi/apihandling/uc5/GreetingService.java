package com.restapi.apihandling.uc5;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final GreetingRepo greetingRepo;


    public GreetingService(GreetingRepo greetingRepo) {
        this.greetingRepo = greetingRepo;
    }

    public String saveMessage(String message){
        int ans=greetingRepo.saveMessage(message);
        return ans>0? "Message saved successfully":"Failed to save message";
    }
    public String showMessage(int id){
        return greetingRepo.show(id);
    }

}
