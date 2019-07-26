package com.mimile.domain;

public class Coupon extends AbstractBean {
	
	private Integer id;
	private Float priceSum;
	private Float worth;
	private Integer remainingCount;
	private Integer shopId;
	
	public Coupon() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
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
	
	public Integer getRemainingCount() {
		return remainingCount;
	}
	
	public void setRemainingCount(Integer remainingCount) {
		this.remainingCount = remainingCount;
	}
	
	public Integer getShopId() {
		return shopId;
	}
	
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	
	@Override
	public String toString() {
		return "Coupon [id=" + id + ", priceSum=" + priceSum + ", worth=" + worth + ", remainingCount=" + remainingCount
				+ ", shopId=" + shopId + "]";
	}
	
}
