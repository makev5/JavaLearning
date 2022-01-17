package cn.make.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
    private static DataSource ds;

    static {
        Properties prop = new Properties();
        try {
            prop.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(prop);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接池对象
     * */
    public static DataSource getDataSource(){
        return ds;
    }

    /**
     * 获取连接Connection对象
     * */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
