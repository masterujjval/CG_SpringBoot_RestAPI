package com.restapi.apihandling.uc4;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GreetingService {

    private final GreetingDAO greetingDAO;

    public GreetingService(GreetingDAO greetingDAO) {
        this.greetingDAO = greetingDAO;
    }

    public String saveGreeting(String message) {
        int rows = greetingDAO.saveGreeting(message);
        return rows > 0 ? "Message saved successfully!" : "Failed to save message!";
    }

    public List<String> getAllGreetings() {
        return greetingDAO.getAllGreetings();
    }
}
