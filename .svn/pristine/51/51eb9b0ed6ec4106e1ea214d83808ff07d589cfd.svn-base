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
import com.merilytics.bo.StaticShopifySizeBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticShopifySizeModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticShopifySizeController {

	@Resource
	private StaticShopifySizeModel staticShopifySizeModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticShopifySizeDetails", method = RequestMethod.POST)
	public @ResponseBody List<StaticShopifySizeBO> getStaticShopifySizeDetails(@RequestBody Integer pkSizeID) {
		return staticShopifySizeModel.getStaticNoSizeDetails(pkSizeID);
	}

	@RequestMapping(value = "/getStaticShopifySizeDetailsDatabase", method = RequestMethod.GET)
	public @ResponseBody List<Map<String, Object>> getStaticShopifySizeDetailsDatabase() {
		return staticShopifySizeModel.getStaticShopifySizeDetailsDatabase();
	}

	@RequestMapping(value = "/updateStaticShopifySizeBODetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticSizeBODetails(@RequestBody StaticShopifySizeBO staiticCategoryBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " updated data into Shopify Size i.e " + g.toJson(staiticCategoryBO));

		return staticShopifySizeModel.updateStaticSizeBODetails(staiticCategoryBO);

	}

	@RequestMapping(value = "/insertStaticShopifySizeBODetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticSizeBODetails(@RequestBody StaticShopifySizeBO staiticCategoryBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " inserted data into Shopify Size i.e " + g.toJson(staiticCategoryBO));

		return staticShopifySizeModel.insertStaticSizeBODetails(staiticCategoryBO);
	}

	@RequestMapping(value = "/deleteStaticShopifySizeBODetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticSizeBODetails(@RequestBody StaticShopifySizeBO staiticCategoryBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " deleted data into Shopify Size i.e " + g.toJson(staiticCategoryBO));

		return staticShopifySizeModel.deleteStaticSizeBODetails(staiticCategoryBO);

	}

}
