package cn.make.service;

import cn.make.domain.PageBean;
import cn.make.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 用户管理的业务接口
 */
public interface UserService {

    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll();

    /**
     * 添加用户
     * @param user
     */
    public void addUser(User user);

    /**
     * 根据id删除用户
     * @param id
     */
    public void delUser(String id);

    /**
     * 通过id查询User
     * @param id
     * @return
     */
    public User getUserById(String id);

    /**
     * 更新用户信息
     * @param user
     */
    public void updateUser(User user);

    /**
     * 删除选中User
     * @param ids
     */
    public void delSelectedUser(String[] ids);

    /**
     * 分页条件查询
     * @param currentPage
     * @param rows
     * @param condition
     * @return
     */
    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);


}
