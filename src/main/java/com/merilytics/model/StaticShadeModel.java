package com.merilytics.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaiticCategoryBO;
import com.merilytics.bo.StaticShadeBO;
import com.merilytics.dao.StaticShadeDAO;

@Configuration
public class StaticShadeModel {

	@Autowired
	private StaticShadeDAO staticShadeDAO;

	public List<StaticShadeBO> getStaticShadeDetails(Integer variant) {

		return staticShadeDAO.getStaticShadeDetails(variant);

	}
	
	public Boolean insertStaticShadeDetails(StaticShadeBO staticShadeBO) {

		return staticShadeDAO.insertStaticShadeDetails(staticShadeBO);
	}
	
	public Boolean updateStaticShadeDetails(StaticShadeBO staticShadeBO) {

		return staticShadeDAO.updateStaticShadeDetails(staticShadeBO);
	}
	
	public Boolean deleteStaticShadeDetails(StaticShadeBO staticShadeBO) {

		return staticShadeDAO.deleteStaticShadeDetails(staticShadeBO);
	}

}
