package com.mimile.domain;

import java.util.Calendar;

public class GoodsRemark extends AbstractBean {
	
	private Integer id;
	private Calendar execTime;
	private String content;
	private Integer goodsId;
	private Integer accountId;
	
	public GoodsRemark() {
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
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Integer getGoodsId() {
		return goodsId;
	}
	
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	
	public Integer getAccountId() {
		return accountId;
	}
	
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	
	@Override
	public String toString() {
		return "GoodsRemark [id=" + id + ", execTime=" + execTime.getTime() + ", content=" + content + ", goodsId=" + goodsId
				+ ", accountId=" + accountId + "]";
	}
	
}
