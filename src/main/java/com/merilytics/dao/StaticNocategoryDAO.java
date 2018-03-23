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
import com.merilytics.bo.StaticNocategoryBO;

@Configuration
public class StaticNocategoryDAO {

	// StaticNocategoryBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;
	
	@Autowired
	private DatabaseDAO databaseDAO;

	@SuppressWarnings("unchecked")
	public List<StaticNocategoryBO> getStaticNocategoryDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticNocategoryBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticNocategoryBO>) authenticationTemplete.findByCriteria(dc);
	}
	
	@Transactional
	public Boolean insertStaticNocategoryDetails(StaticNocategoryBO staticNocategoryBO) {
		try {
			staticNocategoryBO.setStatus(true);
			authenticationTemplete.save(staticNocategoryBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional
	public Boolean updateStaticNocategoryDetails(StaticNocategoryBO staticNocategoryBO) {
		try {
			staticNocategoryBO.setStatus(true);
			authenticationTemplete.update(staticNocategoryBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	

	@Transactional
	public Boolean deleteStaticNocategoryDetails(StaticNocategoryBO staticNocategoryBO) {
		try {
			authenticationTemplete.delete(staticNocategoryBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	

}
