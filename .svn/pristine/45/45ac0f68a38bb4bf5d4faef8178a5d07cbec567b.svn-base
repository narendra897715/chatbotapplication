package com.merilytics.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.merilytics.bo.StaiticCategoryBO;
import com.merilytics.bo.StaticSubCategoryBO;

@Configuration
public class StaticSubCategoryDAO {

	// StaticSubCategoryBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;

	@Autowired
	private DatabaseDAO databaseDAO;

	public List<Map<String, Object>> getSubCategoryDetailsDatabase() {

		return databaseDAO.executeStoredProc(" call getsubCategory();");

	}

	@SuppressWarnings("unchecked")
	public List<StaticSubCategoryBO> getStaticSubCategoryDetails(Integer category) {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticSubCategoryBO.class);
		dc.add(Restrictions.eq("pkCategoryID", category));
		dc.add(Restrictions.eq("status", true));
		return (List<StaticSubCategoryBO>) authenticationTemplete.findByCriteria(dc);
	}

	@Transactional
	public Boolean insertStaticSubCategoryDetails(StaticSubCategoryBO staticSubCategoryBO) {
		try {
			staticSubCategoryBO.setStatus(true);
			authenticationTemplete.save(staticSubCategoryBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Boolean updateStaticSubCategoryDetails(StaticSubCategoryBO staticSubCategoryBO) {
		try {
			staticSubCategoryBO.setStatus(true);
			authenticationTemplete.update(staticSubCategoryBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Boolean deleteStaticSubCategoryDetails(StaticSubCategoryBO staticSubCategoryBO) {
		try {
			authenticationTemplete.delete(staticSubCategoryBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
