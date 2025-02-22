package com.restapi.apihandling.uc5;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/* CREATE TABLE greetings (
        id INT AUTO_INCREMENT PRIMARY KEY,
        message VARCHAR(255) NOT NULL
);
*/


@Repository
public class GreetingRepo {

    private final JdbcTemplate jdbcTemplate;


    public GreetingRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
        //saving message creating new database as this will be good for practise
        public int saveMessage(String message){
        // now to insert in table we have to create initial on h2 on runtime
            String sql = "INSERT INTO greetings (message) VALUES (?)";
            return jdbcTemplate.update(sql,message);
        }

        // show msg by id only
    public String show(int id){

        String sql="SELECT message FROM greetings WHERE id =?";
        //       for getting single value      to pass id in id clause, String.class to return object in string
        return jdbcTemplate.queryForObject(sql,new Object[]{id}, String.class);
    }


}
