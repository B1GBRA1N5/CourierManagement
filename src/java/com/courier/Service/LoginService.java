package com.courier.Service;

import com.courier.Model.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.andromeda.commons.model.Response;
import com.courier.DAO.LoginDAO;
import com.andromeda.commons.util.AadhaarUtils;
import com.andromeda.commons.util.CryptoUtils;

@Service
public class LoginService
{
	@Autowired    
	private LoginDAO loginDAO;
	Response response = new Response();

	public Response login(Login login)
	{
		response.setSuccessful(false);  
		login.setPassword(CryptoUtils.getMD5Hash(login.getPassword()));
		Integer loginStatus = loginDAO.checkUser(login);

		if (loginStatus == 0)
		{
			response.setSuccessful(false);    
		}
		else if (loginStatus == 1)
		{
			Login details = loginDAO.getUserDetails(login);
			response.setSuccessful(true);
			response.setResponseObject(details);
		}
		return response;
	}
	

	
}