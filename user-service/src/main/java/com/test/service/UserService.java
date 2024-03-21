package com.test.service;

import com.test.entity.User;

public interface UserService {
    User getUserById(int uid);
    public int getRemain(int uid);
    public boolean setRemain(int uid, int count);
}
