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
import com.merilytics.bo.StaiticCategoryBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaiticCategoryModel;
import com.merilytics.util.Loggers;

@Controller
public class StaiticCategoryController {

	@Resource
	private StaiticCategoryModel staiticCategoryModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaiticCategoryDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaiticCategoryBO> getItemMasterDetails() {
		return staiticCategoryModel.getStaiticCategoryDetails();
	}

	@RequestMapping(value = "/insertStaticCategoryDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticCategory(@RequestBody StaiticCategoryBO staiticCategoryBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);
		
		Gson g = new Gson();
		
		Loggers.INFO_lOGGER.info(name + " insert data into Category i.e " + g.toJson(staiticCategoryBO));

		return staiticCategoryModel.insertstaiticCategoryDetails(staiticCategoryBO);

	}

	@RequestMapping(value = "/updateStaticCategoryDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticCategoryDetails(@RequestBody StaiticCategoryBO staiticCategoryBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);
		
		Gson g = new Gson();
		
		Loggers.INFO_lOGGER.info(name + " Update data  into Category i.e " +  g.toJson(staiticCategoryBO));

		return staiticCategoryModel.updateStaticCategoryDetails(staiticCategoryBO);
	}

	@RequestMapping(value = "/deleteStaticCategoryDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticCategoryDetails(@RequestBody StaiticCategoryBO staiticCategoryBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);
		
		Gson g = new Gson();
		
		Loggers.INFO_lOGGER.info(name + " Delete data  into Category i.e " +  g.toJson(staiticCategoryBO));

		return staiticCategoryModel.deleteStaticCategoryDetails(staiticCategoryBO);
	}

}
