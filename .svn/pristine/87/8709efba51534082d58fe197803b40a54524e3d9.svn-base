package com.merilytics.model;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaiticCategoryBO;
import com.merilytics.bo.StaticColorvariantBO;
import com.merilytics.dao.StaticColorvariantDAO;

@Configuration
public class StaticColorvariantModel {

	@Resource
	private StaticColorvariantDAO staticColorvariant;

	public List<StaticColorvariantBO> getStaticColorvariantDetails(Integer family) {

		return staticColorvariant.getStaticColorvariantDetails(family);

	}

	public Boolean insertStaticColorvariantDetails(StaticColorvariantBO StaticColorvariantBO) {

		return staticColorvariant.insertStaticColorvariantDetails(StaticColorvariantBO);
	}

	public Boolean updateStaticColorvariantDetails(StaticColorvariantBO staticColorvariantBO) {

		return staticColorvariant.updateStaticColorvariantDetails(staticColorvariantBO);
	}

	public Boolean deleteStaticColorvariantDetails(StaticColorvariantBO staticColorvariantBO) {

		return staticColorvariant.deleteStaticColorvariantDetails(staticColorvariantBO);
	}

	public List<Map<String, Object>> getColourVarient() {

		return staticColorvariant.getColourVarient();

	}
	
	public List<Map<String, Object>> getShade() {

		return staticColorvariant.getShade();

	}

}
