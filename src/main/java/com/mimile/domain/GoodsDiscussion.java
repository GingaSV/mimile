package com.mimile.domain;

import java.util.Calendar;

public class GoodsDiscussion extends AbstractBean {
	
	private Integer id;
	private Calendar execTime;
	private String content;
	private Integer goodsId;
	private Integer senderAccountId;
	private Integer receiverAccountId;
	
	public GoodsDiscussion() {
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
	
	public Integer getSenderAccountId() {
		return senderAccountId;
	}
	
	public void setSenderAccountId(Integer senderAccountId) {
		this.senderAccountId = senderAccountId;
	}
	
	public Integer getReceiverAccountId() {
		return receiverAccountId;
	}
	
	public void setReceiverAccountId(Integer receiverAccountId) {
		this.receiverAccountId = receiverAccountId;
	}
	
	@Override
	public String toString() {
		return "GoodsDiscussion [id=" + id + ", execTime=" + execTime.getTime() + ", content=" + content + ", goodsId=" + goodsId
				+ ", senderAccountId=" + senderAccountId + ", receiverAccountId=" + receiverAccountId + "]";
	}
	
}
