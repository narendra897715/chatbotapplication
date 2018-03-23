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
import com.merilytics.bo.StaticNOSizeBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticNoSizeModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticNoSizeController {

	@Resource
	private StaticNoSizeModel staticNoSizeModel;
	
	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticNoSizeDetails", method = RequestMethod.POST)
	public @ResponseBody List<StaticNOSizeBO> getStaticNoSizeDetails(@RequestBody Integer pkSizeID) {
		return staticNoSizeModel.getStaticNoSizeDetails(pkSizeID);
	}

	@RequestMapping(value = "/getStaticNoSizeDetailsDatabase", method = RequestMethod.GET)
	public @ResponseBody List<Map<String, Object>> getStaticNoSizeDetailsDatabase() {
		return staticNoSizeModel.getStaticNoSizeDetailsDatabase();
	}

	@RequestMapping(value = "/updateStaticNOSizeBODetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticSizeBODetails(@RequestBody StaticNOSizeBO staiticCategoryBO,
			HttpServletRequest request, HttpServletResponse response) {
		
		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " update data into NoSize i.e " + g.toJson(staiticCategoryBO));
		
		return staticNoSizeModel.updateStaticSizeBODetails(staiticCategoryBO);

	}

	@RequestMapping(value = "/insertStaticNOSizeBODetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticSizeBODetails(@RequestBody StaticNOSizeBO staiticCategoryBO,
			HttpServletRequest request, HttpServletResponse response) {
		
		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " insert data into NoSize i.e " + g.toJson(staiticCategoryBO));
		
		return staticNoSizeModel.insertStaticSizeBODetails(staiticCategoryBO);
	}

	@RequestMapping(value = "/deleteStaticNOSizeBODetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticSizeBODetails(@RequestBody StaticNOSizeBO staiticCategoryBO,
			HttpServletRequest request, HttpServletResponse response) {
		
		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " delete data into NoSize i.e " + g.toJson(staiticCategoryBO));
		
		return staticNoSizeModel.deleteStaticSizeBODetails(staiticCategoryBO);

	}

}
