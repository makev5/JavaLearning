package cn.make.service.impl;

import cn.make.dao.AdminDao;
import cn.make.dao.impl.AdminDaoImpl;
import cn.make.domain.Admin;
import cn.make.service.AdminService;

public class AdminServiceImpl implements AdminService {
    private AdminDao dao = new AdminDaoImpl();

    @Override
    public Admin login(Admin admin) {
        return dao.login(admin);
    }
}
