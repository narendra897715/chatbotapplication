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
import com.merilytics.bo.StaticFabrictypeBO;

@Configuration
public class StaticFabricTypeDAO {

	// StaticFabricationBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;
	
	@Autowired
	private DatabaseDAO databaseDAO;

	@SuppressWarnings("unchecked")
	public List<StaticFabrictypeBO> getStaticFabrictypeDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticFabrictypeBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticFabrictypeBO>) authenticationTemplete.findByCriteria(dc);
	}
	@Transactional
	public Boolean insertStaticFabrictypeDetails(StaticFabrictypeBO staticFabrictypeBO) {
		try {
			staticFabrictypeBO.setStatus(true);
			authenticationTemplete.save(staticFabrictypeBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional
	public Boolean updateStaticFabrictypeDetails(StaticFabrictypeBO staticFabrictypeBO) {
		try {
			staticFabrictypeBO.setStatus(true);
			authenticationTemplete.update(staticFabrictypeBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	

	@Transactional
	public Boolean deleteStaticFabrictypeDetails(StaticFabrictypeBO staticFabrictypeBO) {
		try {
			authenticationTemplete.delete(staticFabrictypeBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
