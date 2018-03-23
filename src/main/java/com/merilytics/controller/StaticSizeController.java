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
import com.merilytics.bo.StaticSizeBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticSizeModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticSizeController {

	@Resource
	private StaticSizeModel staticSizeModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticSizeDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaticSizeBO> getStaticSizeDetails() {
		return staticSizeModel.getStaticSizeDetails();
	}

	@RequestMapping(value = "/updateStaticSizeBODetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticSizeBODetails(@RequestBody StaticSizeBO staiticCategoryBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " updated data into  Size i.e " + g.toJson(staiticCategoryBO));

		return staticSizeModel.updateStaticSizeBODetails(staiticCategoryBO);

	}

	@RequestMapping(value = "/insertStaticSizeBODetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticSizeBODetails(@RequestBody StaticSizeBO staiticCategoryBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " inserted data into  Size i.e " + g.toJson(staiticCategoryBO));

		return staticSizeModel.insertStaticSizeBODetails(staiticCategoryBO);
	}

	@RequestMapping(value = "/deleteStaticSizeBODetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticSizeBODetails(@RequestBody StaticSizeBO staiticCategoryBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " deleted data into  Size i.e " + g.toJson(staiticCategoryBO));

		return staticSizeModel.deleteStaticSizeBODetails(staiticCategoryBO);

	}

}
