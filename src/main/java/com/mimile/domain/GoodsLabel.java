package com.mimile.domain;

public class GoodsLabel extends AbstractBean {
	
	private Integer id;
	private Integer goodsId;
	private Integer goodsTypeId;
	
	public GoodsLabel() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getGoodsId() {
		return goodsId;
	}
	
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	
	public Integer getGoodsTypeId() {
		return goodsTypeId;
	}
	
	public void setGoodsTypeId(Integer goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}
	
	@Override
	public String toString() {
		return "GoodsType [id=" + id + ", goodsId=" + goodsId + ", goodsTypeId=" + goodsTypeId + "]";
	}
	
}
