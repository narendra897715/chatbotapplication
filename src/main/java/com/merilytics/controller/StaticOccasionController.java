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
import com.merilytics.bo.StaticOccasionBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticNoSizeModel;
import com.merilytics.model.StaticOccasionModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticOccasionController {

	@Resource
	private StaticNoSizeModel staticNoSizeModel;

	@Resource
	private StaticOccasionModel staticOccasionModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticOccasionDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaticOccasionBO> getStaticOccasionDetails() {
		return staticOccasionModel.getStaticOccasionDetails();
	}

	@RequestMapping(value = "/insertStaticOccasionDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticOccasionDetails(@RequestBody StaticOccasionBO staticOccasionBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " insert data into Occasion i.e " + g.toJson(staticOccasionBO));

		return staticOccasionModel.insertStaticOccasionDetails(staticOccasionBO);

	}

	@RequestMapping(value = "/updateStaticOccasionDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticOccasionDetails(@RequestBody StaticOccasionBO staticOccasionBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " update data into Occasion i.e " + g.toJson(staticOccasionBO));

		return staticOccasionModel.updateStaticOccasionDetails(staticOccasionBO);
	}

	@RequestMapping(value = "/deleteStaticOccasionDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticOccasionDetails(@RequestBody StaticOccasionBO staticOccasionBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " delete data into Occasion i.e " + g.toJson(staticOccasionBO));

		return staticOccasionModel.deleteStaticOccasionDetails(staticOccasionBO);
	}

}
