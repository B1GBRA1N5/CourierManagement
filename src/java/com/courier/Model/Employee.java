package com.courier.Model; 

import com.andromeda.commons.model.BaseModel;

public class Employee extends BaseModel
{
	private static final long serialVersionUID = 1L;
	public String name;
	public String email;
	public String empid;
	public String branch;
	public String phone;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}