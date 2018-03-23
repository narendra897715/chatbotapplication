package com.merilytics.model;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.StaticShopifySizeBO;
import com.merilytics.dao.StaticShopifySizeDAO;

@Configuration
public class StaticShopifySizeModel {

	@Resource
	private StaticShopifySizeDAO staticShopifySizeDAO;

	public List<StaticShopifySizeBO> getStaticNoSizeDetails(Integer pkSizeID) {

		return staticShopifySizeDAO.getStaticSizeDetails(pkSizeID);
	}

	public List<Map<String, Object>> getStaticShopifySizeDetailsDatabase() {

		return staticShopifySizeDAO.getStaticShopifySizeDetailsDatabase();
	}

	public Boolean insertStaticSizeBODetails(StaticShopifySizeBO staiticCategoryBO) {

		return staticShopifySizeDAO.insertStaticSizeBODetails(staiticCategoryBO);
	}

	public Boolean updateStaticSizeBODetails(StaticShopifySizeBO staiticCategoryBO) {

		return staticShopifySizeDAO.updateStaticSizeBODetails(staiticCategoryBO);
	}

	public Boolean deleteStaticSizeBODetails(StaticShopifySizeBO staiticCategoryBO) {

		return staticShopifySizeDAO.deleteStaticSizeBODetails(staiticCategoryBO);
	}

}
