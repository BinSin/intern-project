package com.humuson.intern.service;

import com.humuson.intern.dao.UserDAO;
import com.humuson.intern.model.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDao;
/*

    public List<Offer> getCurrent() {
        return userDao.getUsers();
    }
*/

}
