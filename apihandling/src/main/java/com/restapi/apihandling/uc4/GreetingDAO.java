package com.restapi.apihandling.uc4;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GreetingDAO {

    private final JdbcTemplate jdbcTemplate;

    public GreetingDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Save greeting message
    public int saveGreeting(String message) {
        String sql = "INSERT INTO greetings (message) VALUES (?)";
        return jdbcTemplate.update(sql, message);
    }

    // Get all greetings
    public List<String> getAllGreetings() {
        String sql = "SELECT message FROM greetings";
        return jdbcTemplate.queryForList(sql, String.class);
    }
}
