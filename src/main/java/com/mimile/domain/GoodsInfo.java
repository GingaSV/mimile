package com.mimile.domain;

public class GoodsInfo extends AbstractBean {
	
	private Integer id;
	private Boolean imageFlag;
	private String textInfo;
	private Boolean tailFlag;
	private Integer goodsId;
	
	public GoodsInfo() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Boolean isImageFlag() {
		return imageFlag;
	}
	
	public void setImageFlag(Boolean imageFlag) {
		this.imageFlag = imageFlag;
	}
	
	public String getTextInfo() {
		return textInfo;
	}
	
	public void setTextInfo(String textInfo) {
		this.textInfo = textInfo;
	}
	
	public Boolean isTailFlag() {
		return tailFlag;
	}
	
	public void setTailFlag(Boolean tailFlag) {
		this.tailFlag = tailFlag;
	}
	
	public Integer getGoodsId() {
		return goodsId;
	}
	
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	
	@Override
	public String toString() {
		return "GoodsInfo [id=" + id + ", imageFlag=" + imageFlag + ", textInfo=" + textInfo + ", tailFlag=" + tailFlag
				+ ", goodsId=" + goodsId + "]";
	}
	
}
