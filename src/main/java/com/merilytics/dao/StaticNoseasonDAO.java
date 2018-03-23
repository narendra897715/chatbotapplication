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
import com.merilytics.bo.StaticNoseasonBO;

@Configuration
public class StaticNoseasonDAO {
	
	// StaticNoseasonBO
	
	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;
	
	@Autowired
	private DatabaseDAO databaseDAO;
	
	
	@SuppressWarnings("unchecked")
	public List<StaticNoseasonBO> getStaticNoseasonDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticNoseasonBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticNoseasonBO>) authenticationTemplete.findByCriteria(dc);
	}
	
	@Transactional
	public Boolean insertStaticNoseasonDetails(StaticNoseasonBO staticNoseasonBO) {
		try {
			staticNoseasonBO.setStatus(true);
			authenticationTemplete.save(staticNoseasonBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	@Transactional
	public Boolean updateStaticCategoryDetails(StaticNoseasonBO staticNoseasonBO) {
		try {
			staticNoseasonBO.setStatus(true);
			authenticationTemplete.update(staticNoseasonBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	@Transactional
	public Boolean deleteStaticNoseasonDetails(StaticNoseasonBO staticNoseasonBO) {
		try {
			authenticationTemplete.delete(staticNoseasonBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
}
