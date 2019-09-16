package com.ming;


import com.ming.mapper.UserMapper;
import com.ming.po.User;
import com.ming.service.UserService;
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

public class MyssmTest {

    @Autowired
    private UserMapper userMapper;


    private SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void testInitialtive(){
        String file = "sqlMapConfig.xml";
        InputStream is = null;
        try{
            is = Resources.getResourceAsStream(file);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Test
    public void testQueryById() throws Exception{
        int id = 10;
        User user = (User) userMapper.queryUserById(id);
        System.out.println(user);
    }

    @Test
    public void testDataSources() throws Exception{
        ApplicationContext ac = new ClassPathXmlApplicationContext(
                "classpath:applicationContext-mapper.xml");
        DataSource dataSource = (DataSource) ac.getBean("datasource");
        System.out.println(dataSource.getConnection());
    }
}
