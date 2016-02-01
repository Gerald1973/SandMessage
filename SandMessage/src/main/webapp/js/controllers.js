kodi.controller("kodi.movieController", function(kodiConstants,$scope, $http) {
	$scope.movies = [];
	$scope.result = "NOK";
	
	$scope.playMovie = function(movie){
		console.log("play movie");
	}
	
	$scope.listMovies = function() {
		var json = {
			jsonrpc : "2.0",
			method : "VideoLibrary.GetMovies",
			params : {
				properties : [ "title", "year", "art", "streamdetails", "resume", "plot","file" ],
				sort : {
					order : "ascending",
					method : "title",
					ignorearticle : true
				}
			},
			id : "libmovies"
		};
		var responsePromise = $http({
			method : 'POST',
			url : kodiConstants.urlServer,
			data : json
		});
		responsePromise.success(function(data) {
			console.log(data);
			$scope.result = data;
			for (var i = 0; i < data.result.movies.length; i++) {
				var movie = data.result.movies[i];
				$scope.movies = data.result.movies;
			}
		})

	}
});