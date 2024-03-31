package webapps.chapter20.jdbc;

import java.io.IOException;
import java.io.StringReader;
import java.sql.DriverManager;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.tomcat.dbcp.dbcp2.ConnectionFactory;
import org.apache.tomcat.dbcp.dbcp2.DriverManagerConnectionFactory;
import org.apache.tomcat.dbcp.dbcp2.PoolableConnection;
import org.apache.tomcat.dbcp.dbcp2.PoolableConnectionFactory;
import org.apache.tomcat.dbcp.dbcp2.PoolingDriver;
import org.apache.tomcat.dbcp.pool2.impl.GenericObjectPool;
import org.apache.tomcat.dbcp.pool2.impl.GenericObjectPoolConfig;

public class DBCPInitListener implements ServletContextListener {
    
    @Override
    public void contextInitialized(ServletContextEvent sce){
        String poolConfig = sce.getServletContext().getInitParameter("poolConfig");
        Properties prop = new Properties();

        try {
            prop.load(new StringReader(poolConfig));
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        loadJDBCDriver(prop);
        initConnectionPool(prop);
    }

    //web.xml 에 있는 driver 정보로 클래스 불러오기
    private void loadJDBCDriver(Properties prop){
        String driverClass = prop.getProperty("jdbcdriver");
        try{
            Class.forName(driverClass);
        }catch(ClassNotFoundException e){
            throw new RuntimeException("fail to load JDBC Driver", e);
        }
    }

    private void initConnectionPool(Properties prop){
        try{
            String jdbcUrl = prop.getProperty("jdbcUrl");
            String username = prop.getProperty("dbUser");
            String pw = prop.getProperty("dbPass");

            ConnectionFactory connFactory = new DriverManagerConnectionFactory(jdbcUrl, username, pw);
            PoolableConnectionFactory poolableConnectionFactory = new PoolableConnectionFactory(connFactory, null);
            poolableConnectionFactory.setValidationQuery("select 1");

            GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
            poolConfig.setTimeBetweenEvictionRunsMillis(1000L*60L*5L);
            poolConfig.setTestWhileIdle(true);
            poolConfig.setMinIdle(4);
            poolConfig.setMaxTotal(50);

            GenericObjectPool<PoolableConnection> connectionPool = new GenericObjectPool<>(poolableConnectionFactory, poolConfig);
            poolableConnectionFactory.setPool(connectionPool);

            Class.forName("org.apache.commons.dbcp2.PoolingDriver");
            PoolingDriver driver = (PoolingDriver) DriverManager.getDriver("jdbc:apache:commons:dbcp:");
            String poolName = prop.getProperty("poolName");
            driver.registerPool(poolName, connectionPool);


        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce){

    }
}
