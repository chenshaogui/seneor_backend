package com.sensor.dev.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.sensor.dev.pojo.Person;

@Repository
public class PersonDAO extends HibernateTemplate{
	
	 @Resource(name="sessionFactory")
	    public void setSessionFactory(SessionFactory sessionFactory) {
	        super.setSessionFactory(sessionFactory);
	    };

}
