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
import com.merilytics.bo.StaticNocategoryCodeBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticNocategoryCodeModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticNocategoryCodeController {

	@Resource
	private StaticNocategoryCodeModel staticNocategoryCodeModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticNocategoryCodeDetails", method = RequestMethod.POST)
	public @ResponseBody List<?> getStaticNocategoryDetails(@RequestBody Integer nOCategoryID) {
		return staticNocategoryCodeModel.getStaticNocategoryDetails(nOCategoryID);
	}

	@RequestMapping(value = "/insertStaticNocategoryCodeDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticNocategoryCodeDetails(
			@RequestBody StaticNocategoryCodeBO staticNocategoryCodeBO, HttpServletRequest request,
			HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " insert data into NocategoryCode i.e " + g.toJson(staticNocategoryCodeBO));

		return staticNocategoryCodeModel.insertStaticNocategoryCodeDetails(staticNocategoryCodeBO);

	}

	@RequestMapping(value = "/updateStaticNocategoryCodeDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticNocategoryCodeDetails(
			@RequestBody StaticNocategoryCodeBO staticNocategoryCodeBO, HttpServletRequest request,
			HttpServletResponse response) {
		String name = tokenValidator.isToken(request.getHeader("token"), request, response);
		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " update data into NocategoryCode i.e " + g.toJson(staticNocategoryCodeBO));

		return staticNocategoryCodeModel.updateStaticNocategoryCodeDetails(staticNocategoryCodeBO);
	}

	@RequestMapping(value = "/deleteStaticNocategoryCodeDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticNocategoryCodeDetails(
			@RequestBody StaticNocategoryCodeBO staticNocategoryCodeBO, HttpServletRequest request,
			HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " update data into NocategoryCode i.e " + g.toJson(staticNocategoryCodeBO));

		return staticNocategoryCodeModel.deleteStaticNocategoryCodeDetails(staticNocategoryCodeBO);
	}

	@RequestMapping(value = "/getNocategoryCode", method = RequestMethod.GET)
	public @ResponseBody List<?> getNocategoryCode() {
		return staticNocategoryCodeModel.getNocategoryCode();
	}

}
