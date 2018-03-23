package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaiticCategoryBO;
import com.merilytics.bo.StaticColorfamilyBO;
import com.merilytics.bo.StaticMonthBO;
import com.merilytics.dao.StaticColorfamilyDAO;

@Configuration
public class StaticColorfamilyModel {

	@Resource
	private StaticColorfamilyDAO staticColorfamilyDAO;

	public List<StaticColorfamilyBO> getStaticColorfamilyDetails() {
		List<StaticColorfamilyBO> inputlist = staticColorfamilyDAO.getStaticColorfamilyDetails();
		int i = 1;
		for (StaticColorfamilyBO staticColorfamilyBO : inputlist) {
			staticColorfamilyBO.setSlNumber(i);
			i++;
		}

		return inputlist;

		

	}

	public Boolean insertStaticColorfamilyDetails(StaticColorfamilyBO staticColorfamilyBO) {

		return staticColorfamilyDAO.insertStaticColorfamilyDetails(staticColorfamilyBO);
	}
	public Boolean updateStaticColorfamilyDetails(StaticColorfamilyBO staticColorfamilyBO) {

		return staticColorfamilyDAO.updateStaticColorfamilyDetails(staticColorfamilyBO);
	}
	public Boolean deleteStaticColorfamilyDetails(StaticColorfamilyBO staticColorfamilyBO) {

		return staticColorfamilyDAO.deleteStaticColorfamilyDetails(staticColorfamilyBO);
	}
}
