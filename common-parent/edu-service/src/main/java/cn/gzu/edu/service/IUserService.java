package cn.gzu.edu.service;

import cn.gzu.edu.model.User;
import cn.gzu.edu.service.base.IBaseService;

public interface IUserService extends IBaseService<User> {

    //特有的方法
    public User login(String username, String password);
}
