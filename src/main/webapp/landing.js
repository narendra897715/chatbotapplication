(function() {
  'use strict';
var Authentication =  angular.module('landing',['ngMaterial', 'ngMessages', 'ngAnimate', 'ngAria', 'ngResource','ui.router', 'md.data.table',
	                                          , 'Authentication.ScreenDirectives'
	                                          , 'Authentication.Services'
	                                          ]), tokenName = window.name+"Token";
Authentication.config(["$locationProvider", "$stateProvider", "$urlRouterProvider", "$mdThemingProvider" ,function(l, s, u, t) {
 l.hashPrefix('');
 u.otherwise("/");
 s.state('logIn', { url: "/", template: '<login-screen layout-fill layout="row" layout-align="center center"></login-screen>', resolve: { data: function($q, $state, $window, $timeout) { var deferred = $q.defer(); $timeout(function() { if ($window.localStorage.getItem(tokenName)) { $state.go('landingScreen'); deferred.reject(); } else { deferred.resolve(); } }); return deferred.promise; } } });


 //t.generateThemesOnDemand(false);
 
 t.alwaysWatchTheme(true);
 t.definePalette('meritusBlue', t.extendPalette('indigo', { '50': '#372F85', 'A700': '#708E21', 'contrastDefaultColor': 'light' }));
 t.definePalette('meritusGreen', t.extendPalette('light-green', { '50': '#99b230', 'A700': '#372F85', 'contrastDefaultColor': 'light' }));
 t.theme('meritus').primaryPalette('meritusBlue', { 'default': '50' }).accentPalette('meritusGreen', { 'default': '50' }).warnPalette('red', { 'default': '700' });
 /*t.theme('red').primaryPalette('red', { 'default': '900' }).accentPalette('red', { 'default': '50' }).warnPalette('red', { 'default': '50' }); 
 t.theme('pink').primaryPalette('pink', { 'default': '900' }).accentPalette('pink', { 'default': '50' }).warnPalette('pink', { 'default': '50' }); 
 t.theme('purple').primaryPalette('purple', { 'default': '900' }).accentPalette('purple', { 'default': '50' }).warnPalette('purple', { 'default': '50' });
 t.theme('deep-purple').primaryPalette('deep-purple', { 'default': '900' }).accentPalette('deep-purple', { 'default': '50' }).warnPalette('deep-purple', { 'default': '50' });
 t.theme('indigo').primaryPalette('indigo', { 'default': '900' }).accentPalette('indigo', { 'default': '50' }).warnPalette('indigo', { 'default': '50' });
 t.theme('blue').primaryPalette('blue', { 'default': '900' }).accentPalette('blue', { 'default': '50' }).warnPalette('blue', { 'default': '50' });
 t.theme('light-blue').primaryPalette('light-blue', { 'default': '900' }).accentPalette('light-blue', { 'default': '50' }).warnPalette('light-blue', { 'default': '50' });
 t.theme('cyan').primaryPalette('cyan', { 'default': '900' }).accentPalette('cyan', { 'default': '50' }).warnPalette('cyan', { 'default': '50' });
 t.theme('teal').primaryPalette('teal', { 'default': '900' }).accentPalette('teal', { 'default': '50' }).warnPalette('teal', { 'default': '50' });
 t.theme('green').primaryPalette('green', { 'default': '900' }).accentPalette('green', { 'default': '50' }).warnPalette('green', { 'default': '50' });
 t.theme('light-green').primaryPalette('light-green', { 'default': '900' }).accentPalette('light-green', { 'default': '50' }).warnPalette('light-green', { 'default': '50' });
 t.theme('lime').primaryPalette('lime', { 'default': '900' }).accentPalette('lime', { 'default': '50' }).warnPalette('lime', { 'default': '50' });
 t.theme('yellow').primaryPalette('yellow', { 'default': '900' }).accentPalette('yellow', { 'default': '50' }).warnPalette('yellow', { 'default': '50' });    
 t.theme('amber').primaryPalette('amber', { 'default': '900' }).accentPalette('amber', { 'default': '50' }).warnPalette('amber', { 'default': '50' });  
 t.theme('orange').primaryPalette('orange', { 'default': '900' }).accentPalette('orange', { 'default': '50' }).warnPalette('orange', { 'default': '50' });        
 t.theme('deep-orange').primaryPalette('deep-orange', { 'default': '900' }).accentPalette('deep-orange', { 'default': '50' }).warnPalette('deep-orange', { 'default': '50' });        
 t.theme('brown').primaryPalette('brown', { 'default': '900' }).accentPalette('brown', { 'default': '50' }).warnPalette('brown', { 'default': '50' });        
 t.theme('grey').primaryPalette('grey', { 'default': '900' }).accentPalette('grey', { 'default': '50' }).warnPalette('grey', { 'default': '50' });           
 t.theme('blue-grey').primaryPalette('blue-grey', { 'default': '900' }).accentPalette('blue-grey', { 'default': '50' }).warnPalette('blue-grey', { 'default': '50' });*/
 //t.enableBrowserColor({ theme: 'meritus', palette: 'accent', hue: '200' });
}]);
Authentication.controller('landingController',['$mdTheming',function(mt){ /*mt.generateTheme('meritus');*/ }]);
})();

