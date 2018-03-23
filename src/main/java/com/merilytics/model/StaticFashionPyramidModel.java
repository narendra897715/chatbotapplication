package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaticFashionPyramidBO;
import com.merilytics.dao.StaticFashionPyramidDAO;

@Configuration
public class StaticFashionPyramidModel {

	@Resource
	private StaticFashionPyramidDAO staticFashionPyramidDAO;

	public List<StaticFashionPyramidBO> getStaticFashionPyramidDetails() {

		List<StaticFashionPyramidBO> lisyt = staticFashionPyramidDAO.getStaticFashionPyramidDetails();

		int i = 1;
		for (StaticFashionPyramidBO staticMonthBO : lisyt) {
			staticMonthBO.setSlNumber(i);
			i++;
		}

		return lisyt;

	}

	public Boolean insertStaticFashionPyramidDetails(StaticFashionPyramidBO staticFashionPyramidBO) {

		return staticFashionPyramidDAO.insertStaticFashionPyramidDetails(staticFashionPyramidBO);
	}

	public Boolean updateStaticFashionPyramidDetails(StaticFashionPyramidBO staticFashionPyramidBO) {

		return staticFashionPyramidDAO.updateStaticFashionPyramidDetails(staticFashionPyramidBO);
	}

	public Boolean deleteStaticFashionPyramidDetails(StaticFashionPyramidBO staticFashionPyramidBO) {

		return staticFashionPyramidDAO.deleteStaticFashionPyramidDetails(staticFashionPyramidBO);
	}

}
