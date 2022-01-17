package cn.make.test;

import cn.make.dao.AdminDao;
import cn.make.dao.impl.AdminDaoImpl;
import cn.make.domain.Admin;
import org.junit.Test;

public class AdminDaoTest {

    /**
     * 测试登录方法
     */
    @Test
    public void test01(){
        Admin admin = new Admin();
        admin.setUsername("admin");
        admin.setPassword("123123");
        AdminDao adminDao = new AdminDaoImpl();
        Admin login = adminDao.login(admin);
        System.out.println(login);
    }
}
