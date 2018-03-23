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
import com.merilytics.bo.StaticScaleBO;

@Configuration
public class StaticScaleDAO {

	// StaticScaleBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;
	
	
	@Autowired
	private DatabaseDAO databaseDAO;

	@SuppressWarnings("unchecked")
	public List<StaticScaleBO> getStaticScaleDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticScaleBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticScaleBO>) authenticationTemplete.findByCriteria(dc);
	}
	
	@Transactional
	public Boolean insertStaticScaleDetails(StaticScaleBO staticScaleBO) {
		try {
			staticScaleBO.setStatus(true);
			authenticationTemplete.save(staticScaleBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	@Transactional
	public Boolean updateStaticScaleDetails(StaticScaleBO staticScaleBO) {
		try {
			staticScaleBO.setStatus(true);
			authenticationTemplete.update(staticScaleBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	@Transactional
	public Boolean deleteStaticScaleDetails(StaticScaleBO staticScaleBO) {
		try {
			authenticationTemplete.delete(staticScaleBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}


}
