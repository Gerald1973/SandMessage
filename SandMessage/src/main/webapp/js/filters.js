kodi.filter("fanart", function() {
	return function(input) {
		var stringToRemove = "image://";
		var result = decodeURIComponent(input.replace(stringToRemove, ""));
		result=result.substring(0,result.length-1);
		return result;
	};
});