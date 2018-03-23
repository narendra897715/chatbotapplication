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
import com.merilytics.bo.StaticSubCategoryBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticSubCategoryModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticSubCategoryController {

	@Resource
	private StaticSubCategoryModel staticSubCategoryModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticSubCategoryDetails", method = RequestMethod.POST)
	public @ResponseBody List<StaticSubCategoryBO> getStaticSubCategoryDetails(@RequestBody Integer category) {
		System.out.println(category + "in");
		return staticSubCategoryModel.getStaticSubCategoryDetails(category);
	}

	@RequestMapping(value = "/getSubCategoryDetailsDatabase", method = RequestMethod.GET)
	public @ResponseBody List<Map<String, Object>> getSubCategoryDetailsDatabase() {
		return staticSubCategoryModel.getSubCategoryDetailsDatabase();
	}

	@RequestMapping(value = "/insertStaticSubCategoryDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticSubCategoryDetails(@RequestBody StaticSubCategoryBO staticSubCategoryBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " inserted data into  sub-Category i.e " + g.toJson(staticSubCategoryBO));

		return staticSubCategoryModel.insertStaticSubCategoryDetails(staticSubCategoryBO);

	}

	@RequestMapping(value = "/updateStaticSubCategoryDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticSubCategoryDetails(@RequestBody StaticSubCategoryBO staticSubCategoryBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " updated data into  sub-Category i.e " + g.toJson(staticSubCategoryBO));

		return staticSubCategoryModel.updateStaticSubCategoryDetails(staticSubCategoryBO);
	}

	@RequestMapping(value = "/deleteStaticSubCategoryDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticSubCategoryDetails(@RequestBody StaticSubCategoryBO staticSubCategoryBO,
			HttpServletRequest request, HttpServletResponse response) {
		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " deleted data into  sub-Category i.e " + g.toJson(staticSubCategoryBO));

		return staticSubCategoryModel.deleteStaticSubCategoryDetails(staticSubCategoryBO);
	}

}
