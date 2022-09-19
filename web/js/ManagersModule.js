var m = angular.module('ManagersModule', []).controller('ManagersController',['$scope','$http',function($scope,$http)
{

		$http.get('/courier/home/getManagers').then(function(response) {
					if (response.data.successful) {
						$scope.mdatas=response.data.responseObject;
					} else {  
						alert("Courier Not Found With ID: "+cid);
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	
}]);