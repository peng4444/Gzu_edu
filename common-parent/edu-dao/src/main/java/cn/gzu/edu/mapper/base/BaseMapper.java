package cn.gzu.edu.mapper.base;

import cn.gzu.edu.model.User;

public interface BaseMapper<T> {

    public T findById(Integer id);

    public T findById(String uuid);

    public T deleteById(Integer id);

    public T deleteById(String uuid);

    public void update(User user);

    public void insert(User user);
}
