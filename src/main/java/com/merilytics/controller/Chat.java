package com.merilytics.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Chat {

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/chatOutput", method = RequestMethod.POST)
	public @ResponseBody Map<String,String> getUsers(@RequestBody String outPut) {
		
		Map<String,String> map = new LinkedHashMap<String,String>();
		
		
		if(outPut.equalsIgnoreCase("Hi"))
		{
			map.put("status", "Hello how can I help you");
			return map;
			
		}
		else if(outPut.equalsIgnoreCase("I Love You"))
		{
			map.put("status", "I To Love You");
			return map;
			
		}
		else if(outPut.equalsIgnoreCase("Can I know your name"))
		{
			map.put("status", "My name is computer");
			return map;
			
		}
		else if(outPut.equalsIgnoreCase("Bye"))
		{
			map.put("status", "Bye Take Care");
			return map;
			
		}
		else if(outPut.equalsIgnoreCase("Is this Merilytics"))
		{
			map.put("status", "Yes it is");
			return map;
			
		}
		
		else {
			map.put("status","Please Enter Valid Sentence");
			return map;
		}
		
	}
	
	
	
}
