package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaiticCategoryBO;
import com.merilytics.bo.StaticCollarBO;
import com.merilytics.bo.StaticMonthBO;
import com.merilytics.dao.StaticCollarDAO;

@Configuration
public class StaticCollarModel {
	// StaticCollarBO

	@Resource
	private StaticCollarDAO staticCollarDAO;
	// StaticBottomriseBo

	public List<StaticCollarBO> getStaticCollarDetails() {
		
		List<StaticCollarBO> inputlist = staticCollarDAO.getStaticCollarDetails();
		int i = 1;
		for (StaticCollarBO staticCollarBO : inputlist) {
			staticCollarBO.setSlNumber(i);
			i++;
		}

		return inputlist;
		
	}
	
	public Boolean insertStaticCollarDetails(StaticCollarBO staticCollarBO) {

		return staticCollarDAO.insertStaticCollarDetails(staticCollarBO);
	}
	
	
	public Boolean updateStaticCollarDetails(StaticCollarBO staticCollarBO) {

		return staticCollarDAO.updateStaticCollarDetails(staticCollarBO);
	}
	public Boolean deleteStaticCollarDetails(StaticCollarBO staticCollarBO) {

		return staticCollarDAO.deleteStaticCollarDetails(staticCollarBO);
	}
	

}
