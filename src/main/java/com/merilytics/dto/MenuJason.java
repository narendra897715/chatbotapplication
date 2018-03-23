package com.merilytics.dto;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuJason {
	private String parent;
	private String name;
	private String url;
	private String templeteUrl;
	private String controller;
    private DataJason data;
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTempleteUrl() {
		return templeteUrl;
	}
	public void setTempleteUrl(String templeteUrl) {
		this.templeteUrl = templeteUrl;
	}
	public String getController() {
		return controller;
	}
	public void setController(String controller) {
		this.controller = controller;
	}
	
	public DataJason getData() {
		return data;
	}
	public void setData(DataJason data) {
		this.data = data;
	}
    
    
	
}
