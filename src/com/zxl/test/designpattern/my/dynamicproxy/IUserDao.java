package com.zxl.test.designpattern.my.dynamicproxy;

public class IUserDao implements UserDao{
    @Override
    public void save() {
        System.out.println("save data");
    }
}
