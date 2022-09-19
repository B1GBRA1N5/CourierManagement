var s = angular.module('SearchModule', []).controller('SearchController',['$scope','$http',function($scope,$http)
{

		$http.post('/courier/home/search',Andromeda.getSessionValue("cid")).then(function(response) {
					if (response.data.successful) {
						$scope.cdata=response.data.responseObject;
						Andromeda.removeSessionValue("cid");
					} else {  
						alert("Courier Not Found With ID: "+cid);
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	
}]);