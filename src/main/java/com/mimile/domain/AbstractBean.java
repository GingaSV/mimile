package com.mimile.domain;

import java.io.Serializable;

import java.util.Calendar;

public abstract class AbstractBean implements Serializable {
	
	public AbstractBean() {
		super();
	}
	
	public Calendar getCalendar(java.util.Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}

	public java.sql.Date getDate(Calendar calendar) {
		return new java.sql.Date(calendar.getTime().getTime());
	}
	
	@Override
	public abstract String toString();
	
}
