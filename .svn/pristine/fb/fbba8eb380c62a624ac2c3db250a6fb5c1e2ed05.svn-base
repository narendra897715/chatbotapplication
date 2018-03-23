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
import com.merilytics.bo.StaticScaleBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticScaleModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticScaleController {

	@Resource
	private StaticScaleModel staticScaleModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticScaleDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaticScaleBO> getStaticScaleDetails() {
		return staticScaleModel.getStaticScaleDetails();
	}

	@RequestMapping(value = "/insertStaticScaleDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticScaleDetails(@RequestBody StaticScaleBO staticScaleBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " inserted data into Static Scale i.e " + g.toJson(staticScaleBO));

		return staticScaleModel.insertStaticScaleDetails(staticScaleBO);

	}

	@RequestMapping(value = "/updateStaticScaleDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticScaleDetails(@RequestBody StaticScaleBO staticScaleBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " updated data into Static Scale i.e " + g.toJson(staticScaleBO));

		return staticScaleModel.updateStaticScaleDetails(staticScaleBO);
	}

	@RequestMapping(value = "/deleteStaticScaleDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticScaleDetails(@RequestBody StaticScaleBO staticScaleBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " deleted data into Static Scale i.e " + g.toJson(staticScaleBO));

		return staticScaleModel.deleteStaticScaleDetails(staticScaleBO);
	}
}
