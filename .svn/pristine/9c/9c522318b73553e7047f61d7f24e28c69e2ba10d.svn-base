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
import com.merilytics.bo.StaticNocategoryBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticNocategoryModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticNocategoryController {

	@Resource
	private StaticNocategoryModel staticNocategoryModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticNocategoryDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaticNocategoryBO> getStaticNocategoryDetails() {
		return staticNocategoryModel.getStaticNocategoryDetails();
	}

	@RequestMapping(value = "/insertStaticNocategoryDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticNocategoryDetails(@RequestBody StaticNocategoryBO staticNocategoryBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " insert data into Nocategory i.e " + g.toJson(staticNocategoryBO));
		
		return staticNocategoryModel.insertStaticNocategoryDetails(staticNocategoryBO);

	}

	@RequestMapping(value = "/updateStaticNocategoryDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticNocategoryDetails(@RequestBody StaticNocategoryBO staticNocategoryBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " update data into Nocategory i.e " + g.toJson(staticNocategoryBO));

		return staticNocategoryModel.updateStaticNocategoryDetails(staticNocategoryBO);
	}

	@RequestMapping(value = "/deleteStaticNocategoryDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticNocategoryDetails(@RequestBody StaticNocategoryBO staticNocategoryBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " delete data into Nocategory i.e " + g.toJson(staticNocategoryBO));

		return staticNocategoryModel.deleteStaticNocategoryDetails(staticNocategoryBO);
	}

}
