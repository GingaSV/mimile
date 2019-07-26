package com.mimile.domain;

public class GoodsType extends AbstractBean {
	
	private Integer id;
	private String typeName;
	
	public GoodsType() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTypeName() {
		return typeName;
	}
	
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	@Override
	public String toString() {
		return "GoodsType [id=" + id + ", typeName=" + typeName + "]";
	}
	
}
