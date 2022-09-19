package com.courier.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController; 
import com.andromeda.commons.model.Response;
import com.courier.Model.Review;
import com.courier.Service.HomeService;                


@RestController
@RequestMapping("/home")
public class HomeController
{    
	@Autowired    
	private HomeService homeService;

	@ResponseBody
	@RequestMapping(value = "/sendReview", method = { RequestMethod.POST, RequestMethod.GET })
	public Response sendReview(@RequestBody Review review)
	{
		return homeService.sendReview(review);
	}
	
	@ResponseBody
	@RequestMapping(value = "/search", method = { RequestMethod.POST, RequestMethod.GET })
	public Response search(@RequestBody String cid)
	{
		return homeService.search(cid);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getAssignedCouriers", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAssignedCouriers(@RequestBody String cboy)
	{
		return homeService.getAssignedCouriers(cboy);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getCouriers", method = {RequestMethod.GET })
	public Response getCouriers()
	{
		return homeService.getCouriers();
	}
	
	@ResponseBody
	@RequestMapping(value = "/getManagers", method = {RequestMethod.GET })
	public Response getManagers()
	{
		return homeService.getManagers();
	}
	
	@ResponseBody
	@RequestMapping(value = "/getReviews", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getReviews()
	{
		return homeService.getReviews();
	}        

}