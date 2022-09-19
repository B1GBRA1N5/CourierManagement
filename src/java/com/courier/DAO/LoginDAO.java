package com.courier.DAO;

import com.courier.Model.Login;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.andromeda.commons.dao.BaseDAO;

@Repository
public class LoginDAO extends BaseDAO
{    

	public Integer checkUser(Login login)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", login);
		Integer userStatus = sqlSessionTemplate.selectOne("Login.checkUser", map);
		return userStatus;
	}    
      
	public Login getUserDetails(Login login)
	{
		Map<String, Object> map = new HashMap<String, Object>(); 
		map.put("email", login.getEmail());
		map.put("password", login.getPassword());
   		    int roleid = sqlSessionTemplate.selectOne("Login.getRole", map);
		    Login details = sqlSessionTemplate.selectOne("Login.getUserDetails", map);
		    details.setRoleid(roleid);
			return details;
		}

	public Integer isUserLoggedIn(Login login)
	{
		Integer loginStatus = 0;
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", login);

	    loginStatus = sqlSessionTemplate.selectOne("Login.checkUser", map);
	   return loginStatus;
	}



}   