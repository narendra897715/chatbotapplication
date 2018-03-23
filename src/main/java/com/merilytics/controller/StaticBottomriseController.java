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
import com.merilytics.bo.StaticBottomriseBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.StaticBottomriseModel;
import com.merilytics.util.Loggers;

@Controller
public class StaticBottomriseController {

	// StaticBottomriseBo

	@Resource
	private StaticBottomriseModel staticBottomriseModel;

	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/getStaticBottomriseDetails", method = RequestMethod.GET)
	public @ResponseBody List<StaticBottomriseBO> getStaticBottomriseDetails() {
		return staticBottomriseModel.getStaticBottomriseDetails();
	}

	@RequestMapping(value = "/insertStaticBottomriseDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean insertStaticBottomriseDetails(@RequestBody StaticBottomriseBO staticBottomriseBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		Gson g = new Gson();

		Loggers.INFO_lOGGER.info(name + " insert data into Category i.e " + g.toJson(staticBottomriseBO));

		return staticBottomriseModel.insertStaticBottomriseDetails(staticBottomriseBO);

	}

	@RequestMapping(value = "/updateStaticBottomriseDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean updateStaticBottomriseDetails(@RequestBody StaticBottomriseBO staticBottomriseBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);
		
		Gson g = new Gson();
		
		
		Loggers.INFO_lOGGER.info(name + " update data into Category i.e " + g.toJson(staticBottomriseBO));

		return staticBottomriseModel.updateStaticBottomriseDetails(staticBottomriseBO);
	}

	@RequestMapping(value = "/deleteStaticBottomriseDetails", method = RequestMethod.POST)
	public @ResponseBody Boolean deleteStaticBottomriseDetails(@RequestBody StaticBottomriseBO staticBottomriseBO,
			HttpServletRequest request, HttpServletResponse response) {

		String name = tokenValidator.isToken(request.getHeader("token"), request, response);
		
		Gson g = new Gson();
		
		Loggers.INFO_lOGGER.info(name + " delete data into Category i.e " + g.toJson(staticBottomriseBO));

		return staticBottomriseModel.deleteStaticBottomriseDetails(staticBottomriseBO);
	}

}
