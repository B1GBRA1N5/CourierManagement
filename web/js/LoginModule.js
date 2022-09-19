var LoginModule = angular.module('LoginModule', [])
LoginModule.controller('LoginController', [ '$http', '$scope', function($http, $scope) {
		var self = this;        
		$scope.login = function(user) {
			$("#errorDiv").show();
			console.log(user);    
	        $http.post('/courier/login/login',user).then(function(response) {
	        
				$scope.data = response.data;         
				if($scope.data.successful) {        
					console.log(response.data);
					Andromeda.setSessionValue("empid", $scope.data.responseObject.empid.replace(/\s+/g, ''));
					Andromeda.setSessionValue("email", $scope.data.responseObject.email);
					Andromeda.setSessionValue("password", $scope.data.responseObject.password);
					Andromeda.setSessionValue("roleid", $scope.data.responseObject.roleid);
					  		if ((Andromeda.getSessionValue("roleid") == 1)) {
					  			Andromeda.showAdminHomePage();
				    		}         
					  		       
					  		else if ((Andromeda.getSessionValue("roleid") == 2)) {
					  			Andromeda.showManagerHomePage();
				    		}         
		 		    		
				    		else if (Andromeda.getSessionValue("roleid") == 3)  {   
				    			Andromeda.showCourierBoyHomePage();
				    		}      
					  		
				    		else {
				    			Andromeda.showHomePage(); 
				         		}               
				} else {    
					var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
				   jQuery("#errorDiv").html(message);
					$("#errorDiv").show();
					$("#errorDiv").html("<b style='margin-left: 28%;font-size: medium;color:blue;z-index:100'>Note: Invalid login credentials</b>");
				//	console.log('Error while validating user');
				} 
			},function(errResponse) {
				console.error('Error while fetching notes');
			});
	    };    
	   
	 
} ]);