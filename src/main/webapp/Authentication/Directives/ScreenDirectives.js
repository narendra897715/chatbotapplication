(function() {
	'use strict';
  var ScreenDirectives = angular.module('Authentication.ScreenDirectives',[]), tokenName = window.name+"Token";
  ScreenDirectives.directive('loginScreen', function() {
	  return {
	        restrict : "E",
	        controller: ['httpPreConfig', '$httpParamSerializer', '$q', '$window', '$state', '$mdDialog','$rootScope','$scope','fileReader', function(httpPreConfig, HPS, Q, window, state, mdDialog,$rootScope,$scope,fileReader){
	        	var loginController = this, Email, AuthenticationToken;
	        	loginController.Authenticate = {};
	        	loginController.Stage = 'logInBlock';
	        	loginController.logoURL = 'https://merilytics.com/wp-content/uploads/2016/06/Merilytics.jpg';
	        	loginController.Auth = 'Application';
	        	loginController.loginForm = function() { loginController.Authenticate = {}; loginController.Stage = 'logInBlock'; }
	        	
	        	/* Region Start: logIn Block Form */ 
	        	loginController.invalidCredenticalsMessage = "Invalid Email ID or Password.";
	        	
	        	loginController.callLoginRequest = function (form,imgsrc){
	        		if(form != undefined){
	        			insertChat("me", form,imgsrc); 
		        		var promise=httpPreConfig({ method: 'POST', url: 'chatOutput',data:form });
						promise.then(function (response) { insertChat("bot", response.data.status);  }, function(reason){ console.log(reason) }); 
	        		}
	        		else{
	        			insertChat("me",form,imgsrc); 
	        		}
	        	}
	        	
	        	$("input[type='image']").click(function() {
	        	    $("input[id='my_file']").click();
	        	});
	        	
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
	        	function insertChat(who, text,imgsrc){
	        	   
	        	    if(imgsrc == ""){
	        	    	$scope.trer = false;
	        	    }
	        	    else{
	        	    	$scope.trer = true;
	        	    }
	        	    var control = "";
	        	   //var date = 	formatAMPM(new Date());
	        	   
	        	   var date = new Date();
	        	   var mDate =  formatAMPM(date);
	        	   date.setSeconds(date.getSeconds() + 5);
	        	   var yDate = formatAMPM(date);
	        	  
	        	    
	        	    if (who == "me"){
	        	    	
	        	    	if($scope.trer == false){
	        	        control =  '<li>'+
	        							'<div class="right-chat" style = "font-size: 12px;">'+
	        								'<div>'+
	        								'<img class="img-circle" src="'+me.avatar+'">'+
	        								'<p>'+text+'</p> ' +
	        								'</div>'+
	        								'<span style="right:0px;    position: unset;    margin-left: 50px;">'+yDate+'</span>'+
	        							'</div>'+
	        						'</li>';
	        	        $scope.trer = false;
	        	    	}
	        	    	else{
	        	    		 control =  '<li>'+
 							'<div  style = "font-size: 12px;">'+
 								'<div>'+
 								
 								 '<img  src="'+$scope.imageSrc+'" alt="2013 Toyota Tacoma" id="itemImg">' +
 								'</div>'+
 								'<span style="right:0px;    position: unset;    margin-left: 50px;">'+yDate+'</span>'+
 							'</div>'+
 						'</li>';
	        	    		 $scope.trer = false;
	        	    	}
	        						
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
	        								'<img class="img-circle" src="Authentication/Assets/favicon.png">'+
	        								'<p>'+text+'</p><small style="text-align: right;padding-left: 5px;">'+yDate+'</small>' +
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
	        	            
	        	           
	        	            
	        	            $scope.Querymessages = '';
	        	            $scope.$apply();
	        	        }, 0);
	        	    
	        	}

	        	function resetChat(){
	        	    $("ul").empty();
	        	}

	        	$(".mytext").on("keydown", function(e){
	        	    if (e.which == 13){
	        	        var text = $(this).val();
	        	        if (text !== ""){
	        	        	loginController.callLoginRequest(text,"");
	        	        }
	        	    }
	        	});

	        	$('body > div > div > div:nth-child(2) > span').click(function(){
	        	    $(".mytext").trigger({type: 'keydown', which: 13, keyCode: 13});
	        	})

	        	//-- Clear Chat
	        	resetChat();

	        	//-- Print Messages


	        	/*insertChat("me", "Hello bot...", 0);  
	        	insertChat("bot", "Hi, Harry!!", 1500);
	        	insertChat("bot", "What would you like to talk about today?", 1600);
	        	insertChat("me", "Tell me a joke", 3500);
	        	insertChat("bot", "Spaceman: Computer! Computer! Do we bring battery?!",7000);
	        	insertChat("me", "Lollll", 9500);*/
	           
	        	/*loginController.startConverting = function(){
	        		if('webkitSpeechRecognition' in window){
	   	        	 var speechRecognizer = new webkitSpeechRecognition();
	   	        	 speechRecognizer.continuous = true;
	   	        	 speechRecognizer.interimResults = true;
	   	        	 speechRecognizer.lang = 'en-IN';
	   	        	 speechRecognizer.start();
	   	        	  $scope.finalTranscipts = ''
	   	        	 speechRecognizer.onresult = function(event){
	   	        	  $scope.interTranscripts = '';
	   	        	 for(var i=event.resultIndex;i<event.results.length;i++){
	   	        	 var transcript = event.results[i][0].transcript;
	   	        	 transcript.replace("\n","<br>");
	   	        	 if(event.results[i].isFinal){
	   	        	   $scope.finalTranscripts += transcript;
	   	        	 }else{
	   	        	 $scope.interTranscripts += transcript;
	   	        	 }
	   	        	 }
	   	        	 $scope.Querymessages = $scope.finalTranscripts  + $scope.interTranscripts ;
	   	        	 console.log($scope.Querymessages);
	   	        	 }
	   	        	 speechRecognizer.onerror = function(event){
	   	        	 
	   	        	 }
	   	        	}else{
                         $scope.Querymessages = "your browser is not supported";
	   	        	}
	        	}
	        	*/
	        	 $scope.imageSrc = "";
	        	    
	        	    $scope.$on("fileProgress", function(e, progress) {
	        	      $scope.progress = progress.loaded / progress.total;
	        	    });
	        

	        	   

	        	  

	        	
	        	
	            
	        }],
	       
	        controllerAs: 'loginController',
	        link: function(scope, element, attrs, controllers) { },
	        templateUrl : 'Authentication/View/login.html'
	    };
	}); 

  ScreenDirectives.directive("ngFileSelect", function(fileReader, $timeout) {
	    return {
	      scope: {
	        ngModel: '='
	      },
	      link: function($scope, el) {
	        function getFile(file) {
	          fileReader.readAsDataUrl(file, $scope)
	            .then(function(result) {
	              $timeout(function() {
	                $scope.ngModel = result;
	                
	                
	              });
	              
	            });
	        }

	        el.bind("change", function(e) {
	          var file = (e.srcElement || e.target).files[0];
	          getFile(file);
	        });
	      }
	    };
	  });
  
  
  
  
  
  

 
   
 
  
 
  
 
  
  
})();
