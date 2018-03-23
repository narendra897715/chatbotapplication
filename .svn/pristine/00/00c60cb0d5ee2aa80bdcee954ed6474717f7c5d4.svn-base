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
import com.merilytics.bo.StaticFabricationBO;

@Configuration
public class StaticFabricationDAO {

	// StaticFabricationBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;

	@Autowired
	private DatabaseDAO databaseDAO;

	@SuppressWarnings("unchecked")
	public List<StaticFabricationBO> getStaticFabricationDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticFabricationBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticFabricationBO>) authenticationTemplete.findByCriteria(dc);
	}

	@Transactional
	public Boolean insertStaticFabricationDetails(StaticFabricationBO staticFabricationBO) {
		try {
			staticFabricationBO.setStatus(true);
			authenticationTemplete.save(staticFabricationBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Boolean updateStaticFabricationDetails(StaticFabricationBO staticFabricationBO) {
		try {
			staticFabricationBO.setStatus(true);
			authenticationTemplete.update(staticFabricationBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Boolean deleteStaticFabricationDetails(StaticFabricationBO staticFabricationBO) {
		try {
			authenticationTemplete.delete(staticFabricationBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
