package com.mimile.domain;

import java.util.Calendar;

public class GoodsCollection extends AbstractBean {
	
	private Integer id;
	private Calendar execTime;
	private Integer accountId;
	private Integer goodsId;
	
	public GoodsCollection() {
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
	
	public Integer getGoodsId() {
		return goodsId;
	}
	
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	
	@Override
	public String toString() {
		return "GoodsCollection [id=" + id + ", execTime=" + execTime.getTime() + ", accountId=" + accountId + ", goodsId="
				+ goodsId + "]";
	}
	
}
