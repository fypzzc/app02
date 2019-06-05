package com.briup.apps.app02.dao;


import com.briup.apps.app02.bean.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();
    User selectByPrimaryKey(long id);

    void insert(User user);
    void update(User user);
    void deleteByPrimaryKey(long id);

}
