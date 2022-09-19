var c = angular.module('CouriersModule', []).controller('CouriersController',['$scope','$http',function($scope,$http)
{

		$http.get('/courier/home/getCourierBoys').then(function(response) {
					if (response.data.successful) {
						$scope.cdatas=response.data.responseObject;
					} else {  
						alert("Courier Not Found With ID: "+cid);
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	
}]);