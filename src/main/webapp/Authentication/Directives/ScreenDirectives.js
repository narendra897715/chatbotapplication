(function() {
	'use strict';
  var ScreenDirectives = angular.module('Authentication.ScreenDirectives',[]), tokenName = window.name+"Token";
  ScreenDirectives.directive('loginScreen', function() {
	  return {
	        restrict : "E",
	        controller: ['httpPreConfig', '$httpParamSerializer', '$q', '$window', '$state', '$mdDialog','$rootScope', function(httpPreConfig, HPS, Q, window, state, mdDialog,$rootScope){
	        	var loginController = this, Email, AuthenticationToken;
	        	loginController.Authenticate = {};
	        	loginController.Stage = 'logInBlock';
	        	loginController.logoURL = 'https://merilytics.com/wp-content/uploads/2016/06/Merilytics.jpg';
	        	loginController.Auth = 'Application';
	        	loginController.loginForm = function() { loginController.Authenticate = {}; loginController.Stage = 'logInBlock'; }
	        	
	        	/* Region Start: logIn Block Form */ 
	        	loginController.invalidCredenticalsMessage = "Invalid Email ID or Password.";
	        	
	        	$(document).ready(function(){
	            	$(".left-first-section").click(function(){
	                    $('.main-section').toggleClass("open-more");
	                });
	            });
	            $(document).ready(function(){
	            	$(".fa-minus").click(function(){
	                    $('.main-section').toggleClass("open-more");
	                });
	            });
	        	
	        	var me = {};
	        	me.avatar = "https://lh6.googleusercontent.com/-lr2nyjhhjXw/AAAAAAAAAAI/AAAAAAAARmE/MdtfUmC0M4s/photo.jpg?sz=48";

	        	var bot= {};
	        	bot.avatar = "http://pmapp.merilytics.com:8080/PMApp/Assets/logo.png";

	        	function formatAMPM(date) {
	        	    var hours = date.getHours();
	        	    var minutes = date.getMinutes();
	        	    var ampm = hours >= 12 ? 'PM' : 'AM';
	        	    hours = hours % 12;
	        	    hours = hours ? hours : 12; // the hour '0' should be '12'
	        	    minutes = minutes < 10 ? '0'+minutes : minutes;
	        	    var strTime = hours + ':' + minutes + ' ' + ampm;
	        	    return strTime;
	        	}            

	        	//-- No use time. It is a javaScript effect.
	        	function insertChat(who, text, time){
	        	    if (time === undefined){
	        	        time = 0;
	        	    }
	        	    var control = "";
	        	   //var date = 	formatAMPM(new Date());
	        	   
	        	   var date = new Date();
	        	   var mDate =  formatAMPM(date);
	        	   date.setSeconds(date.getSeconds() + 5);
	        	   var yDate = formatAMPM(date);
	        	  
	        	    
	        	    if (who == "me"){
	        	        control =  '<li>'+
	        							'<div class="right-chat" style = "font-size: 12px;">'+
	        								'<div>'+
	        								'<img class="img-circle" src="'+me.avatar+'">'+
	        								'<p>'+text+'</p> '+
	        								'</div>'+
	        								'<span style="position: absolute; right: 0; bottom: 0;font-size:10;">'+mDate+'</span>'+
	        							'</div>'+
	        						'</li>';
	        						
	        	        			/* '<li style="width:100%;">' +
	        	                        '<div class="msj-rta macro">' +
	        	                            '<div class="text text-r">' +
	        	                                '<p>'+text+'</p>' +
	        	                                '<p><small>'+mDate+'</small></p>' +
	        	                            '</div>' +
	        	                        '<div class="avatar" style="padding:0px 0px 0px 10px !important"><img class="img-circle" style="width:100%;" src="'+me.avatar+'" /></div>' +                                
	        	                  '</li>';  */     
	        	    }else{
	        	        control = '<li>'+
	        							'<div class="left-chat" style = "font-size: 12px;">'+
	        								'<img class="img-circle" src="'+bot.avatar+'">'+
	        								'<p>'+text+'<small style="text-align: right;">'+yDate+'</small></p> '+
	        							'</div>'+
	        						'</li>';
	        						/*'<li style="width:100%">' +
	        	                        '<div class="msj macro">' +
	        	                        '<div class="avatar"><img class="img-circle" style="width:100%;" src="'+ bot.avatar +'" /></div>' +
	        	                            '<div class="text text-l">' +
	        	                                '<p>'+ text +'</p>' +
	        	                                '<p><small>'+yDate+'</small></p>' +
	        	                            '</div>' +
	        	                        '</div>' +
	        	                    '</li>'; 
	        	                   */
	        	    }
	        	    setTimeout(
	        	        function(){                        
	        	            $("ul").append(control).scrollTop($("ul").prop('scrollHeight'));
	        	        }, time);
	        	    
	        	}

	        	function resetChat(){
	        	    $("ul").empty();
	        	}

	        	$(".mytext").on("keydown", function(e){
	        	    if (e.which == 13){
	        	        var text = $(this).val();
	        	        if (text !== ""){
	        	            insertChat("me", text);              
	        	            $(this).val('');
	        	        }
	        	    }
	        	});

	        	$('body > div > div > div:nth-child(2) > span').click(function(){
	        	    $(".mytext").trigger({type: 'keydown', which: 13, keyCode: 13});
	        	})

	        	//-- Clear Chat
	        	resetChat();

	        	//-- Print Messages


	        	insertChat("me", "Hello bot...", 0);  
	        	insertChat("bot", "Hi, Harry!!", 1500);
	        	insertChat("bot", "What would you like to talk about today?", 1600);
	        	insertChat("me", "Tell me a joke", 3500);
	        	insertChat("bot", "Spaceman: Computer! Computer! Do we bring battery?!",7000);
	        	insertChat("me", "Lollll", 9500);
	           
	            
	        	
	            
	        }],
	        compile: function(tElement, tAttrs, transclude) {
	            return {
	               pre: function preLink(scope, iElement, iAttrs, controller) { },
	               post: function postLink(scope, iElement, iAttrs, controller) { }
	            }
	         },
	        controllerAs: 'loginController',
	        link: function(scope, element, attrs, controllers) { },
	        templateUrl : 'Authentication/View/login.html'
	    };
	}); 

 
  
  
  
  
  
  

 
   
 
  
 
  
 
  
  
})();
