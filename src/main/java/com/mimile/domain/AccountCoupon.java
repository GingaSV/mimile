package com.mimile.domain;

public class AccountCoupon extends AbstractBean {
	
	private Integer id;
	private Boolean available;
	private Float priceSum;
	private Float worth;
	private Integer shopId;
	private Integer accountId;
	private Integer couponId;
	
	public AccountCoupon() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Boolean isAvailable() {
		return available;
	}
	
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
	public Float getPriceSum() {
		return priceSum;
	}
	
	public void setPriceSum(Float priceSum) {
		this.priceSum = priceSum;
	}
	
	public Float getWorth() {
		return worth;
	}
	
	public void setWorth(Float worth) {
		this.worth = worth;
	}
	
	public Integer getShopId() {
		return shopId;
	}
	
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	
	public Integer getAccountId() {
		return accountId;
	}
	
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	
	public Integer getCouponId() {
		return couponId;
	}
	
	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}
	
	@Override
	public String toString() {
		return "AccountCoupon [id=" + id + ", available=" + available + ", priceSum=" + priceSum + ", worth=" + worth
				+ ", shopId=" + shopId + ", accountId=" + accountId + ", couponId=" + couponId + "]";
	}
	
}
