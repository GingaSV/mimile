package com.mimile.domain;

public class MessageTradeOrder extends AbstractBean {
	
	private Integer id;
	private Integer accountId;
	private Integer tradeOrderId;
	private Boolean unread;
	
	public MessageTradeOrder() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getAccountId() {
		return accountId;
	}
	
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
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
		return "MessageTradeOrder [id=" + id + ", accountId=" + accountId + ", tradeOrderId=" + tradeOrderId
				+ ", unread=" + unread + "]";
	}
	
}
