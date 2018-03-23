package com.merilytics.model;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaticNocategoryCodeBO;
import com.merilytics.dao.StaticNocategoryCodeDAO;

@Configuration
public class StaticNocategoryCodeModel {

	@Resource
	private StaticNocategoryCodeDAO staticNocategoryCodeDAO;

	public List<StaticNocategoryCodeBO> getStaticNocategoryDetails(Integer nOCategoryID) {

		List<StaticNocategoryCodeBO> lisyt = staticNocategoryCodeDAO.getStaticNocategoryCodeDetails(nOCategoryID);

		int i = 1;
		for (StaticNocategoryCodeBO staticMonthBO : lisyt) {
			staticMonthBO.setSlNumber(i);
			i++;
		}

		return lisyt;

	}

	public Boolean insertStaticNocategoryCodeDetails(StaticNocategoryCodeBO staticNocategoryCodeBO) {

		return staticNocategoryCodeDAO.insertStaticNocategoryCodeDetails(staticNocategoryCodeBO);
	}

	public Boolean updateStaticNocategoryCodeDetails(StaticNocategoryCodeBO StaticNocategoryCodeBO) {

		return staticNocategoryCodeDAO.updateStaticNocategoryCodeDetails(StaticNocategoryCodeBO);
	}

	public Boolean deleteStaticNocategoryCodeDetails(StaticNocategoryCodeBO staticNocategoryCodeBO) {

		return staticNocategoryCodeDAO.deleteStaticNocategoryCodeDetails(staticNocategoryCodeBO);
	}

	public List<Map<String, Object>> getNocategoryCode() {

		return staticNocategoryCodeDAO.getNocategoryCode();

	}

}
