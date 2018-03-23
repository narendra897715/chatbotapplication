package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaticNocategoryBO;
import com.merilytics.dao.StaticNocategoryDAO;

@Configuration
public class StaticNocategoryModel {

	@Resource
	private StaticNocategoryDAO staticNocategoryDAO;

	public List<StaticNocategoryBO> getStaticNocategoryDetails() {

		List<StaticNocategoryBO> lisyt = staticNocategoryDAO.getStaticNocategoryDetails();

		int i = 1;
		for (StaticNocategoryBO staticMonthBO : lisyt) {
			staticMonthBO.setSlNumber(i);
			i++;
		}

		return lisyt;

	}

	public Boolean insertStaticNocategoryDetails(StaticNocategoryBO staticNocategoryBO) {

		return staticNocategoryDAO.insertStaticNocategoryDetails(staticNocategoryBO);
	}

	public Boolean updateStaticNocategoryDetails(StaticNocategoryBO staticNocategoryBO) {

		return staticNocategoryDAO.updateStaticNocategoryDetails(staticNocategoryBO);
	}

	public Boolean deleteStaticNocategoryDetails(StaticNocategoryBO staticNocategoryBO) {

		return staticNocategoryDAO.deleteStaticNocategoryDetails(staticNocategoryBO);
	}

}
