package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaiticCategoryBO;
import com.merilytics.bo.StaticBottomriseBO;
import com.merilytics.bo.StaticMonthBO;
import com.merilytics.dao.StaticBottomriseDAO;

@Configuration
public class StaticBottomriseModel {

	@Resource
	private StaticBottomriseDAO staticBottomriseDAO;
	// StaticBottomriseBo
	
	public List<StaticBottomriseBO> getStaticBottomriseDetails() {
		List<StaticBottomriseBO> inputlist = staticBottomriseDAO.getStaticBottomriseDetails();
		int i = 1;
		for (StaticBottomriseBO staticBottomriseBO : inputlist) {
			staticBottomriseBO.setSlNumber(i);
			i++;
		}

		return inputlist;
		
		
	}
	
	public Boolean insertStaticBottomriseDetails(StaticBottomriseBO staticBottomriseBO) {

		return staticBottomriseDAO.insertStaticBottomriseDetails(staticBottomriseBO);
	}
	
	public Boolean updateStaticBottomriseDetails(StaticBottomriseBO staticBottomriseBO) {

		return staticBottomriseDAO.updateStaticBottomriseDetails(staticBottomriseBO);
	}
	
	public Boolean deleteStaticBottomriseDetails(StaticBottomriseBO staticBottomriseBO) {

		return staticBottomriseDAO.deleteStaticBottomriseDetails(staticBottomriseBO);
	}

}
