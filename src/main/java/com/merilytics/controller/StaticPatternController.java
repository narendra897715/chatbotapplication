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
import com.merilytics.bo.StaticPatternBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticPatternModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticPatternController {

	@Resource
	private StaticPatternModel staticPatternModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticPatternDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaticPatternBO> getStaticOccasionDetails() {
		return staticPatternModel.getStaticOccasionDetails();
	}

	@RequestMapping(value = "/insertStaticPatternDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticPatternDetails(@RequestBody StaticPatternBO staticPatternBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " inserted data into StaticPattern i.e " + g.toJson(staticPatternBO));

		return staticPatternModel.insertStaticPatternDetails(staticPatternBO);

	}

	@RequestMapping(value = "/updateStaticPatternDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticPatternDetails(@RequestBody StaticPatternBO staticPatternBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " updated data into StaticPattern i.e " + g.toJson(staticPatternBO));

		return staticPatternModel.updateStaticPatternDetails(staticPatternBO);
	}

	@RequestMapping(value = "/deleteStaticPatternDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticPatternDetails(@RequestBody StaticPatternBO staticPatternBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " deleted data into StaticPattern i.e " + g.toJson(staticPatternBO));

		return staticPatternModel.deleteStaticPatternDetails(staticPatternBO);
	}

}
