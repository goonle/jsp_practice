package jdbc;

import java.sql.DriverManager;
import java.util.Properties;

import javax.servlet.ServeltException;
import javax.servlet.http.HttpSevlet;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.apache.commons.dbcp2.ConnectionFactory;
import org.apache.commons.dbcp2.DriverManagerConnectionFactory;
import org.apache.commons.dbcp2.PoolableConnection;
import org.apache.commons.dbcp2.PoolableConnectionFactory;
import org.apache.commons.dbcp2.PoolingDriver;
import org.apache.commons.pool2.ObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

public class DBCPInit extends HttpServlet {

    @Override
    public void init() throws ServletException {
        loadJDBCDriver();
        initConnectionPool();
    }

    private void loadJDBCDriver(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException ex){
            throw new RuntimeException("fail to load JDBC Driver", ex);
        }
    }
    //initConnectionPool
    public void initConnecitonPool(){
        try{
            String jdbcUrl = 
                "jdbc:mysql://localhost:3306/chapter?useUnicode=true&characterEncoding=utf8";
            String username = "test";
            String pw = "testpw";
            //create connection 
            ConnectionFactory connFac = new DriverManagerConnectionFactory(jdbcUrl, username, pw);
            PoolableConnectionFactory poolableConnFac = new PoolableConnectionFactory(connFac, null);

            poolableConnFac.setValidationQuery("select 1");
            //setting connection pool
            GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
            poolConfig.setTimeBetweenEvictionRunsMillis(1000L * 60L * 5L); //5 minutes
            poolConfig.setTestWhileIdle(true);
            poolConfig.setMinIdle(4);   //guess maximum 20minites wait
            poolConfig.setMaxTotal(50); //guess maximun 50 connections

            GenericObjectPool<PoolableConnection> connectionPool = new GenericObjectPool<>(poolableConnFac, poolConfig);
            poolableConnFac.setPool(connectionPool);

            Class.forName("org.apache.commons.dbcp2.PoolingDriver");
            PoolingDriver driver = (PoolingDriver) DriverManager.getDriver("jdbc:apache:commons:dbcp:");
            driver.registerPool("chap14", connectionPool);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
