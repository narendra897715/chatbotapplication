/*package com.merilytics.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.WeakHashMap;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.merilytics.bo.EmployeeBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.dto.UserIdPasswordDTO;
import com.merilytics.model.EmployeeModel;
import com.merilytics.util.JasonDataFormat;
import com.merilytics.util.Loggers;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeModel model;

	@Resource
	private TokenValidator tokenValidator;

	public String findName(String authority) {
		StringTokenizer sc = new StringTokenizer(authority, "_");
		String s = null;
		while (sc.hasMoreTokens()) {
			s = sc.nextToken();
		}
		return s;
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = { "/welcome" }, method = RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> onLoginSuccess(HttpServletRequest request,
			HttpServletResponse response) {
		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		HttpSession session = attr.getRequest().getSession(false);
		SecurityContext sc = (SecurityContext) session.getAttribute("SPRING_SECURITY_CONTEXT");
		Authentication ath = sc.getAuthentication();

		String email = ath.getName();
		ServletContext application = request.getServletContext();

		WeakHashMap<String, HttpSession> map = (WeakHashMap<String, HttpSession>) application
				.getAttribute("loggedInSessions");
		map.put(email, session);

		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) ath.getAuthorities();
		GrantedAuthority ga = null;

		for (GrantedAuthority g : authorities) {
			ga = g;
		}

		String roleId = findName(ga.toString());
		HashMap<String, Object> data = model.onLogin(email, roleId, response);
		response.addHeader("token", (String) data.get("token"));
		// set token from here

		Loggers.INFO_lOGGER.info(email + " Logged into Application");

		return data;
	}

	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@RequestMapping(value = "/loginfailure", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> onLoginFailure(HttpServletRequest request, HttpServletResponse response) {
		HashMap<String, String> map = new HashMap<String, String>();
		HttpSession session = request.getSession(false);
		Exception e = (Exception) session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION");

		if (e instanceof org.springframework.security.authentication.BadCredentialsException) {
			map.put("messageid", "error_authentication_failure");

			session.invalidate();
			return new ResponseEntity<>("{\"statusText\":\"Invalid email or password\"}", HttpStatus.BAD_REQUEST);

		} else if (e instanceof org.springframework.security.authentication.AccountExpiredException) {
			map.put("messageid", "error_already_loggedin");
			session.invalidate();
			return new ResponseEntity<>("{\"statusText\":\"Error in fetching data\"}", HttpStatus.NO_CONTENT);

		} else if (e instanceof org.springframework.security.authentication.CredentialsExpiredException) {
			map.put("messageid", "error_account_disabled");
			session.invalidate();
			return new ResponseEntity<>(
					"{\"statusText\":\"Your account has been disabled. Please contact pmsupport@merilytics.com to enable it \"}",
					HttpStatus.NOT_ACCEPTABLE);
		}
		return null;

	}

	@RequestMapping(value = "/forceChangePassword", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> forceChangePassword(@RequestBody String password, HttpServletRequest request,
			HttpServletResponse response) {
		String token = request.getHeader("token");
		System.out.println(token);
		HashMap<String, Object> map = new HashMap<String, Object>();
		String email = model.getEmailWithToken(token);
		System.out.println("email" + email);
		Boolean isChanged = false;
		try {
			isChanged = model.forceChangePassword(email, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

		response.addHeader("token", token);
		if (isChanged) {
			// map.put("message", "success");
			return new ResponseEntity<>("{\"statusText\":\"success\"}", HttpStatus.OK);
			// map.put("fetchData", model.onLogin(dto.getEmail(), "1", response));
		} else {
			return new ResponseEntity<>("{\"statusText\":\"failed\"}", HttpStatus.FORBIDDEN);
			// map.put("messageid", "error_last_used_passwords");
		}

	}

	@RequestMapping(value = "/logoutuser", method = RequestMethod.POST)
	public @ResponseBody Map<String, String> logout(@RequestBody String email, HttpServletRequest request,
			HttpServletResponse response) {
		// model.onlogOut(email);
		model.updateToken(email);

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return JasonDataFormat.getJasonData(true, response);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/forcelogoutuser", method = RequestMethod.POST)
	public @ResponseBody Map<String, String> forcelogout(@RequestBody String email, HttpServletRequest request,
			HttpServletResponse response) {

		// model.forceLogOut(email);

		ServletContext application = request.getServletContext();

		WeakHashMap<String, HttpSession> map = (WeakHashMap<String, HttpSession>) application
				.getAttribute("loggedInSessions");
		if (!map.isEmpty()) {
			HttpSession session = map.get(email);
			if (session != null) {
				session.invalidate();
			}
		}

		return JasonDataFormat.getJasonData(true, response);
	}

	@RequestMapping(value = "/forgotpasswordcontroller", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> forgotPasswordController(@RequestBody String email,
			HttpServletResponse response) {
		response.setContentType("text/html");
		HashMap<String, String> map = new HashMap<String, String>();
		// String emailID=model.getEmailWithToken(email);
		Map map1 = model.forgotPasswordAction(email);
		String s = (String) map1.get("isSuccessfull");
		String token = (String) map1.get("token");
		response.addHeader("token", token);
		if (s.equalsIgnoreCase("success")) {
			return new ResponseEntity<>("{\"statusText\":\"success\"}", HttpStatus.OK);
			// map.put("message", "success");

		} else {
			return new ResponseEntity<>("{\"statusText\":\"" + s + "\"}", HttpStatus.DESTINATION_LOCKED);
			// map.put("messageid", s);
		}

	}

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/getUsers", method = RequestMethod.POST)
	public @ResponseBody List getUsers() {
		return model.getUsers();
	}

	@RequestMapping(value = "/changePassword", method = RequestMethod.POST)
	public @ResponseBody HashMap<String, String> chagePassword(@RequestBody UserIdPasswordDTO dto,
			HttpServletRequest request, HttpServletResponse response) {
		response.addHeader("token", (String) request.getHeader("token"));

		return (HashMap<String, String>) JasonDataFormat.getJasonData(model.changePassword(dto), response);
	}

	// refreshSerive

	@RequestMapping(value = "/userRefresh", method = RequestMethod.POST)
	public @ResponseBody HashMap<String, Object> chagePassword(@RequestBody String email, HttpServletRequest request,
			HttpServletResponse response) {

		return model.refreshSerive(email);
	}

	@RequestMapping(value = "/checkemail", method = RequestMethod.POST)
	public @ResponseBody HashMap<String, String> checkEmail(@RequestBody String email) {
		HashMap<String, String> map = new HashMap<String, String>();
		Boolean exists = model.checkEmail(email);
		map.put("message", exists.toString());
		return map;
	}

	@RequestMapping(value = "/getApps", method = RequestMethod.GET)
	public @ResponseBody List getApps(HttpServletRequest request, HttpServletResponse response) {
		response.addHeader("token", request.getHeader("token"));
		List apps = model.getUserApps();
		return apps;
	}

	@RequestMapping(value = "/getEmail", method = RequestMethod.POST)
	public @ResponseBody String getEmail(@RequestBody String token) {
		String apps = model.getEmailWithToken(token);
		return apps;
	}

	@RequestMapping(value = "/OTPCheck", method = RequestMethod.POST)
	public ResponseEntity<?> OTP(@RequestBody String OTP, HttpServletRequest request, HttpServletResponse response) {
		boolean flag = false;
		response.addHeader("token", request.getHeader("token"));
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		String token = request.getHeader("token");
		String DBOTP = model.OTPAuthCheck(token);

		if (bcrypt.matches(OTP, DBOTP)) {
			return new ResponseEntity<>("{\"statusText\":\"success\"}", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("{\"statusText\":\"Please enter valid OTP\"}", HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/empDetailsWithToken", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> empDetails(HttpServletRequest request, HttpServletResponse response) {
		response.addHeader("token", request.getHeader("token"));
		try {
			EmployeeBO userDetails = model.getEmployeeDetailsWithToken(request.getHeader("token"));
			if (userDetails != null) {
				return new ResponseEntity<>(userDetails, HttpStatus.OK);
			} else {
				return new ResponseEntity<>("{\"statusText\":\"no details found\"}", HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<>("{\"statusText\":\"no details found\"}", HttpStatus.BAD_REQUEST);
		}

	}

}
*/