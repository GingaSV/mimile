package com.mimile.domain;

import java.util.Calendar;

public class Goods extends AbstractBean {
	
	private Integer id;
	private Calendar execTime;
	private Float price;
	private Float discount;
	private String name;
	private String detail;
	private Integer remainingCount;
	private Integer saleCount;
	private Integer saleMonthCount;
	private Integer shopId;
	
	public Goods() {
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
	
	public Float getPrice() {
		return price;
	}
	
	public void setPrice(Float price) {
		this.price = price;
	}
	
	public Float getDiscount() {
		return discount;
	}
	
	public void setDiscount(Float discount) {
		this.discount = discount;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public Integer getRemainingCount() {
		return remainingCount;
	}
	
	public void setRemainingCount(Integer remainingCount) {
		this.remainingCount = remainingCount;
	}
	
	public Integer getSaleCount() {
		return saleCount;
	}
	
	public void setSaleCount(Integer saleCount) {
		this.saleCount = saleCount;
	}
	
	public Integer getSaleMonthCount() {
		return saleMonthCount;
	}
	
	public void setSaleMonthCount(Integer saleMonthCount) {
		this.saleMonthCount = saleMonthCount;
	}
	
	public Integer getShopId() {
		return shopId;
	}
	
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	
	@Override
	public String toString() {
		return "Goods [id=" + id + ", execTime=" + execTime.getTime() + ", price=" + price + ", discount=" + discount + ", name="
				+ name + ", detail=" + detail + ", remainingCount=" + remainingCount + ", saleCount=" + saleCount
				+ ", saleMonthCount=" + saleMonthCount + ", shopId=" + shopId + "]";
	}
	
}
