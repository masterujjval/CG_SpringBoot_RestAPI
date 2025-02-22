package com.restapi.apihandling.uc7;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    // Save message
    public String saveMessage(String message) {
        int ans = greetingRepository.saveMessage(message);
        return ans > 0 ? "Message saved!" : "Failed to save message";
    }

    // Delete message
    public String deleteMessage(int id) {
        int ans = greetingRepository.deleteMessage(id);
        return ans > 0 ? "Deleted record successfully!" : "Record not found!";
    }

    // ✅ New Method: Edit (Update) Message
    public String editMessage(int id, String newMessage) {
        int ans = greetingRepository.updateMessage(id, newMessage);
        return ans > 0 ? "Message updated successfully!" : "Failed to update message!";
    }
}
