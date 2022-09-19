var ac = angular.module('AssignedCouriersModule', []).controller('AssignedCouriersController',['$scope','$http',function($scope,$http)
{

		$http.post('/courier/home/getAssignedCouriers',Andromeda.getSessionValue("empid")).then(function(response) {
					if (response.data.successful) {
						$scope.acdatas=response.data.responseObject;
					} else {  
						alert("Courier Not Found With ID: "+cid);
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	
}]);