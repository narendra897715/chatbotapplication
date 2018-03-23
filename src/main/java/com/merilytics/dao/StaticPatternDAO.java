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
import com.merilytics.bo.StaticPatternBO;

@Configuration
public class StaticPatternDAO {

	// StaticPatternBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;
	
	
	@Autowired
	private DatabaseDAO databaseDAO;

	@SuppressWarnings("unchecked")
	public List<StaticPatternBO> getStaticPatternDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticPatternBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticPatternBO>) authenticationTemplete.findByCriteria(dc);
	}
	@Transactional
	public Boolean insertStaticPatternDetails(StaticPatternBO staticPatternBO) {
		try {
			staticPatternBO.setStatus(true);
			authenticationTemplete.save(staticPatternBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional
	public Boolean updateStaticPatternDetails(StaticPatternBO staticPatternBO) {
		try {
			staticPatternBO.setStatus(true);
			authenticationTemplete.update(staticPatternBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional
	public Boolean deleteStaticPatternDetails(StaticPatternBO staticPatternBO) {
		try {
			authenticationTemplete.delete(staticPatternBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	

}
