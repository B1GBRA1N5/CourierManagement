package com.courier.Model; 

import com.andromeda.commons.model.BaseModel;

public class Courier extends BaseModel
{

	private static final long serialVersionUID = 1L;
	public String cid;
	public String sender;
	public String receiver;
	public String status;
	public String cboy;
	public String phone;
	public String address;
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCboy() {
		return cboy;
	}
	public void setCboy(String cboy) {
		this.cboy = cboy;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}