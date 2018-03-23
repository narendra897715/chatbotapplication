package com.merilytics.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.merilytics.bo.StaticColorvariantBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticColorvariantModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticColorvariantController {

	@Resource
	private StaticColorvariantModel staticColorvariantModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticColorvariantDetails", method = RequestMethod.POST)
	public @ResponseBody List<StaticColorvariantBO> getStaticColorvariantDetails(@RequestBody Integer family) {
		return staticColorvariantModel.getStaticColorvariantDetails(family);
	}

	@RequestMapping(value = "/insertStaticColorvariantDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticColorvariantDetails(@RequestBody StaticColorvariantBO staticColorvariantBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " insert data into Colorvariant i.e " + g.toJson(staticColorvariantBO));

		return staticColorvariantModel.insertStaticColorvariantDetails(staticColorvariantBO);

	}

	@RequestMapping(value = "/updateStaticColorvariantDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticColorvariantDetails(@RequestBody StaticColorvariantBO staticColorvariantBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " update data into Colorvariant i.e " + g.toJson(staticColorvariantBO));

		return staticColorvariantModel.updateStaticColorvariantDetails(staticColorvariantBO);
	}

	@RequestMapping(value = "/deleteStaticColorvariantDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticColorvariantDetails(@RequestBody StaticColorvariantBO staticColorvariantBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " delete data into Colorvariant i.e " + g.toJson(staticColorvariantBO));

		return staticColorvariantModel.deleteStaticColorvariantDetails(staticColorvariantBO);
	}

	@RequestMapping(value = "/getColourVarient", method = RequestMethod.GET)
	public @ResponseBody List<Map<String, Object>> getColourVarient() {

		return staticColorvariantModel.getColourVarient();
	}

	@RequestMapping(value = "/getShade", method = RequestMethod.GET)
	public @ResponseBody List<Map<String, Object>> getShade() {
		return staticColorvariantModel.getShade();
	}

}
