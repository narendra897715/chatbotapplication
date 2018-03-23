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
import com.merilytics.bo.StaticSeasonBO;

@Configuration
public class StaticSeasonDAO {

	// StaticSeasonBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;
	
	@Autowired
	private DatabaseDAO databaseDAO;

	@SuppressWarnings("unchecked")
	public List<StaticSeasonBO> getStaticSeasonDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticSeasonBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticSeasonBO>) authenticationTemplete.findByCriteria(dc);
	}
	@Transactional
	public Boolean insertStaticSeasonDetails(StaticSeasonBO staticSeasonBO) {
		try {
			staticSeasonBO.setStatus(true);
			authenticationTemplete.save(staticSeasonBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	@Transactional
	public Boolean updateStaticSeasonDetails(StaticSeasonBO staticSeasonBO) {
		try {
			staticSeasonBO.setStatus(true);
			authenticationTemplete.update(staticSeasonBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	@Transactional
	public Boolean deleteStaticSeasonDetails(StaticSeasonBO staticSeasonBO) {
		try {
			authenticationTemplete.delete(staticSeasonBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
