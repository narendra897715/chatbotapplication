package com.merilytics.model;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaiticCategoryBO;
import com.merilytics.bo.StaticMonthBO;
import com.merilytics.dao.StaiticCategoryDAO;

@Configuration
public class StaiticCategoryModel {

	@Resource
	private StaiticCategoryDAO staiticCategoryDAO;

	public List<StaiticCategoryBO> getStaiticCategoryDetails() {
		List<StaiticCategoryBO> inputlist = staiticCategoryDAO.getStaiticCategoryDetails();
		int i = 1;
		for (StaiticCategoryBO staiticCategoryBO : inputlist) {
			staiticCategoryBO.setSlNumber(i);
			i++;
		}
		return inputlist;
	}

	public Boolean insertstaiticCategoryDetails(StaiticCategoryBO staiticCategoryBO) {

		return staiticCategoryDAO.insertstaiticCategoryDetails(staiticCategoryBO);
	}
	
	public Boolean updateStaticCategoryDetails(StaiticCategoryBO staiticCategoryBO) {

		return staiticCategoryDAO.updateStaticCategoryDetails(staiticCategoryBO);
	}
	
	public Boolean deleteStaticCategoryDetails(StaiticCategoryBO staiticCategoryBO) {

		return staiticCategoryDAO.deleteStaticCategoryDetails(staiticCategoryBO);
	}
	
	
	

}
