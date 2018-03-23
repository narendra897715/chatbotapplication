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
import com.merilytics.bo.StaticColorfamilyBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticColorfamilyModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticColorfamilyController {

	@Resource
	private TokenValidator tokenValidator;

	@Resource
	private StaticColorfamilyModel staticColorfamilyModel;

	@RequestMapping(value = "/getStaticColorfamilyDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaticColorfamilyBO> getStaticColorfamilyDetails() {
		return staticColorfamilyModel.getStaticColorfamilyDetails();
	}

	@RequestMapping(value = "/insertStaticColorfamilyDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticColorfamilyDetails(@RequestBody StaticColorfamilyBO staticColorfamilyBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " insert data into Colorfamily i.e " + g.toJson(staticColorfamilyBO));

		return staticColorfamilyModel.insertStaticColorfamilyDetails(staticColorfamilyBO);

	}

	@RequestMapping(value = "/updateStaticColorfamilyDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticColorfamilyDetails(@RequestBody StaticColorfamilyBO staticColorfamilyBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " Update data into Colorfamily i.e " + g.toJson(staticColorfamilyBO));

		return staticColorfamilyModel.updateStaticColorfamilyDetails(staticColorfamilyBO);
	}

	@RequestMapping(value = "/deleteStaticColorfamilyDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticColorfamilyDetails(@RequestBody StaticColorfamilyBO staticColorfamilyBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();
		Loggers.INFO_lOGGER.info(name + " Delete data into Colorfamily i.e " + g.toJson(staticColorfamilyBO));

		return staticColorfamilyModel.deleteStaticColorfamilyDetails(staticColorfamilyBO);
	}

}
