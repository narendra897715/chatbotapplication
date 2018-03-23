package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaticPatternBO;
import com.merilytics.dao.StaticPatternDAO;

@Configuration
public class StaticPatternModel {

	@Resource
	private StaticPatternDAO staticPatternDAO;

	public List<StaticPatternBO> getStaticOccasionDetails() {

		List<StaticPatternBO> lisyt = staticPatternDAO.getStaticPatternDetails();

		int i = 1;
		for (StaticPatternBO staticMonthBO : lisyt) {
			staticMonthBO.setSlNumber(i);
			i++;
		}

		return lisyt;

	}

	public Boolean insertStaticPatternDetails(StaticPatternBO staticPatternBO) {

		return staticPatternDAO.insertStaticPatternDetails(staticPatternBO);
	}

	public Boolean updateStaticPatternDetails(StaticPatternBO staticPatternBO) {

		return staticPatternDAO.updateStaticPatternDetails(staticPatternBO);
	}

	public Boolean deleteStaticPatternDetails(StaticPatternBO staticPatternBO) {

		return staticPatternDAO.deleteStaticPatternDetails(staticPatternBO);
	}

}
