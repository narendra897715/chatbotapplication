package com.merilytics.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.merilytics.bo.StaticYearBO;
import com.merilytics.model.StaticYearModel;

@Controller
public class StaticYearController {
	@Resource
	private StaticYearModel staticYearModel;

	@RequestMapping(value = "/getStaticYear", method = RequestMethod.GET)
	public @ResponseBody List<StaticYearBO> getStaticMonth() {
		return staticYearModel.getStaticYear();
	}
}
