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
import com.merilytics.bo.StaticProductTypeBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticProductTypeModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticProductTypeController {

	@Resource
	private StaticProductTypeModel staticProductTypeModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticStaticProductTypeDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaticProductTypeBO> getStaticStaticProductTypeDetails() {

		return staticProductTypeModel.getStaticStaticProductTypeDetails();
	}

	@RequestMapping(value = "/insertStaticStaticProductTypeDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticStaticProductTypeDetails(
			@RequestBody StaticProductTypeBO staticProductTypeBO, HttpServletRequest request,
			HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " inserted data into Product Type  i.e " + g.toJson(staticProductTypeBO));

		return staticProductTypeModel.insertStaticStaticProductTypeDetails(staticProductTypeBO);

	}

	@RequestMapping(value = "/updateStaticStaticProductTypeDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticStaticProductTypeDetails(
			@RequestBody StaticProductTypeBO staticProductTypeBO, HttpServletRequest request,
			HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " updated data into Product Type  i.e " + g.toJson(staticProductTypeBO));

		return staticProductTypeModel.updateStaticStaticProductTypeDetails(staticProductTypeBO);
	}

	@RequestMapping(value = "/deleteStaticStaticProductTypeDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticStaticProductTypeDetails(
			@RequestBody StaticProductTypeBO staticProductTypeBO, HttpServletRequest request,
			HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " deleted data into Product Type  i.e " + g.toJson(staticProductTypeBO));

		return staticProductTypeModel.deleteStaticStaticProductTypeDetails(staticProductTypeBO);
	}

}
