package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaticProductStyleBO;
import com.merilytics.dao.StaticProductStyleDAO;

@Configuration
public class StaticProductStyleModel {

	@Resource
	private StaticProductStyleDAO staticProductStyleDAO;

	public List<StaticProductStyleBO> getStaticProductStyleDetails() {

		List<StaticProductStyleBO> lisyt = staticProductStyleDAO.getStaticProductStyleDetails();

		int i = 1;
		for (StaticProductStyleBO staticMonthBO : lisyt) {
			staticMonthBO.setSlNumber(i);
			i++;
		}

		return lisyt;
	}

	public Boolean insertStaticProductStyleDetails(StaticProductStyleBO staticProductStyleBO) {

		return staticProductStyleDAO.insertStaticProductStyleDetails(staticProductStyleBO);
	}

	public Boolean updateStaticProductStyleDetails(StaticProductStyleBO staticProductStyleBO) {

		return staticProductStyleDAO.updateStaticProductStyleDetails(staticProductStyleBO);
	}

	public Boolean deleteStaticProductStyleDetails(StaticProductStyleBO staticProductStyleBO) {

		return staticProductStyleDAO.deleteStaticProductStyleDetails(staticProductStyleBO);
	}

}
