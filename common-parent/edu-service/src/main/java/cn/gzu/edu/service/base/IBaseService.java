package cn.gzu.edu.service.base;

import cn.gzu.edu.model.User;

public interface IBaseService<T> {

    public T findById(Integer id);

    public T findById(String uuid);

    public T deleteById(Integer id);

    public T deleteById(String uuid);

    public void update(User user);

    public void insert(User user);
}
