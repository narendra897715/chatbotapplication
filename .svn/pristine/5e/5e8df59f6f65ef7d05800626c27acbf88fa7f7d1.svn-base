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
import com.merilytics.bo.StaticProductStyleBO;

@Configuration
public class StaticProductStyleDAO {

	// StaticProductStyleBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;
	
	@Autowired
	private DatabaseDAO databaseDAO;

	@SuppressWarnings("unchecked")
	public List<StaticProductStyleBO> getStaticProductStyleDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticProductStyleBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticProductStyleBO>) authenticationTemplete.findByCriteria(dc);
	}
	@Transactional
	public Boolean insertStaticProductStyleDetails(StaticProductStyleBO staticProductStyleBO) {
		try {
			staticProductStyleBO.setStatus(true);
			authenticationTemplete.save(staticProductStyleBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional
	public Boolean updateStaticProductStyleDetails(StaticProductStyleBO staticProductStyleBO) {
		try {
			staticProductStyleBO.setStatus(true);
			authenticationTemplete.update(staticProductStyleBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	@Transactional
	public Boolean deleteStaticProductStyleDetails(StaticProductStyleBO staticProductStyleBO) {
		try {
			authenticationTemplete.delete(staticProductStyleBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
