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
import com.merilytics.bo.StaticOccasionBO;

@Configuration
public class StaticOccasionDAO {

	// StaticOccasionBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;
	
	@Autowired
	private DatabaseDAO databaseDAO;

	@SuppressWarnings("unchecked")
	public List<StaticOccasionBO> getStaticOccasionDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticOccasionBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticOccasionBO>) authenticationTemplete.findByCriteria(dc);
	}
	@Transactional
	public Boolean insertStaticOccasionDetails(StaticOccasionBO staticOccasionBO) {
		try {
			staticOccasionBO.setStatus(true);
			authenticationTemplete.save(staticOccasionBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	@Transactional
	public Boolean updateStaticOccasionDetails(StaticOccasionBO staticOccasionBO) {
		try {
			staticOccasionBO.setStatus(true);
			authenticationTemplete.update(staticOccasionBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	

	@Transactional
	public Boolean deleteStaticOccasionDetails(StaticOccasionBO staticOccasionBO) {
		try {
			authenticationTemplete.delete(staticOccasionBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
