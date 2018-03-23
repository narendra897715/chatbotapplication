package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaticScaleBO;
import com.merilytics.dao.StaticScaleDAO;

@Configuration
public class StaticScaleModel {

	@Resource
	private StaticScaleDAO staticScaleDAO;

	public List<StaticScaleBO> getStaticScaleDetails() {

		List<StaticScaleBO> lisyt = staticScaleDAO.getStaticScaleDetails();

		int i = 1;
		for (StaticScaleBO staticMonthBO : lisyt) {
			staticMonthBO.setSlNumber(i);
			i++;
		}

		return lisyt;

	}

	public Boolean insertStaticScaleDetails(StaticScaleBO staticScaleBO) {

		return staticScaleDAO.insertStaticScaleDetails(staticScaleBO);
	}

	public Boolean updateStaticScaleDetails(StaticScaleBO staticScaleBO) {

		return staticScaleDAO.updateStaticScaleDetails(staticScaleBO);
	}

	public Boolean deleteStaticScaleDetails(StaticScaleBO staticScaleBO) {

		return staticScaleDAO.deleteStaticScaleDetails(staticScaleBO);
	}

}
