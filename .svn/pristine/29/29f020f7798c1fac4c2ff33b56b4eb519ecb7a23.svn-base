package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaticOccasionBO;
import com.merilytics.dao.StaticOccasionDAO;

@Configuration
public class StaticOccasionModel {

	@Resource
	private StaticOccasionDAO staticOccasionDAO;

	public List<StaticOccasionBO> getStaticOccasionDetails() {

		List<StaticOccasionBO> lisyt = staticOccasionDAO.getStaticOccasionDetails();

		int i = 1;
		for (StaticOccasionBO staticMonthBO : lisyt) {
			staticMonthBO.setSlNumber(i);
			i++;
		}

		return lisyt;

	}

	public Boolean insertStaticOccasionDetails(StaticOccasionBO staticOccasionBO) {

		return staticOccasionDAO.insertStaticOccasionDetails(staticOccasionBO);
	}

	public Boolean updateStaticOccasionDetails(StaticOccasionBO staticOccasionBO) {

		return staticOccasionDAO.updateStaticOccasionDetails(staticOccasionBO);
	}

	public Boolean deleteStaticOccasionDetails(StaticOccasionBO staticOccasionBO) {

		return staticOccasionDAO.deleteStaticOccasionDetails(staticOccasionBO);
	}

}
