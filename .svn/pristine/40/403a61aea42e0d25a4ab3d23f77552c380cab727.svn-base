package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaticNoseasonBO;
import com.merilytics.dao.StaticNoseasonDAO;

@Configuration
public class StaticNoseasonModel {

	@Resource
	private StaticNoseasonDAO staticNoseasonDAO;

	public List<StaticNoseasonBO> getStaticNoseasonDetails() {

		List<StaticNoseasonBO> lisyt = staticNoseasonDAO.getStaticNoseasonDetails();

		int i = 1;
		for (StaticNoseasonBO staticMonthBO : lisyt) {
			staticMonthBO.setSlNumber(i);
			i++;
		}

		return lisyt;

	}

	public Boolean insertStaticNoseasonDetails(StaticNoseasonBO StaticNoseasonBO) {

		return staticNoseasonDAO.insertStaticNoseasonDetails(StaticNoseasonBO);
	}

	public Boolean updateStaticNoseasonDetails(StaticNoseasonBO staticNoseasonBO) {

		return staticNoseasonDAO.updateStaticCategoryDetails(staticNoseasonBO);
	}

	public Boolean deleteStaticNoseasonDetails(StaticNoseasonBO staticNoseasonBO) {

		return staticNoseasonDAO.deleteStaticNoseasonDetails(staticNoseasonBO);
	}

}
