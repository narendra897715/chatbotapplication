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

@Configuration
public class StaiticCategoryDAO {

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;

	@Autowired
	private DatabaseDAO databaseDAO;

	@SuppressWarnings("unchecked")
	public List<StaiticCategoryBO> getStaiticCategoryDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaiticCategoryBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaiticCategoryBO>) authenticationTemplete.findByCriteria(dc);
	}

	@Transactional
	public Boolean insertstaiticCategoryDetails(StaiticCategoryBO staiticCategoryBO) {
		try {
			staiticCategoryBO.setStatus(true);
			authenticationTemplete.save(staiticCategoryBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Boolean updateStaticCategoryDetails(StaiticCategoryBO staiticCategoryBO) {
		try {
			staiticCategoryBO.setStatus(true);
			authenticationTemplete.update(staiticCategoryBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Boolean deleteStaticCategoryDetails(StaiticCategoryBO staiticCategoryBO) {
		try {

			authenticationTemplete.delete(staiticCategoryBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
