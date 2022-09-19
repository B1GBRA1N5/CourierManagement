package com.courier.Service;

import com.courier.Model.Review;
import com.courier.Model.Courier;
import com.courier.Model.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.andromeda.commons.model.Response;
import com.courier.DAO.HomeDAO;

@Service
public class HomeService
{
	@Autowired    
	private HomeDAO homeDAO;
	Response response = new Response();

	public Response sendReview(Review review)
	{
		Boolean resp = homeDAO.sendReview(review);
		response.setSuccessful(resp);
		response.setResponseObject(resp);
		return response;
	}
	
	public Response search(String cid)
	{
		Courier resp = homeDAO.search(cid);
		response.setSuccessful(true);
		response.setResponseObject(resp);
		return response;
	}
	
	public Response getCouriers()
	{
		List<Courier> resp = homeDAO.getCouriers();
		response.setSuccessful(true);
		response.setResponseObject(resp);
		return response;
	}
	
	public Response getManagers()
	{
		List<Employee> resp = homeDAO.getManagers();
		response.setSuccessful(true);
		response.setResponseObject(resp);
		return response;
	}
	
	public Response getAssignedCouriers(String cboy)
	{
		List<Courier> resp = homeDAO.getAssignedCouriers(cboy);
		response.setSuccessful(true);
		response.setResponseObject(resp);
		return response;
	}
	
	public Response getReviews()
	{
		List<Review> resp = homeDAO.getReviews();
		response.setSuccessful(true);
		response.setResponseObject(resp);
		return response;
	}
	

	
}