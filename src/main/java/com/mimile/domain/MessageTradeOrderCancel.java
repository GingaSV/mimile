package com.mimile.domain;

public class MessageTradeOrderCancel extends AbstractBean {
	
	private Integer id;
	private String detail;
	private Integer tradeOrderId;
	private Boolean unread;
	
	public MessageTradeOrderCancel() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public Integer getTradeOrderId() {
		return tradeOrderId;
	}
	
	public void setTradeOrderId(Integer tradeOrderId) {
		this.tradeOrderId = tradeOrderId;
	}
	
	public Boolean isUnread() {
		return unread;
	}
	
	public void setUnread(Boolean unread) {
		this.unread = unread;
	}
	
	@Override
	public String toString() {
		return "MessageTradeOrderCancel [id=" + id + ", detail=" + detail + ", tradeOrderId=" + tradeOrderId
				+ ", unread=" + unread + "]";
	}
	
}
