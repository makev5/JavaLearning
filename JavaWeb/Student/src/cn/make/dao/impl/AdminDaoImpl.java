package cn.make.dao.impl;

import cn.make.dao.AdminDao;
import cn.make.domain.Admin;
import cn.make.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class AdminDaoImpl implements AdminDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 登录方法
     * @param loginAdmin 只有用户名和密码
     * @return Admin包含用户全部数据
     */
    @Override
    public Admin login(Admin loginAdmin) {
        try {
            String sql = "select * from admin where username = ? and password = ?";
            Admin admin = template.queryForObject(sql, new BeanPropertyRowMapper<Admin>(Admin.class), loginAdmin.getUsername(), loginAdmin.getPassword());
            return admin;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
