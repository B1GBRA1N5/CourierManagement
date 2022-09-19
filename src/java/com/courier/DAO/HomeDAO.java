package com.courier.DAO;

import com.courier.Model.Courier;
import com.courier.Model.Employee;
import com.courier.Model.Review;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.andromeda.commons.dao.BaseDAO;

@Repository
public class HomeDAO extends BaseDAO
{          
	public Boolean sendReview(Review review)
	{
		Map<String, Object> map = new HashMap<String, Object>(); 
		map.put("p", review);
		sqlSessionTemplate.insert("Home.sendReview", map);
		return true;
	}
	
	public Courier search(String cid)
	{
		Courier resp=sqlSessionTemplate.selectOne("Home.search", cid);
		return resp;
	}
	
	public List<Courier>getCouriers()
	{ 
		List<Courier> resp=sqlSessionTemplate.selectList("Home.getCouriers");
		return resp; 
	}
	
	public List<Employee>getManagers()
	{ 
		List<Employee> resp=sqlSessionTemplate.selectList("Home.getManagers");
		return resp;
	}
	
	public List<Courier>getAssignedCouriers(String cboy)
	{ 
		List<Courier> resp=sqlSessionTemplate.selectList("Home.getAssignedCouriers",cboy);
		return resp;
	}
	
	public List<Review> getReviews()
	{
		List<Review> reviews = sqlSessionTemplate.selectList("Home.getReviews");
		return reviews;
	}
}   