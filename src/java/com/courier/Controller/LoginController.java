package com.courier.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;


import com.courier.Model.Login;
import com.courier.Service.LoginService;                

@RestController
@RequestMapping("/login")
public class LoginController
{    
	@Autowired    
	private LoginService loginService;

	@ResponseBody
	@RequestMapping(value = "/login", method = { RequestMethod.POST, RequestMethod.GET })
	public Response login(@RequestBody Login login)
	{
		return loginService.login(login);
	}        

}