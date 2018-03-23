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
import com.merilytics.bo.StaticFashionPyramidBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticFashionPyramidModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticFashionPyramidController {

	@Resource
	private TokenValidator tokenValidator;

	@Resource
	private StaticFashionPyramidModel staticFashionPyramidModel;

	@RequestMapping(value = "/getStaticFashionPyramidDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaticFashionPyramidBO> getStaticFashionPyramidDetails() {
		return staticFashionPyramidModel.getStaticFashionPyramidDetails();
	}

	@RequestMapping(value = "/insertStaticFashionPyramidDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticFashionPyramidDetails(
			@RequestBody StaticFashionPyramidBO staticFashionPyramidBO, HttpServletRequest request,
			HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " insert data into FashionPyramid i.e " + g.toJson(staticFashionPyramidBO));

		return staticFashionPyramidModel.insertStaticFashionPyramidDetails(staticFashionPyramidBO);

	}

	@RequestMapping(value = "/updateStaticFashionPyramidDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticFashionPyramidDetails(
			@RequestBody StaticFashionPyramidBO staticFashionPyramidBO, HttpServletRequest request,
			HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " update data into FashionPyramid i.e " + g.toJson(staticFashionPyramidBO));

		return staticFashionPyramidModel.updateStaticFashionPyramidDetails(staticFashionPyramidBO);
	}

	@RequestMapping(value = "/deleteStaticFashionPyramidDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticFashionPyramidDetails(
			@RequestBody StaticFashionPyramidBO staticFashionPyramidBO, HttpServletRequest request,
			HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " delete data into FashionPyramid i.e " + g.toJson(staticFashionPyramidBO));

		return staticFashionPyramidModel.deleteStaticFashionPyramidDetails(staticFashionPyramidBO);
	}

}
