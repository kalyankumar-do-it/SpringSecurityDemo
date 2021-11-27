package com.techjs.springsecurity.config;

import java.beans.PropertyVetoException;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan("com.techjs.springsecurity")
@EnableWebMvc
public class MyConfig 
{

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/view/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    
    @Bean
    public DataSource dataSource() 
    {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try 
        {
            dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/spring_test?useSSL=false");
            dataSource.setUser("root");
            dataSource.setPassword("12345678");
        } 
        catch (PropertyVetoException e) 
        {
            e.printStackTrace();
        }
        return dataSource;
    }
}
