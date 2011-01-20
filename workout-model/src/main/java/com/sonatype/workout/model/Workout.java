package com.sonatype.workout.model;

import java.util.Date;

public class Workout {

	private User user;
	private Date date;
	
	public Workout() {}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
