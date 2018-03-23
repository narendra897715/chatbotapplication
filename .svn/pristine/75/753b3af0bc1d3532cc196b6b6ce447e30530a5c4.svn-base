package com.merilytics.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaticMonthBO;
import com.merilytics.dao.StaticMonthDAO;

@Configuration
public class StaticMonthModel {

	@Resource
	private StaticMonthDAO staticMonthDAO;

	public List<StaticMonthBO> getStaticMonth() {

		List<StaticMonthBO> inputlist = staticMonthDAO.getStaticMonth();
		int i = 1;
		for (StaticMonthBO staticMonthBO : inputlist) {
			staticMonthBO.setSlNumber(i);
			i++;
		}

		return inputlist;

	}

}
