package com.mimile.domain;

public class AccountRank extends AbstractBean {
	
	private Integer id;
	private Integer rankLevel;
	private Integer remainingDay;
	private Integer accountId;
	
	public AccountRank() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getRankLevel() {
		return rankLevel;
	}
	
	public void setRankLevel(Integer rankLevel) {
		this.rankLevel = rankLevel;
	}
	
	public Integer getRemainingDay() {
		return remainingDay;
	}
	
	public void setRemainingDay(Integer remainingDay) {
		this.remainingDay = remainingDay;
	}
	
	public Integer getAccountId() {
		return accountId;
	}
	
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	
	@Override
	public String toString() {
		return "AccountRank [id=" + id + ", rankLevel=" + rankLevel + ", remainingDay=" + remainingDay + ", accountId="
				+ accountId + "]";
	}
	
}
