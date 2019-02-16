package com.dao;

import org.springframework.stereotype.Repository;

@Repository("baseDao")
public class BaseDaoImpl implements BaseDao{

    @Override
    public void getUser() {
        System.out.println("Dao");
    }
}
