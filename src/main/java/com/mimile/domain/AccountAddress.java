package com.mimile.domain;

public class AccountAddress extends AbstractBean {
	
	private Integer id;
	private Integer accountId;
	private Integer addressId;
	
	public AccountAddress() {
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
	
	public Integer getAddressId() {
		return addressId;
	}
	
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	
	@Override
	public String toString() {
		return "AccountAddress [id=" + id + ", accountId=" + accountId + ", addressId=" + addressId + "]";
	}
	
}
