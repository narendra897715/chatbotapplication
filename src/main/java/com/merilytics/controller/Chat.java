package com.merilytics.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Chat {

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/chatOutput", method = RequestMethod.POST)
	public @ResponseBody String getUsers(@RequestBody String outPut) {
		if(outPut.equalsIgnoreCase("Hi"))
		{
			return "Hello how can I help you";
			
		}
		else if(outPut.equalsIgnoreCase("I Love You"))
		{
			return "I To Love You";
			
		}
		else if(outPut.equalsIgnoreCase("Can I know your name"))
		{
			return "My name is computer";
			
		}
		else if(outPut.equalsIgnoreCase("Bye"))
		{
			return "Bye Take Care";
			
		}
		else if(outPut.equalsIgnoreCase("Is this Merilytics"))
		{
			return "Yes it is";
			
		}
		
		else 
			return "Please Enter Valid Sentence";
		
	}
	
	
	
}
