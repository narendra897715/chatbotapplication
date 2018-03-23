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
import com.merilytics.bo.StaticNoseasonBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticNoseasonModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticNoseasonController {

	@Resource
	private StaticNoseasonModel staticNoseasonModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticNoseasonDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaticNoseasonBO> getStaticNoseasonDetails() {
		return staticNoseasonModel.getStaticNoseasonDetails();
	}

	@RequestMapping(value = "/insertStaticNoseasonDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticNoseasonDetails(@RequestBody StaticNoseasonBO staticNoseasonBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " insert data into Noseason i.e " + g.toJson(staticNoseasonBO));

		return staticNoseasonModel.insertStaticNoseasonDetails(staticNoseasonBO);

	}

	@RequestMapping(value = "/updateStaticNoseasonDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticNoseasonDetails(@RequestBody StaticNoseasonBO staticNoseasonBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " update data into Noseason i.e " + g.toJson(staticNoseasonBO));

		return staticNoseasonModel.updateStaticNoseasonDetails(staticNoseasonBO);
	}

	@RequestMapping(value = "/deleteStaticNoseasonDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticNoseasonDetails(@RequestBody StaticNoseasonBO staticNoseasonBO,
			HttpServletRequest request, HttpServletResponse response) {
		
		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " delete data into Noseason i.e " + g.toJson(staticNoseasonBO));

		return staticNoseasonModel.deleteStaticNoseasonDetails(staticNoseasonBO);
	}

}
