package com.got.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserDetails")
public class User {

	
	private String userEmailId;
	private String passWord;
	private Date createTime;
	private Date updateTime;
	
	
	@Id
	@Column(name="EMAIL_ID",nullable=false)
	public String getUserEmailId() {
		return userEmailId;
	}
	
	@Column(name="USER_PASSWORD",nullable=false)
	public String getPassWord() {
		return passWord;
	}
	
	@Column(name="USER_CREATE_TIME",nullable=false)
	public Date getCreateTime() {
		return createTime;
	}
	
	@Column(name="USER_UPDATE_TIME",nullable=false)
	public Date getUpdateTime() {
		return updateTime;
	}
	
	
	

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	
	
	
}
