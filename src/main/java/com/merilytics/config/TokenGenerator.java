/*package com.merilytics.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class TokenGenerator implements Filter {

	private TokenValidator tv;

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;

		String path = httpRequest.getServletPath();
		if (path == null || path.equals("/")|| path.equals("/OTPCheck")||path.startsWith("/Authentication/Partials") || path.startsWith("/Authentication/Assets") || path.startsWith("/Authentication/Styles")|| path.startsWith("/Authentication/View")
				|| path.startsWith("/Authentication/Directives") || path.startsWith("/Authentication/ExcelTemplates")
				|| path.startsWith("/Authentication/Filters") || path.startsWith("/Authentication/Controllers") || path.startsWith("/Authentication/Services")
				|| path.startsWith("/initiate.js")|| path.startsWith("/landing.js")  || path.equalsIgnoreCase("/createuserrequest")
				|| path.equalsIgnoreCase("/forgotpasswordcontroller") || path.equalsIgnoreCase("/logoutuser")|| path.equalsIgnoreCase("/index.html")|| path.equalsIgnoreCase("/forceChangePassword")
				|| path.equalsIgnoreCase("/checkemail")) {
			chain.doFilter(request, response);
		}

		// check the availability of token in data base if available forward the request
		// else send error
		String token = httpRequest.getHeader("token");
		// int tkn=tv.isTokenAvailable(token);
		int tkn = 1;
		// System.out.println(httpRequest.getHeader("authorization"));
		if (tkn == 1) {
			chain.doFilter(httpRequest, httpResponse);
		} else {
			httpResponse.sendError(400, "Bad Request");
			pw=response.getWriter();
			response.setContentType("text/html");
			 pw.println("<span style='color:red'>Request not allowed</span>");
			return;
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		WebApplicationContext springContext = WebApplicationContextUtils
				.getWebApplicationContext(arg0.getServletContext());
		tv = springContext.getBean("TokenValidator", TokenValidator.class);

	}

}
*/