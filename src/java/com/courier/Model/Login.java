package com.courier.Model; 

import com.andromeda.commons.model.BaseModel;

public class Login extends BaseModel
{
	 
	private static final long serialVersionUID = 1L;
	private String password; 
	private String ipaddress;    
	private String logtime;        
	private Integer roleid;
	public String empid;
	public String email;
	public boolean loggedin;
	

	public boolean isLoggedin() {
		return loggedin;
	}
	public void setLoggedin(boolean loggedin) {
		this.loggedin = loggedin;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}  

	public String getLogtime() {
		return logtime;
	}

	public void setLogtime(String logtime) {
		this.logtime = logtime;
	}

		public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	
	public String getPassword()
	{   
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}   

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public Object getLogout_time() {
		// TODO Auto-generated method stub
		return null;
	}	
}