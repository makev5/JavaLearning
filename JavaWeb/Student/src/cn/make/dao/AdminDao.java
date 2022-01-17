package cn.make.dao;


import cn.make.domain.Admin;

/**
 * 操作admin
 */
public interface AdminDao {

    /**
     * 登录方法
     * */
    public Admin login(Admin loginAdmin);

}
