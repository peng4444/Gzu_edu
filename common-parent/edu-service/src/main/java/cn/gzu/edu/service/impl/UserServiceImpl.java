package cn.gzu.edu.service.impl;

import cn.gzu.edu.model.User;
import cn.gzu.edu.service.IUserService;
import cn.gzu.edu.service.base.BaseServiceImpl;
import cn.gzu.edu.service.base.IBaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public User findById(String uuid) {
        return null;
    }

    @Override
    public User deleteById(Integer id) {
        return null;
    }

    @Override
    public User deleteById(String uuid) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void insert(User user) {

    }


}
