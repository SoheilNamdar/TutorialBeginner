package com.tutorialbeginner.tutorialbeginner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void persist(){
        jdbcTemplate.update("INSERT INTO person (name,surname,address,tel) VALUES (?,?,?,?)",
            "Sepehr","NAMDAR FARD","Paris",629
        );
    }
}
