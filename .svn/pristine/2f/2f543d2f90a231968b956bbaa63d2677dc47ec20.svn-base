package com.merilytics.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.merilytics.bo.StaiticCategoryBO;
import com.merilytics.bo.StaticFashionPyramidBO;

@Configuration
public class StaticFashionPyramidDAO {

	// StaticFashionPyramidBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;

	@Autowired
	private DatabaseDAO databaseDAO;

	@SuppressWarnings("unchecked")
	public List<StaticFashionPyramidBO> getStaticFashionPyramidDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticFashionPyramidBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticFashionPyramidBO>) authenticationTemplete.findByCriteria(dc);
	}

	@Transactional
	public Boolean insertStaticFashionPyramidDetails(StaticFashionPyramidBO staticFashionPyramidBO) {
		try {
			staticFashionPyramidBO.setStatus(true);
			authenticationTemplete.save(staticFashionPyramidBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Boolean updateStaticFashionPyramidDetails(StaticFashionPyramidBO staticFashionPyramidBO) {
		try {
			staticFashionPyramidBO.setStatus(true);
			authenticationTemplete.update(staticFashionPyramidBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Boolean deleteStaticFashionPyramidDetails(StaticFashionPyramidBO staticFashionPyramidBO) {
		try {
			authenticationTemplete.delete(staticFashionPyramidBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
