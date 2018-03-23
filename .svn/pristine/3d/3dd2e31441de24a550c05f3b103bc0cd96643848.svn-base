package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaticYearBO;
import com.merilytics.dao.StaticYearDAO;

@Configuration
public class StaticYearModel {
	@Resource
	private StaticYearDAO staticYearDAO;

	public List<StaticYearBO> getStaticYear() {

		return staticYearDAO.getStaticYear();

	}


}
