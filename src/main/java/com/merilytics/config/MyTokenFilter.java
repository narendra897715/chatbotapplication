package com.merilytics.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * @author 21258
 *
 */
@Component
public class MyTokenFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// System.out.println("from my token filter");
		String path = request.getServletPath();
		//System.out.println("from my token filter---"+path);
		if (path == null || path.equals("/")|| path.equals("/OTPCheck")) {
			filterChain.doFilter(request, response);
		} else {
			if (path.startsWith("/Authentication/Partials") || path.startsWith("/Authentication/Assets") || path.startsWith("/Authentication/Styles")|| path.startsWith("/Authentication/View")
					|| path.startsWith("/Authentication/Directives") || path.startsWith("/Authentication/ExcelTemplates")
					|| path.startsWith("/Authentication/Filters") || path.startsWith("/Authentication/Controllers") || path.startsWith("/Authentication/Services")
					|| path.startsWith("/initiate.js")|| path.startsWith("/landing.js")  || path.equalsIgnoreCase("/createuserrequest")
					|| path.equalsIgnoreCase("/forgotpasswordcontroller") || path.equalsIgnoreCase("/logoutuser")|| path.equalsIgnoreCase("/index.html")|| path.equalsIgnoreCase("/forceChangePassword")
					|| path.equalsIgnoreCase("/checkemail")) {
				filterChain.doFilter(request, response);
			} else {
				HttpSession session = request.getSession(false);
				if (session == null) {
					response.sendError(403, "Your Session Expired");
				} else {
					filterChain.doFilter(request, response);
				}
			}
		}
	}

}
