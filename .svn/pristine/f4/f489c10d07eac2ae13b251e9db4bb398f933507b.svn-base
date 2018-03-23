package com.merilytics.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaticProductTypeBO;
import com.merilytics.dao.StaticProductTypeDAO;

@Configuration
public class StaticProductTypeModel {

	@Autowired
	private StaticProductTypeDAO staticProductStyleDAO;

	public List<StaticProductTypeBO> getStaticStaticProductTypeDetails() {

		List<StaticProductTypeBO> lisyt = staticProductStyleDAO.getStaticStaticProductTypeDetails();

		int i = 1;
		for (StaticProductTypeBO staticMonthBO : lisyt) {
			staticMonthBO.setSlNumber(i);
			i++;
		}

		return lisyt;

	}

	public Boolean insertStaticStaticProductTypeDetails(StaticProductTypeBO staticProductTypeBO) {

		return staticProductStyleDAO.insertStaticStaticProductTypeDetails(staticProductTypeBO);
	}

	public Boolean updateStaticStaticProductTypeDetails(StaticProductTypeBO staticProductTypeBO) {

		return staticProductStyleDAO.updateStaticStaticProductTypeDetails(staticProductTypeBO);
	}

	public Boolean deleteStaticStaticProductTypeDetails(StaticProductTypeBO staticProductTypeBO) {

		return staticProductStyleDAO.deleteStaticStaticProductTypeDetails(staticProductTypeBO);
	}
}
