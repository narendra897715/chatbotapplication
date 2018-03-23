package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaiticCategoryBO;
import com.merilytics.bo.StaticFabricationBO;
import com.merilytics.bo.StaticMonthBO;
import com.merilytics.dao.StaticFabricationDAO;

@Configuration
public class StaticFabricationModel {

	@Resource
	private StaticFabricationDAO staticFabricationDAO;

	public List<StaticFabricationBO> getStaticFabricationDetails() {
		
		List<StaticFabricationBO> inputlist = staticFabricationDAO.getStaticFabricationDetails();
		int i = 1;
		for (StaticFabricationBO staticFabricationBO : inputlist) {
			staticFabricationBO.setSlNumber(i);
			i++;
		}

		return inputlist;

		

	}

	public Boolean insertStaticFabricationDetails(StaticFabricationBO staticFabricationBO) {

		return staticFabricationDAO.insertStaticFabricationDetails(staticFabricationBO);
	}
	
	public Boolean updateStaticFabricationDetails(StaticFabricationBO staticFabricationBO) {

		return staticFabricationDAO.updateStaticFabricationDetails(staticFabricationBO);
	}
	
	public Boolean deleteStaticFabricationDetails(StaticFabricationBO staticFabricationBO) {

		return staticFabricationDAO.deleteStaticFabricationDetails(staticFabricationBO);
	}
	

}
