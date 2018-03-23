package com.merilytics.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.merilytics.bo.StaticCollarBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticCollarModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticCollarController {
	// StaticCollarBO

	@Resource
	private StaticCollarModel staticCollarModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticCollarDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaticCollarBO> getStaticCollarDetails() {
		return staticCollarModel.getStaticCollarDetails();
	}

	@RequestMapping(value = "/insertStaticCollarDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticCollarDetails(@RequestBody StaticCollarBO staticCollarBO,
			HttpServletRequest request, HttpServletResponse response) {
		String name = tokenValidator.isToken(request.getHeader("token"), request, response);
		Gson g = new Gson();
		Loggers.INFO_lOGGER.info(name + " insert data into Collar i.e " + g.toJson(staticCollarBO));
		return staticCollarModel.insertStaticCollarDetails(staticCollarBO);

	}

	@RequestMapping(value = "/updateStaticCollarDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticCollarDetails(@RequestBody StaticCollarBO staticCollarBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);
		Gson g = new Gson();
		Loggers.INFO_lOGGER.info(name + " update data into Collar i.e " +  g.toJson(staticCollarBO));

		return staticCollarModel.updateStaticCollarDetails(staticCollarBO);
	}

	@RequestMapping(value = "/deleteStaticCollarDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticCollarDetails(@RequestBody StaticCollarBO staticCollarBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);
		Gson g = new Gson();
		Loggers.INFO_lOGGER.info(name + " delete data into Collar i.e " +  g.toJson(staticCollarBO));

		return staticCollarModel.deleteStaticCollarDetails(staticCollarBO);
	}

}
