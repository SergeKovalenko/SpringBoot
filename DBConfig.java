package Springboot;

import org.h2.jdbcx.JdbcDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DBConfig {
    @Bean
    public DataSource dataSource(){
        JdbcDataSource ds= new JdbcDataSource();
        ds.setURL("jdbc:h2:C:\\Work\\r");
        try {
            ds.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS DEPARTMENT(ID INT PRIMARY KEY, NAME VARCHAR(255));").execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }
}
