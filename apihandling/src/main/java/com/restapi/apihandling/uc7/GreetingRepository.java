package com.restapi.apihandling.uc8;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepository {

    private final JdbcTemplate jdbcTemplate;

    public GreetingRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveMessage(String message) {
        String sql = "INSERT INTO greetings (message) VALUES (?)";
        return jdbcTemplate.update(sql, message);
    }


    // ✅ New Method: Update (Edit) Message
    public int updateMessage(int id, String newMessage) {
        String sql = "UPDATE greetings SET message = ? WHERE id = ?";
        return jdbcTemplate.update(sql, newMessage, id);
    }
}
