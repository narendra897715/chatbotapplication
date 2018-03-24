package com.merilytics.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.merilytics.model.ChatModel;

@Controller
public class Chat {

	@Autowired
	private ChatModel chatModel;
	
	
	
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/chatOutput", method = RequestMethod.POST)
	public @ResponseBody Map<String,Object> getChatingOutput(@RequestBody String outPut) {
		
		return chatModel.getChatingOutput(outPut);
	}
	
	
	
}
