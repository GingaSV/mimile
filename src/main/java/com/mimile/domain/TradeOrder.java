package com.mimile.domain;

import java.util.Calendar;

public class TradeOrder extends AbstractBean {
	
	private Integer id;
	private Calendar execTime;
	private Integer status;
	private String shopName;
	private String address;
	private Integer accountId;
	private Integer shopId;
	
	public TradeOrder() {
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
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getShopName() {
		return shopName;
	}
	
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
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
		return "TradeOrder [id=" + id + ", execTime=" + execTime.getTime() + ", status=" + status + ", shopName=" + shopName
				+ ", address=" + address + ", accountId=" + accountId + ", shopId=" + shopId + "]";
	}
	
}
