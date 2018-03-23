package com.merilytics.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaticNOSizeBO;
import com.merilytics.dao.StaticNoSizeDAO;

@Configuration
public class StaticNoSizeModel {

	@Autowired
	private StaticNoSizeDAO staticSizeDAO;

	public List<StaticNOSizeBO> getStaticNoSizeDetails(Integer pkSizeID) {

		return staticSizeDAO.getStaticNoSizeDetails(pkSizeID);
	}

	public List<Map<String, Object>> getStaticNoSizeDetailsDatabase() {

		return staticSizeDAO.getStaticNoSizeDetailsDatabase();
	}

	public Boolean insertStaticSizeBODetails(StaticNOSizeBO staiticCategoryBO) {

		return staticSizeDAO.insertStaticSizeBODetails(staiticCategoryBO);
	}

	public Boolean updateStaticSizeBODetails(StaticNOSizeBO staiticCategoryBO) {

		return staticSizeDAO.updateStaticSizeBODetails(staiticCategoryBO);
	}

	public Boolean deleteStaticSizeBODetails(StaticNOSizeBO staiticCategoryBO) {

		return staticSizeDAO.deleteStaticSizeBODetails(staiticCategoryBO);
	}

}
