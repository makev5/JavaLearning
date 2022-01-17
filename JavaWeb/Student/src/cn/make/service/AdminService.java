package cn.make.service;

import cn.make.domain.Admin;

/**
 * Admin的业务接口
 */
public interface AdminService {
    /**
     * 登录方法
     * @param admin
     * @return
     */
    Admin login(Admin admin);
}
