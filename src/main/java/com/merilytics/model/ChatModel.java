package com.merilytics.model;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.merilytics.dao.ChatDao;

@Configuration
public class ChatModel {
	@Autowired
	private ChatDao chatDao;
	
	
	public Map<String,Object> getChatingOutput(String outPut) {
		return chatDao.getChatingOutput(outPut);
		}
		
	
	

}
