var contacts = angular.module('ContactModule', []).controller('ContactController',['$scope','$http',function($scope,$http)
{
	$scope.sendReview = function(userdata){   
		console.log(userdata); 
		$http.post('/courier/home/sendReview', userdata).then(
				function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						
					} else {  
						alert("Review Not Sent !!");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	},
	
	$http.get('/courier/home/getReviews').then(function(response) {
		$scope.reviews = response.data;
		if($scope.reviews.successful)
		{
			$scope.reviews = response.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");
		}
	});
}]);