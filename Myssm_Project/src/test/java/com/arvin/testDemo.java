package com.arvin;


import com.arvin.mapper.UserMapper;
import javafx.application.Application;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.io.InputStream;

public class testDemo {

    @Test
    public void testDataSources() throws Exception{
       ApplicationContext ac = new ClassPathXmlApplicationContext(
                "main\\resources\\spring\\applicationContext-dao.xml");
        DataSource dataSource = (DataSource) ac.getBean("datasource");
        System.out.println(dataSource.getConnection());
    }

}
