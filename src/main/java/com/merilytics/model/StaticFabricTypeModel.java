package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaticFabrictypeBO;
import com.merilytics.dao.StaticFabricTypeDAO;

@Configuration
public class StaticFabricTypeModel {

	@Resource
	private StaticFabricTypeDAO staticFabricTypeDAO;

	public List<StaticFabrictypeBO> getStaticFabrictypeDetails() {

		List<StaticFabrictypeBO> lisyt = staticFabricTypeDAO.getStaticFabrictypeDetails();

		int i = 1;
		for (StaticFabrictypeBO staticMonthBO : lisyt) {
			staticMonthBO.setSlNumber(i);
			i++;
		}

		return lisyt;

	}

	public Boolean insertStaticFabrictypeDetails(StaticFabrictypeBO staticFabrictypeBO) {

		return staticFabricTypeDAO.insertStaticFabrictypeDetails(staticFabrictypeBO);
	}

	public Boolean updateStaticFabrictypeDetails(StaticFabrictypeBO staticFabrictypeBO) {

		return staticFabricTypeDAO.updateStaticFabrictypeDetails(staticFabrictypeBO);
	}

	public Boolean deleteStaticFabrictypeDetails(StaticFabrictypeBO staticFabrictypeBO) {

		return staticFabricTypeDAO.deleteStaticFabrictypeDetails(staticFabrictypeBO);
	}

}
