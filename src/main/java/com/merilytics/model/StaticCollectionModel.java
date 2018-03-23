package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaiticCategoryBO;
import com.merilytics.bo.StaticCollectionBO;
import com.merilytics.bo.StaticMonthBO;
import com.merilytics.dao.StaticCollectionDAO;

@Configuration
public class StaticCollectionModel {
	
	@Resource
	private StaticCollectionDAO staticCollectionDAO;
	// StaticBottomriseBo

	public List<StaticCollectionBO> getStaticCollectionDetails() {
		List<StaticCollectionBO> inputlist = staticCollectionDAO.getStaticCollectionDetails();
		int i = 1;
		for (StaticCollectionBO staticCollectionBO : inputlist) {
			staticCollectionBO.setSlNumber(i);
			i++;
		}

		return inputlist;
		
	}
	public Boolean insertStaticCollectionDetails(StaticCollectionBO staticCollectionBO) {

		return staticCollectionDAO.insertStaticCollectionDetails(staticCollectionBO);
	}
	public Boolean updateStaticCollectionDetails(StaticCollectionBO staticCollectionBO) {

		return staticCollectionDAO.updateStaticCollectionDetails(staticCollectionBO);
	}
	public Boolean deleteStaticCollectionDetails(StaticCollectionBO staticCollectionBO) {

		return staticCollectionDAO.deleteStaticCollectionDetails(staticCollectionBO);
	}

}
