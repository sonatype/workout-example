package com.sonatype.workout.db;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.sonatype.example.workout.api.UserService;
import com.sonatype.workout.model.User;

public class UserServiceDBImpl implements UserService {

	private HibernateTemplate hibernateTemplate;

	public UserServiceDBImpl() {
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	public User load(Integer id) {
		return (User) hibernateTemplate.load( User.class, id );
	}

}
