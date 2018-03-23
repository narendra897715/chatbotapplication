package com.merilytics.model;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaiticCategoryBO;
import com.merilytics.bo.StaticSubCategoryBO;
import com.merilytics.dao.StaticSubCategoryDAO;

@Configuration
public class StaticSubCategoryModel {

	@Resource
	private StaticSubCategoryDAO staticSubCategoryDAO;

	public List<StaticSubCategoryBO> getStaticSubCategoryDetails(Integer category) {

		return staticSubCategoryDAO.getStaticSubCategoryDetails(category);

	}

	public List<Map<String, Object>> getSubCategoryDetailsDatabase() {

		return staticSubCategoryDAO.getSubCategoryDetailsDatabase();

	}
	public Boolean insertStaticSubCategoryDetails(StaticSubCategoryBO staticSubCategoryBO) {

		return staticSubCategoryDAO.insertStaticSubCategoryDetails(staticSubCategoryBO);
	}
	
	public Boolean updateStaticSubCategoryDetails(StaticSubCategoryBO staticSubCategoryBO) {

		return staticSubCategoryDAO.updateStaticSubCategoryDetails(staticSubCategoryBO);
	}
	
	public Boolean deleteStaticSubCategoryDetails(StaticSubCategoryBO staticSubCategoryBO) {

		return staticSubCategoryDAO.deleteStaticSubCategoryDetails(staticSubCategoryBO);
	}

}
