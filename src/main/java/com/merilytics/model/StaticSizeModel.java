package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaticSizeBO;
import com.merilytics.dao.StaticSizeDAO;

@Configuration
public class StaticSizeModel {

	@Resource
	private StaticSizeDAO staticSizeDAO;

	public List<StaticSizeBO> getStaticSizeDetails() {

		List<StaticSizeBO> lisyt = staticSizeDAO.getStaticSizeDetails();

		int i = 1;
		for (StaticSizeBO staticMonthBO : lisyt) {
			staticMonthBO.setSlNumber(i);
			i++;
		}

		return lisyt;

	}

	public Boolean insertStaticSizeBODetails(StaticSizeBO staiticCategoryBO) {

		return staticSizeDAO.insertStaticSizeBODetails(staiticCategoryBO);
	}

	public Boolean updateStaticSizeBODetails(StaticSizeBO staiticCategoryBO) {

		return staticSizeDAO.updateStaticSizeBODetails(staiticCategoryBO);
	}

	public Boolean deleteStaticSizeBODetails(StaticSizeBO staiticCategoryBO) {

		return staticSizeDAO.deleteStaticSizeBODetails(staiticCategoryBO);
	}

}
