package com.mimile.domain;

import java.util.Calendar;

public class ShopCollection extends AbstractBean {
	
	private Integer id;
	private Calendar execTime;
	private Integer accountId;
	private Integer shopId;
	
	public ShopCollection() {
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
	
	public Integer getAccountId() {
		return accountId;
	}
	
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	
	public Integer getShopId() {
		return shopId;
	}
	
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	
	@Override
	public String toString() {
		return "ShopCollection [id=" + id + ", execTime=" + execTime.getTime() + ", accountId=" + accountId + ", shopId=" + shopId
				+ "]";
	}
	
}
