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
import com.merilytics.bo.StaticProductTypeBO;

@Configuration
public class StaticProductTypeDAO {

	// StaticProductStyleBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;
	
	@Autowired
	private DatabaseDAO databaseDAO;

	@SuppressWarnings("unchecked")
	public List<StaticProductTypeBO> getStaticStaticProductTypeDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticProductTypeBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticProductTypeBO>) authenticationTemplete.findByCriteria(dc);
	}
	@Transactional
	public Boolean insertStaticStaticProductTypeDetails(StaticProductTypeBO staticProductTypeBO) {
		try {
			staticProductTypeBO.setStatus(true);
			authenticationTemplete.save(staticProductTypeBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	@Transactional
	public Boolean updateStaticStaticProductTypeDetails(StaticProductTypeBO staticProductTypeBO) {
		try {
			staticProductTypeBO.setStatus(true);
			authenticationTemplete.update(staticProductTypeBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	@Transactional
	public Boolean deleteStaticStaticProductTypeDetails(StaticProductTypeBO staticProductTypeBO) {
		try {
			authenticationTemplete.delete(staticProductTypeBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}


}
