package com.service.impl;

import com.service.ILoginService;
import com.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private BaseDao baseDao;

    @Override
    public void login() {

    }

    @Override
    public void getUser() {
        baseDao.getUser();
    }
}
