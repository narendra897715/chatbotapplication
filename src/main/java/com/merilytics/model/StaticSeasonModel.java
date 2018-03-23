package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaticSeasonBO;
import com.merilytics.dao.StaticSeasonDAO;

@Configuration
public class StaticSeasonModel {

	@Resource
	private StaticSeasonDAO staticSeasonDAO;

	public List<StaticSeasonBO> getStaticSeasonDetails() {

		List<StaticSeasonBO> lisyt = staticSeasonDAO.getStaticSeasonDetails();

		int i = 1;
		for (StaticSeasonBO staticMonthBO : lisyt) {
			staticMonthBO.setSlNumber(i);
			i++;
		}

		return lisyt;

	}

	public Boolean insertStaticSeasonDetails(StaticSeasonBO staticSeasonBO) {

		return staticSeasonDAO.insertStaticSeasonDetails(staticSeasonBO);
	}

	public Boolean updateStaticSeasonDetails(StaticSeasonBO staticSeasonBO) {

		return staticSeasonDAO.updateStaticSeasonDetails(staticSeasonBO);
	}

	public Boolean deleteStaticSeasonDetails(StaticSeasonBO staticSeasonBO) {

		return staticSeasonDAO.deleteStaticSeasonDetails(staticSeasonBO);
	}

}
