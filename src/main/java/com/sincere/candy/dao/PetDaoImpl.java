package com.sincere.candy.dao;

import com.sincere.candy.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class PetDaoImpl implements PetDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Pet> getAllPetsFromDB() {
        String sql = String.format("select * from pet");
        //RowMapper mapper = new PetMapper();
        List list = jdbcTemplate.queryForList(sql);
        System.out.println(list);
        return list;
    }

}
