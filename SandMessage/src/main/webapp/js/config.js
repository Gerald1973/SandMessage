/**
 * 
 */
kodi.config([ '$compileProvider', function($compileProvider) {
	// Default imgSrcSanitizationWhitelist:
	// /^\s*((https?|ftp|file|blob):|data:image\/)/
	// chrome-extension: will be added to the end of the expression
	$compileProvider.imgSrcSanitizationWhitelist(/^\s*((https?|image|ftp|file|blob|chrome-extension):|data:image\/)/);
} ]);