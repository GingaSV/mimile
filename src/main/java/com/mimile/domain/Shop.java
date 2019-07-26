package com.mimile.domain;

import java.util.Calendar;

public class Shop extends AbstractBean {
	
	private Integer id;
	private Calendar execTime;
	private Boolean inBusiness;
	private String name;
	private Integer addressId;
	private Integer accountId;
	
	public Shop() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public java.sql.Date getExecTime() {
		return getDate(execTime);
	}
	
	public void setExecTime(java.util.Date execTime) {
		this.execTime = getCalendar(execTime);
	}
	
	public Boolean isInBusiness() {
		return inBusiness;
	}
	
	public void setInBusiness(Boolean inBusiness) {
		this.inBusiness = inBusiness;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAddressId() {
		return addressId;
	}
	
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	
	public Integer getAccountId() {
		return accountId;
	}
	
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	
	@Override
	public String toString() {
		return "Shop [id=" + id + ", execTime=" + execTime.getTime() + ", inBusiness=" + inBusiness + ", name=" + name
				+ ", addressId=" + addressId + ", accountId=" + accountId + "]";
	}
	
}
