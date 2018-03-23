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
import com.merilytics.bo.StaticShadeBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticShadeModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticShadeController {

	@Resource
	private StaticShadeModel staticShadeModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticShadeDetails", method = RequestMethod.POST)
	public @ResponseBody List<StaticShadeBO> getStaticShadeDetails(@RequestBody Integer variant) {
		System.out.println(variant);
		return staticShadeModel.getStaticShadeDetails(variant);
	}

	@RequestMapping(value = "/insertStaticShadeDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticShadeDetails(@RequestBody StaticShadeBO staticShadeBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " inserted data into Shade i.e " + g.toJson(staticShadeBO));

		return staticShadeModel.insertStaticShadeDetails(staticShadeBO);

	}

	@RequestMapping(value = "/updateStaticShadeDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticShadeDetails(@RequestBody StaticShadeBO staticShadeBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " updated data into Shade i.e " + g.toJson(staticShadeBO));

		return staticShadeModel.updateStaticShadeDetails(staticShadeBO);
	}

	@RequestMapping(value = "/deleteStaticShadeDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticShadeDetails(@RequestBody StaticShadeBO staticShadeBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " deleted data into Shade i.e " + g.toJson(staticShadeBO));

		return staticShadeModel.deleteStaticShadeDetails(staticShadeBO);
	}

}
