package com.mimile.domain;

public class TradeGoods extends AbstractBean {
	
	private Integer id;
	private Integer num;
	private String goodsName;
	private Float goodsPrice;
	private Integer goodsId;
	private Integer tradeOrderId;
	
	public TradeGoods() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getNum() {
		return num;
	}
	
	public void setNum(Integer num) {
		this.num = num;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public Float getGoodsPrice() {
		return goodsPrice;
	}
	
	public void setGoodsPrice(Float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	
	public Integer getGoodsId() {
		return goodsId;
	}
	
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	
	public Integer getTradeOrderId() {
		return tradeOrderId;
	}
	
	public void setTradeOrderId(Integer tradeOrderId) {
		this.tradeOrderId = tradeOrderId;
	}
	
	@Override
	public String toString() {
		return "TradeGoods [id=" + id + ", num=" + num + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice
				+ ", goodsId=" + goodsId + ", tradeOrderId=" + tradeOrderId + "]";
	}
	
}
