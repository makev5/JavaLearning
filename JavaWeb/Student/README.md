## 案例：用户信息列表展示

1. 需求：用户信息的增删改查操作

2. 设计：
  1. 技术选型：Servlet+JSP+MySQL+JDBCTempleat+Duird+BeanUtilS+tomcat

  2. 数据库设计：

    ```sql
    create database db1; -- 创建数据库
    use db1; 			   -- 使用数据库
    create table user(   -- 创建user表
    	id int primary key auto_increment,
    	name varchar(20) not null,
    	gender varchar(5),
    	age int,
    	address varchar(32),
    	qq	varchar(20),
    	email varchar(50)
    );
    
    CREATE TABLE admin(		-- 创建admin表
    	id INT PRIMARY KEY AUTO_INCREMENT,
    	username VARCHAR(20) UNIQUE NOT NULL,
    	PASSWORD VARCHAR(20) NOT NULL 
    );
    ```

  3. 开发：
     	1. 环境搭建
         1. 创建数据库环境
         2. 创建项目，导入需要的jar包
     	2. 编码

  4. 测试
  5. 部署运维

