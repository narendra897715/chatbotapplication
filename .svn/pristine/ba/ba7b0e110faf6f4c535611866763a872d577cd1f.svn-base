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
import com.merilytics.bo.StaticFabricationBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticFabricationModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticFabricationController {

	@Resource
	private StaticFabricationModel staticFabricationModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticFabricationDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaticFabricationBO> getStaticFabricationDetails() {
		return staticFabricationModel.getStaticFabricationDetails();
	}

	@RequestMapping(value = "/insertStaticFabricationDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticFabricationDetails(@RequestBody StaticFabricationBO staticFabricationBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " insert data into FabricationDetails i.e " + g.toJson(staticFabricationBO));

		return staticFabricationModel.insertStaticFabricationDetails(staticFabricationBO);

	}

	@RequestMapping(value = "/updateStaticFabricationDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticFabricationDetails(@RequestBody StaticFabricationBO staticFabricationBO,
			HttpServletRequest request, HttpServletResponse response) {

		Gson g = new Gson();
		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Loggers.INFO_lOGGER.info(name + " update data into FabricationDetails i.e " + g.toJson(staticFabricationBO));

		return staticFabricationModel.updateStaticFabricationDetails(staticFabricationBO);
	}

	@RequestMapping(value = "/deleteStaticFabricationDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticFabricationDetails(@RequestBody StaticFabricationBO staticFabricationBO,
			HttpServletRequest request, HttpServletResponse response) {

		Gson g = new Gson();
		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Loggers.INFO_lOGGER.info(name + " delete data into FabricationDetails i.e " + g.toJson(staticFabricationBO));

		return staticFabricationModel.deleteStaticFabricationDetails(staticFabricationBO);
	}

}
