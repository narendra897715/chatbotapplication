package com.merilytics.config;

import java.util.WeakHashMap;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
public class InitializerServlet extends HttpServlet {
	
@Override
public void init(){
  WeakHashMap<String, HttpSession> map = new WeakHashMap<String, HttpSession>();
  ServletContext application =  getServletContext();
  application.setAttribute("loggedInSessions",map);
}

@Override
public void destroy() {
	getServletContext().removeAttribute("loggedInSessions");
}
	
}
