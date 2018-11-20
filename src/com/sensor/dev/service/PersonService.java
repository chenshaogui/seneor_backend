package com.sensor.dev.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sensor.dev.dao.PersonDAO;
import com.sensor.dev.pojo.Person;
import com.sensor.dev.util.Page;

@Service
public class PersonService {
	 
	@Autowired
	private PersonDAO personDAO;
	
	public List list() {
        DetachedCriteria dc = DetachedCriteria.forClass(Person.class);
        dc.addOrder(Order.desc("id"));
        return personDAO.findByCriteria(dc);
    }
}
