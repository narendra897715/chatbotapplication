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
import com.merilytics.bo.StaticCollectionBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticCollectionModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticCollectionController {

	@Resource
	private TokenValidator tokenValidator;

	@Resource
	private StaticCollectionModel staticCollectionModel;

	@RequestMapping(value = "/getStaticCollectionDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaticCollectionBO> getStaticCollectionDetails() {
		return staticCollectionModel.getStaticCollectionDetails();
	}

	@RequestMapping(value = "/insertStaticCollectionDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticCollectionDetails(@RequestBody StaticCollectionBO staticCollectionBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);
		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " insert data into Collection i.e " + g.toJson(staticCollectionBO));

		return staticCollectionModel.insertStaticCollectionDetails(staticCollectionBO);

	}

	@RequestMapping(value = "/updateStaticCollectionDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticCollectionDetails(@RequestBody StaticCollectionBO staticCollectionBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);
		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " update data into Collection i.e " + g.toJson(staticCollectionBO));

		return staticCollectionModel.updateStaticCollectionDetails(staticCollectionBO);
	}

	@RequestMapping(value = "/deleteStaticCollectionDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticCollectionDetails(@RequestBody StaticCollectionBO staticCollectionBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);
		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " delete data into Collection i.e " + g.toJson(staticCollectionBO));

		return staticCollectionModel.deleteStaticCollectionDetails(staticCollectionBO);
	}

}
