package com.restapi.apihandling.uc8;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GreetingDelete {

    // template creation
    private final JdbcTemplate jdbcTemplate;


    public GreetingDelete(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public int saveMessage(String message){
        String sql="INSERT INTO greetings (message) VALUES (?)";
        return jdbcTemplate.update(sql,message);
    }
    // for message deletion
    public int deleteMessage(int id){
        String sql="DELETE FROM greetings WHERE id=?";
        return jdbcTemplate.update(sql,id);
    }



}
