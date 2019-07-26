package com.mimile.domain;

public class GoodsImage extends AbstractBean {
	
	private Integer id;
	private String imagePath;
	private Integer goodsId;
	
	public GoodsImage() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getImagePath() {
		return imagePath;
	}
	
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public Integer getGoodsId() {
		return goodsId;
	}
	
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	
	@Override
	public String toString() {
		return "GoodsImage [id=" + id + ", imagePath=" + imagePath + ", goodsId=" + goodsId + "]";
	}
	
}
