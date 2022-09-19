var Andromeda = {

	showPage : function(path, targetDiv) {
		var jqxhr = jQuery.post(path, function(data) {
			jQuery("#" + targetDiv).html(data);
		});
	},
	
	showLoginPage : function() {  
		var path = "/courier/html/Login.html";
		Andromeda.showPage(path, "main");   
	},
	showHomePage : function() {  
		var path = "/courier/html/Home.html";
		Andromeda.showPage(path, "mainDiv");   
	},
	showManagerHomePage : function() {  
		var path = "/courier/html/ManagerHome.html";     
		Andromeda.showPage(path, "mainDiv");
	},  
	showAdminHomePage : function() {  
		var path = "/courier/html/AdminHome.html";   
		Andromeda.showPage(path, "mainDiv");
	},
	      
	showCourierBoyHomePage : function() {        
		var path = "/courier/html/CourierBoyHome.html";     
		Andromeda.showPage(path, "mainDiv");
	},
	showContactPage : function() {  
		var path = "/courier/html/Contact.html";   
		Andromeda.showPage(path, "main"); 
	},
	showAssignedCouriers : function() {  
		var path = "/courier/html/AssignedCouriers.html";   
		Andromeda.showPage(path, "main"); 
	},
	
	showCouriers : function() {  
		var path = "/courier/html/Couriers.html";   
		Andromeda.showPage(path, "main"); 
	},
	
	showCourierStatus : function() {  
		Andromeda.setSessionValue("cid",document.getElementById("query").value);
		var path = "/courier/html/CourierStatus.html";   
		Andromeda.showPage(path, "main"); 
	},
	
	showComplaints : function() {  
		var path = "/courier/html/Complaints.html";   
		Andromeda.showPage(path, "main"); 
	}, 
	showManagers : function() {  
		var path = "/courier/html/Managers.html";     
		Andromeda.showPage(path, "main");
	},  
		                   
	setSessionValue : function(key, value) {
		sessionStorage.setItem(key, value);
	},

	getSessionValue : function(key) {
		return sessionStorage.getItem(key);
	},

	removeSessionValue : function(key) {
		sessionStorage.removeItem(key);    
	},

	showError : function(errorMessage) {
		var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"
				+ errorMessage + "</div>";
		jQuery("#errorDiv").html(message);
	},                       
                                                         
	logout : function() {
		
		var empid = Andromeda.getSessionValue("empid") || "";
		Andromeda.setSessionValue("email", null);
		Andromeda.setSessionValue("password", null);
		Andromeda.setSessionValue("roleid", null);
		Andromeda.setSessionValue("empid", null);
		Andromeda.showHomePage();
	},

	post : function(url, data) {
		var responseData = null;
         
		jQuery.ajax({
			url : url,
			type : 'post',
			data : JSON.stringify(data), // Stringified Json Object
			dataType : 'json',
			async : false, // Cross-domain requests and dataType: "jsonp"
			// requests do not support synchronous operation
			cache : false, // This will force requested pages not to be cached
			// by the browser
			processData : false, // To avoid making query String instead of
			// JSON
			contentType : "application/json; charset=utf-8",
			success : function(data) {
				responseData = data;
			}
		});

		return responseData;
	},

	isUserLoggedIn : function() {
		
		var email = Andromeda.getSessionValue("email") || "";
		var password = Andromeda.getSessionValue("password") || "";
		var roleid = Andromeda.getSessionValue("roleid") || "";
		var empid = Andromeda.getSessionValue("empid") || "";
		if(email != null && password!=null && empid != null)
			return true;
		else 
			return false;
	}  	
};
