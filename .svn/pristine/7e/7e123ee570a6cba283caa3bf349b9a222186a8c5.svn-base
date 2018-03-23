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
import com.merilytics.bo.StaticSeasonBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticSeasonModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticSeasonController {

	@Resource
	private StaticSeasonModel staticSeasonModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticSeasonDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaticSeasonBO> getStaticSeasonDetails() {
		return staticSeasonModel.getStaticSeasonDetails();
	}

	@RequestMapping(value = "/insertStaticSeasonDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticSeasonDetails(@RequestBody StaticSeasonBO staticSeasonBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " inserted data into Season Details i.e " + g.toJson(staticSeasonBO));

		return staticSeasonModel.insertStaticSeasonDetails(staticSeasonBO);

	}

	@RequestMapping(value = "/updateStaticSeasonDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticSeasonDetails(@RequestBody StaticSeasonBO staticSeasonBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " updated data into Season Details i.e " + g.toJson(staticSeasonBO));

		return staticSeasonModel.updateStaticSeasonDetails(staticSeasonBO);
	}

	@RequestMapping(value = "/deleteStaticSeasonDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticSeasonDetails(@RequestBody StaticSeasonBO staticSeasonBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " deleted data into Season Details i.e " + g.toJson(staticSeasonBO));

		return staticSeasonModel.deleteStaticSeasonDetails(staticSeasonBO);
	}

}
