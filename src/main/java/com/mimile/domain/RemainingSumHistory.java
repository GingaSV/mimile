package com.mimile.domain;

import java.util.Calendar;

public class RemainingSumHistory extends AbstractBean {
	
	private Integer id;
	private Calendar execTime;
	private Float changeSum;
	private Integer changeWay;
	private Integer accountId;
	
	public RemainingSumHistory() {
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
	
	public Float getChangeSum() {
		return changeSum;
	}
	
	public void setChangeSum(Float changeSum) {
		this.changeSum = changeSum;
	}
	
	public Integer getChangeWay() {
		return changeWay;
	}
	
	public void setChangeWay(Integer changeWay) {
		this.changeWay = changeWay;
	}
	
	public Integer getAccountId() {
		return accountId;
	}
	
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	
	@Override
	public String toString() {
		return "RemainingSumHistory [id=" + id + ", execTime=" + execTime.getTime() + ", changeSum=" + changeSum + ", changeWay="
				+ changeWay + ", accountId=" + accountId + "]";
	}
	
}
