package cn.make.dao;

import cn.make.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 用户操作的Dao
 */
public interface UserDao {

    public List<User> findAll();

    public void addUser(User user);

    public void delUser(String id);

    public User getUserById(String id);

    public void updateUser(User user);

    public int findTotalCount(Map<String, String[]> condition);

    List<User> findByPage(int start, int rows, Map<String, String[]> condition);
}
