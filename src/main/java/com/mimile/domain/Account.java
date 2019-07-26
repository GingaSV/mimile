package com.mimile.domain;

import java.util.Calendar;

public class Account extends AbstractBean {
	
	private int id;
	private Calendar execTime;
	private String phone;
	private String mail;
	private String password;
	private String alias;
	private String portraitImagePath;
	private double remainingSum;
	
	public Account() {
		super();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public java.sql.Date getExecTime() {
		return getDate(execTime);
	}
	
	public void setExecTime(java.util.Date execTime) {
		this.execTime = getCalendar(execTime);
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAlias() {
		return alias;
	}
	
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	public String getPortraitImagePath() {
		return portraitImagePath;
	}
	
	public void setPortraitImagePath(String portraitImagePath) {
		this.portraitImagePath = portraitImagePath;
	}
	
	public double getRemainingSum() {
		return remainingSum;
	}
	
	public void setRemainingSum(double remainingSum) {
		this.remainingSum = remainingSum;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", execTime=" + execTime.getTime() + ", phone=" + phone + ", mail=" + mail + ", password="
				+ password + ", alias=" + alias + ", portraitImagePath=" + portraitImagePath + ", remainingSum="
				+ remainingSum + "]";
	}
	
}
