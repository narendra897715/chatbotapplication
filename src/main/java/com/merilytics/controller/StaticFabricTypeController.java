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
import com.merilytics.bo.StaticFabrictypeBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticFabricTypeModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticFabricTypeController {

	@Resource
	private StaticFabricTypeModel staticFabricTypeModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticFabrictypeDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaticFabrictypeBO> getStaticFabrictypeDetails() {
		return staticFabricTypeModel.getStaticFabrictypeDetails();
	}

	@RequestMapping(value = "/insertStaticFabrictypeDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticFabrictypeDetails(@RequestBody StaticFabrictypeBO staticFabrictypeBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " insert data into Fabrictype i.e " + g.toJson(staticFabrictypeBO));

		return staticFabricTypeModel.insertStaticFabrictypeDetails(staticFabrictypeBO);

	}

	@RequestMapping(value = "/updateStaticFabrictypeDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticFabrictypeDetails(@RequestBody StaticFabrictypeBO staticFabrictypeBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " update data into Fabrictype i.e " + g.toJson(staticFabrictypeBO));

		return staticFabricTypeModel.updateStaticFabrictypeDetails(staticFabrictypeBO);
	}

	@RequestMapping(value = "/deleteStaticFabrictypeDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticFabrictypeDetails(@RequestBody StaticFabrictypeBO staticFabrictypeBO,
			HttpServletRequest request, HttpServletResponse response) {
		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " delete data into Fabrictype i.e " + g.toJson(staticFabrictypeBO));

		return staticFabricTypeModel.deleteStaticFabrictypeDetails(staticFabrictypeBO);
	}

}
