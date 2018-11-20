package com.sensor.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sensor.dev.dao.PersonDAO;
import com.sensor.dev.pojo.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {
	
    public void testDataSource() throws SQLException {
        ApplicationContext ctx = null;
        ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        System.out.println(ctx);
        DataSource dataSource =  (DataSource) ctx.getBean("MySqlDataSource");
        System.out.println(dataSource.getConnection().toString());   
        SessionFactory sessionFactory = (SessionFactory) ctx.getBean("sessionFactory");
        System.out.println(sessionFactory);       
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        /*User crm_user = new User(1,"jiji", "123456", "周哥2",10,"0777123","广州");
        session.save(crm_user);*/
        tx.commit();
        session.close();
    }
    public static void main(String[] args) {
    	try {
			new Test().testDataSource();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
