package com.merilytics.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.merilytics.bo.StaticMonthBO;
import com.merilytics.model.StaticMonthModel;

@Controller
public class StaiticMonthController {

	@Resource
	private StaticMonthModel staticMonthModel;

	@RequestMapping(value = "/getStaticMonth", method = RequestMethod.GET)
	public @ResponseBody List<StaticMonthBO> getStaticMonth() {
		return staticMonthModel.getStaticMonth();
	}

}
