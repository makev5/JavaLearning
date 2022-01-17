package cn.make.service.impl;

import cn.make.dao.UserDao;
import cn.make.dao.impl.UserDaoImpl;
import cn.make.domain.PageBean;
import cn.make.domain.User;
import cn.make.service.UserService;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public void addUser(User user) {
        dao.addUser(user);
    }

    @Override
    public void delUser(String id) {
        dao.delUser(id);
    }

    @Override
    public User getUserById(String id) {
        return dao.getUserById(id);
    }

    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    @Override
    public void delSelectedUser(String[] ids) {
        for (String id : ids) {
            dao.delUser(id);
        }
    }

    @Override
    public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition) {
        //当前页
        int currentPage = Integer.parseInt(_currentPage);
        //每页记录数
        int rows = Integer.parseInt(_rows);

        //创建PageBean对象
        PageBean<User> pageBean = new PageBean<User>();
        pageBean.setCurrentPage(currentPage);
        pageBean.setRows(rows);

        //调用dao查询总记录数
        int totalCount = dao.findTotalCount(condition);
        pageBean.setTotalCount(totalCount);

        //调用dao查询list集合
        // 计算开始记录索引，
        int start = (currentPage - 1) * rows;
        List<User> list = dao.findByPage(start, rows, condition);
        pageBean.setList(list);

        //计算总页码
        int totalPage = (totalCount % rows == 0) ? totalCount / rows : (totalCount / rows) + 1;
        pageBean.setTotalPage(totalPage);
        return pageBean;
    }

}
