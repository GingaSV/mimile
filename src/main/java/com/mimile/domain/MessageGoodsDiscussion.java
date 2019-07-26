package com.mimile.domain;

public class MessageGoodsDiscussion extends AbstractBean {
	
	private Integer id;
	private Integer accountId;
	private Integer goodsDiscussionId;
	private Boolean unread;
	
	public MessageGoodsDiscussion() {
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
	
	public Integer getGoodsDiscussionId() {
		return goodsDiscussionId;
	}
	
	public void setGoodsDiscussionId(Integer goodsDiscussionId) {
		this.goodsDiscussionId = goodsDiscussionId;
	}
	
	public Boolean isUnread() {
		return unread;
	}
	
	public void setUnread(Boolean unread) {
		this.unread = unread;
	}
	
	@Override
	public String toString() {
		return "MessageGoodsDiscussion [id=" + id + ", accountId=" + accountId + ", goodsDiscussionId="
				+ goodsDiscussionId + ", unread=" + unread + "]";
	}
	
}
