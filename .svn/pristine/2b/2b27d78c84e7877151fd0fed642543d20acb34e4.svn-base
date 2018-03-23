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
import com.merilytics.bo.StaticProductStyleBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticProductStyleModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticProductStyleController {

	@Resource
	private StaticProductStyleModel staticProductStyleModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticProductStyleDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaticProductStyleBO> getStaticProductStyleDetails() {
		return staticProductStyleModel.getStaticProductStyleDetails();
	}

	@RequestMapping(value = "/insertStaticProductStyleDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticProductStyleDetails(@RequestBody StaticProductStyleBO staticProductStyleBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " inserted data into Product Style i.e " + g.toJson(staticProductStyleBO));

		return staticProductStyleModel.insertStaticProductStyleDetails(staticProductStyleBO);

	}

	@RequestMapping(value = "/updateStaticProductStyleDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticProductStyleDetails(@RequestBody StaticProductStyleBO staticProductStyleBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " updated data into Product Style i.e " + g.toJson(staticProductStyleBO));

		return staticProductStyleModel.updateStaticProductStyleDetails(staticProductStyleBO);
	}

	@RequestMapping(value = "/deleteStaticProductStyleDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticProductStyleDetails(@RequestBody StaticProductStyleBO staticProductStyleBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " deleted data into Product Style i.e " + g.toJson(staticProductStyleBO));

		return staticProductStyleModel.deleteStaticProductStyleDetails(staticProductStyleBO);
	}

}
